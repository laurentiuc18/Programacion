package Ejercicio0;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class miVentana extends JFrame {

	private JPanel contentPane;
	private JLabel lblmiEqtiqueta;
	private JTextField textSi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					miVentana frame = new miVentana();
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
	public miVentana() {
		setTitle("Mi Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblmiEqtiqueta = new JLabel("Mi Etiqueta");
		lblmiEqtiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		lblmiEqtiqueta.setFont(new Font("Sylfaen", Font.BOLD, 18));
		lblmiEqtiqueta.setToolTipText("");
		lblmiEqtiqueta.setBounds(44, 11, 352, 33);
		contentPane.add(lblmiEqtiqueta);
		
		textSi = new JTextField();
		textSi.setFont(new Font("Unispace", Font.ITALIC, 11));
		textSi.setBounds(10, 55, 414, 195);
		contentPane.add(textSi);
		textSi.setColumns(10);
	}
}
