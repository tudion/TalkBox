package talkbox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class TalkBoxConfigurationApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TalkBoxConfigurationApp frame = new TalkBoxConfigurationApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TalkBoxConfigurationApp() {
		setTitle("TalkBox Configuration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblAudioFolderName = new JLabel("Choose the Audio Files folder");
		panel_1.add(lblAudioFolderName);
		
		JButton btnAudioFolder = new JButton("Upload");
		panel_1.add(btnAudioFolder);
		
		Panel panel_2 = new Panel();
		panel.add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea txtrInstructions1 = new JTextArea();
		txtrInstructions1.setEditable(false);
		txtrInstructions1.setBackground(SystemColor.control);
		txtrInstructions1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrInstructions1.setWrapStyleWord(true);
		txtrInstructions1.setLineWrap(true);
		txtrInstructions1.setText("To add a sentence, click \"Start Recording\" and ");
		panel_2.add(txtrInstructions1);
		
		JTextArea txtrInstructions2 = new JTextArea();
		txtrInstructions2.setEditable(false);
		txtrInstructions2.setBackground(SystemColor.control);
		txtrInstructions2.setLineWrap(true);
		txtrInstructions2.setWrapStyleWord(true);
		txtrInstructions2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrInstructions2.setText("when you're finished, Click \"Stop Recording\"");
		panel_2.add(txtrInstructions2);
		
		JButton btnStartRecord = new JButton("Start Recording");
		panel_2.add(btnStartRecord);
		
		JButton btnStopRecord = new JButton("Stop Recording");
		panel_2.add(btnStopRecord);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.SOUTH);
		
		JButton btnConfigure = new JButton("Configure");
		btnConfigure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_3.add(btnConfigure);
		
		JLabel lblNewLabel = new JLabel("Delete This label and put configure Buttons here");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Placeholder.");
		panel.add(lblNewLabel_1, BorderLayout.WEST);
	}
}
