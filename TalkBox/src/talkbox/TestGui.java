package talkbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class TestGui {

	private JFrame frmTalkbox;
	private final String firstAudioName = "voice_recording_1.wav";
	private final String secondAudioName = "voice_recording_2.wav";
	private final String thirdAudioName = "voice_recording_3.wav";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGui window = new TestGui();
					window.frmTalkbox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTalkbox = new JFrame();
		frmTalkbox.setTitle("TalkBox V1.0");
		frmTalkbox.setBounds(100, 100, 450, 300);
		frmTalkbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmTalkbox.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnAudio1 = new JButton("Audio 1");
		btnAudio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				playSoundFile(System.getProperty("user.dir") + "/src/talkbox/AudioFiles/" + firstAudioName);
			}
		});
		panel.add(btnAudio1);
		
		JButton btnAudio2 = new JButton("Audio 2");
		btnAudio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				playSoundFile(System.getProperty("user.dir") + "/src/talkbox/AudioFiles/" + secondAudioName);
			}
		});
		panel.add(btnAudio2);
		
		JButton btnAudio3 = new JButton("Audio 3");
		btnAudio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				playSoundFile(System.getProperty("user.dir") + "/src/talkbox/AudioFiles/" + thirdAudioName);
			}
		});
		panel.add(btnAudio3);
		
	}
	
	private void playSoundFile (String filename) {
		try {
			// opens audio input stream
			File soundFile = new File(filename);
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);		
			// get a sound clip resource
			Clip clip = AudioSystem.getClip();
			clip.open(audioIn);
			clip.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}