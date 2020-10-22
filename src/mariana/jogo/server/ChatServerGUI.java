package mariana.jogo.server;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class ChatServerGUI {

	private JFrame frame;
	private JTextField hostNameField;
	private JTextField serviceNameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatServerGUI window = new ChatServerGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChatServerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel chatPanel = new JPanel();
		frame.getContentPane().add(chatPanel, BorderLayout.EAST);
		GridBagLayout gbl_chatPanel = new GridBagLayout();
		gbl_chatPanel.columnWidths = new int[]{54, 86};
		gbl_chatPanel.rowHeights = new int[]{20, 0, 0};
		gbl_chatPanel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_chatPanel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		chatPanel.setLayout(gbl_chatPanel);
		
		JLabel lblServer = new JLabel("host name:");
		GridBagConstraints gbc_lblServer = new GridBagConstraints();
		gbc_lblServer.anchor = GridBagConstraints.WEST;
		gbc_lblServer.insets = new Insets(0, 0, 5, 5);
		gbc_lblServer.gridx = 0;
		gbc_lblServer.gridy = 0;
		chatPanel.add(lblServer, gbc_lblServer);
		
		hostNameField = new JTextField();
		GridBagConstraints gbc_hostNameField = new GridBagConstraints();
		gbc_hostNameField.anchor = GridBagConstraints.NORTHWEST;
		gbc_hostNameField.insets = new Insets(0, 0, 5, 5);
		gbc_hostNameField.gridx = 1;
		gbc_hostNameField.gridy = 0;
		chatPanel.add(hostNameField, gbc_hostNameField);
		hostNameField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Service Name");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		chatPanel.add(lblNewLabel, gbc_lblNewLabel);
		
		serviceNameField = new JTextField();
		GridBagConstraints gbc_serviceNameField = new GridBagConstraints();
		gbc_serviceNameField.anchor = GridBagConstraints.NORTH;
		gbc_serviceNameField.insets = new Insets(0, 0, 0, 5);
		gbc_serviceNameField.fill = GridBagConstraints.HORIZONTAL;
		gbc_serviceNameField.gridx = 1;
		gbc_serviceNameField.gridy = 1;
		chatPanel.add(serviceNameField, gbc_serviceNameField);
		serviceNameField.setColumns(10);
	}

}
