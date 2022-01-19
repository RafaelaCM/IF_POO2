package ifsuldeminas.s02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

public class AprendendoEventos {

	private JFrame frmMeuPrimeiroPrograma;
	private JTextField textFieldNome;
	private JLabel lblNome;
	private JLabel lblEndereco;
	private JTextField textFieldEndereco;
	private JLabel lblCidade;
	private JTextField textFieldCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AprendendoEventos window = new AprendendoEventos();
					window.frmMeuPrimeiroPrograma.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AprendendoEventos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMeuPrimeiroPrograma = new JFrame();
		frmMeuPrimeiroPrograma.setTitle("Meu primeiro programa com eventos");
		frmMeuPrimeiroPrograma.setBounds(100, 100, 450, 308);
		frmMeuPrimeiroPrograma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//tudo que está nesse trecho do código será executado quando o botão for clicado
				
				String nome = textFieldNome.getText();
				String endereco = textFieldEndereco.getText();
				String cidade = textFieldCidade.getText();
				
				JOptionPane.showConfirmDialog(null, "VOCE CLICOU NO BOTÃO:  " + nome + "\n" + endereco + "\n" + cidade);
			}
		});
		
		lblNome = new JLabel("Nome");
		
		lblEndereco = new JLabel("Endere\u00E7o");
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setText("");
		textFieldEndereco.setColumns(10);
		
		lblCidade = new JLabel("Cidade");
		
		textFieldCidade = new JTextField();
		textFieldCidade.setColumns(10);
		
		GroupLayout groupLayout = new GroupLayout(frmMeuPrimeiroPrograma.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textFieldCidade, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addComponent(textFieldEndereco, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldNome, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addComponent(lblNome, Alignment.LEADING)
						.addComponent(lblEndereco, Alignment.LEADING)
						.addComponent(lblCidade, Alignment.LEADING))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNome)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEndereco)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldEndereco, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCidade)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textFieldCidade, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		frmMeuPrimeiroPrograma.getContentPane().setLayout(groupLayout);
	}
}
