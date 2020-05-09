package Ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Imc extends JFrame {

	Double Kg;
	Double Cm;
	Double Res;
	String Palabra;
	private JPanel contentPane;
	private JTextField textMasa;
	private JTextField textCm;
	private JTextField textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imc frame = new Imc();
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
	public Imc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMasa = new JLabel("Masa (Kg)");
		lblMasa.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMasa.setBounds(37, 27, 62, 14);
		contentPane.add(lblMasa);

		JLabel lblEstatura = new JLabel("Estatura (cm)");
		lblEstatura.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstatura.setBounds(37, 96, 85, 14);
		contentPane.add(lblEstatura);

		textMasa = new JTextField();
		textMasa.setBounds(37, 52, 144, 20);
		contentPane.add(textMasa);
		textMasa.setColumns(10);

		textCm = new JTextField();
		textCm.setColumns(10);
		textCm.setBounds(37, 121, 144, 20);
		contentPane.add(textCm);

		JButton btnImc = new JButton("IMC");
		btnImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Kg = Double.parseDouble(textMasa.getText());
				Cm = Double.parseDouble(textCm.getText());
				Cm=Cm/100;
				Res = Kg / (Cm * Cm);

				if (Res < 18.5) {

					Palabra = "Peso insuficiente";
				}
				if (Res > 18.5 && Res< 24.9) {

					Palabra = "Peso normal";
				}
				if (Res > 24.9 && Res< 26.9) {

					Palabra = "Sobrepeso grado I";
				}
				if (Res > 26.9 && Res< 29.9) {

					Palabra = "Sobrepeso grado II";
				}
				if(Res> 29.9) {
					
					Palabra="Obesidad";
				}

				textResultado.setText("IMC calculado = " +Res+" tienes : " + Palabra);

			}
		});
		btnImc.setBounds(244, 120, 89, 23);
		contentPane.add(btnImc);

		textResultado = new JTextField();
		textResultado.setBackground(Color.DARK_GRAY);
		textResultado.setForeground(Color.WHITE);
		textResultado.setBounds(10, 199, 414, 51);
		contentPane.add(textResultado);
		textResultado.setColumns(10);

	}
}
