package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.Canvas;
import java.awt.Panel;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoggedUser {

	private JFrame frame;
	private JPanel panelNaranja;
	private JLabel lblX;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void LoggedUser() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoggedUser window = new LoggedUser();
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
	public LoggedUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		
		panelNaranja = new JPanel();
		panelNaranja.setBackground(new Color(186,79,84));
		panelNaranja.setBounds(224, 0, 426, 350);
		frame.getContentPane().add(panelNaranja);
		panelNaranja.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Usuario logueado con éxito!! BIENVENIDX");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(47, 132, 334, 43);
		panelNaranja.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setIcon(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBackground(new Color(192, 192, 192));
		separator.setBounds(61, 186, 307, 21);
		panelNaranja.add(separator);
		
		lblX = new JLabel("x");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblX.setHorizontalTextPosition(SwingConstants.CENTER);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(399, -8, 23, 32);
		panelNaranja.add(lblX);
		lblX.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblX.setBackground(new Color(74,31,61));
		
		JPanel panelMorado = new JPanel();
		panelMorado.setBackground(new Color(74,31,61)); //cambiar color background
		panelMorado.setBounds(0, 0, 226, 350);
		frame.getContentPane().add(panelMorado);
		panelMorado.setLayout(null);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(47, 64, 134, 147);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Uusuario.CRISTINA\\git\\SoftwarePatternMVC_DAO_Test\\Images\\server.png"));
		panelMorado.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("W E B    P R O J E C T");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_3.setForeground(new Color(186, 79, 84));
		lblNewLabel_3.setBounds(20, 222, 187, 58);
		panelMorado.add(lblNewLabel_3);
	}
	public JFrame getFrame() {
		return frame;
	}
}
