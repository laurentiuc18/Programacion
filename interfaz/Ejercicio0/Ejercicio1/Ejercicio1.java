package Ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField textCampo1;
	private JTextField textCampo2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCampo1 = new JTextField();
		textCampo1.setBounds(31, 109, 86, 20);
		contentPane.add(textCampo1);
		textCampo1.setColumns(10);
		
		textCampo2 = new JTextField();
		textCampo2.setBounds(315, 109, 86, 20);
		contentPane.add(textCampo2);
		textCampo2.setColumns(10);
		
		JButton btnBoton1 = new JButton("Boton1");
		btnBoton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCampo1.setText(textCampo2.getText());
				textCampo2.setText("");
			}
		});
		btnBoton1.setBounds(170, 32, 89, 23);
		contentPane.add(btnBoton1);

		
		
		JButton btnBoton2 = new JButton("Boton2");
		btnBoton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCampo2.setText(textCampo1.getText());
				textCampo1.setText("");
			}
		});
		btnBoton2.setBounds(170, 194, 89, 23);
		contentPane.add(btnBoton2);
		
		
	}
}
