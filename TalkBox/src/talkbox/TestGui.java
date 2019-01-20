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

public class TestGui {

	private JFrame frmTalkbox;

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
		frmTalkbox.getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton btnAudio1 = new JButton("Audio 1");
		btnAudio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					String filename = "C:/Users/Dion/Desktop/Voice_Recorder/voice_recording_2.wav";
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
		});
		panel.add(btnAudio1);
		
		JButton btnAudio2 = new JButton("Audio 2");
		btnAudio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					String filename = "C:/Users/Dion/Desktop/Voice_Recorder/voice_recording_2.wav";
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
		});
		panel.add(btnAudio2);
	}

}
