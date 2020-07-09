package soc.consulta.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class InterfaceIndex {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtPainelSoc;
	private JTextField txtNomePaciente;
	private JTextField txtCpfPaciente;
	private JTextField txtContatoPaciente;
	private JTextField txtEmailPaciente;
	private JTextField txtAnexarFoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceIndex window = new InterfaceIndex();
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
	public InterfaceIndex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtPainelSoc = new JTextField();
		txtPainelSoc.setEditable(false);
		txtPainelSoc.setText("Painel SOC");
		txtPainelSoc.setBounds(178, 0, 86, 20);
		frame.getContentPane().add(txtPainelSoc);
		txtPainelSoc.setColumns(10);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(0, 0, 434, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Pesquisar Paciente");
		btnNewButton.setBounds(102, 238, 162, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Nova Consulta");
		btnNewButton_1.setBounds(272, 238, 162, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		txtAnexarFoto = new JTextField();
		txtAnexarFoto.setEditable(false);
		txtAnexarFoto.setText("Anexar Foto");
		txtAnexarFoto.setBounds(33, 83, 67, 20);
		frame.getContentPane().add(txtAnexarFoto);
		txtAnexarFoto.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(10, 31, 110, 123);
		frame.getContentPane().add(textPane);
		
		txtNomePaciente = new JTextField();
		txtNomePaciente.setText("Nome Paciente");
		txtNomePaciente.setBounds(218, 42, 127, 20);
		frame.getContentPane().add(txtNomePaciente);
		txtNomePaciente.setColumns(10);
		
		txtCpfPaciente = new JTextField();
		txtCpfPaciente.setText("CPF Paciente");
		txtCpfPaciente.setBounds(218, 73, 127, 20);
		frame.getContentPane().add(txtCpfPaciente);
		txtCpfPaciente.setColumns(10);
		
		txtContatoPaciente = new JTextField();
		txtContatoPaciente.setText("Contato Paciente");
		txtContatoPaciente.setBounds(218, 104, 127, 20);
		frame.getContentPane().add(txtContatoPaciente);
		txtContatoPaciente.setColumns(10);
		
		txtEmailPaciente = new JTextField();
		txtEmailPaciente.setText("Email Paciente");
		txtEmailPaciente.setColumns(10);
		txtEmailPaciente.setBounds(218, 135, 127, 20);
		frame.getContentPane().add(txtEmailPaciente);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(240, 166, 89, 23);
		frame.getContentPane().add(btnCadastrar);
	}
}
