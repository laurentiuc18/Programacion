package Ejercici2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cumple extends JFrame {

	Cumples cump = new Cumples();
	

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDia;
	private JTextField textMes;
	private JTextField textAnyo;
	private JTextField textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cumple frame = new Cumple();
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
	public Cumple() {
		setTitle("Cumplea\u00F1os Felices");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(29, 47, 58, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDia.setBounds(29, 72, 58, 14);
		contentPane.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMes.setBounds(29, 97, 58, 14);
		contentPane.add(lblMes);
		
		JLabel lblAnyo = new JLabel("A\u00F1o");
		lblAnyo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAnyo.setBounds(29, 122, 58, 14);
		contentPane.add(lblAnyo);
		
		textNombre = new JTextField();
		textNombre.setBounds(97, 44, 232, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textDia = new JTextField();
		textDia.setColumns(10);
		textDia.setBounds(97, 69, 92, 20);
		contentPane.add(textDia);
		
		textMes = new JTextField();
		textMes.setColumns(10);
		textMes.setBounds(97, 94, 92, 20);
		contentPane.add(textMes);
		
		textAnyo = new JTextField();
		textAnyo.setColumns(10);
		textAnyo.setBounds(97, 119, 92, 20);
		contentPane.add(textAnyo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				cump.nombre=textNombre.getText();
				cump.dia=Integer.parseInt(textDia.getText());
				cump.mes=Integer.parseInt(textMes.getText());
				cump.anyo=Integer.parseInt(textAnyo.getText());
				
				textResultado.setText("Guardando a :" +cump.nombre+" Cumpleaños: "+ cump.dia+"/"+cump.mes+"/"+cump.anyo);
				
			}
		});
		btnGuardar.setBounds(157, 165, 112, 37);
		contentPane.add(btnGuardar);
		
		
		textResultado = new JTextField();
		textResultado.setBounds(10, 210, 414, 40);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
	}
}
