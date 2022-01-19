package ifsuldeminas.s02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversaoEventos {

	private JFrame frame;
	private JTextField textFieldCelsius;
	private JTextField textFieldResultado;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversaoEventos window = new ConversaoEventos();
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
	public ConversaoEventos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 229);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("C to F DIVIDE BY 5, THEN MULTIPLY BY 9, THEN ADD 32");
		
		textFieldCelsius = new JTextField();
		textFieldCelsius.setColumns(10);
		
		JLabel lblCelsius = new JLabel("Digite Celsius");
		
		JLabel lblResultado = new JLabel("Fahrenheit");
		
		textFieldResultado = new JTextField();
		textFieldResultado.setEditable(false);
		textFieldResultado.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/* Recuperar o valor de JTextFielCelsius*/
				String celsius = textFieldCelsius.getText();
				if(celsius.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe o valor : ","Atenção",  JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				/*Fazer conversão de string para double*/
				double celsiusNumero = 0;
				
				try {
					celsiusNumero = Double.parseDouble(celsius);
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Digite apenas numeros","Atenção",  JOptionPane.ERROR_MESSAGE);
					textFieldCelsius.setText("0");
					return;
				}
				double resultado = (celsiusNumero/5) * 9 + 32; 
				String resultadofinal = String.valueOf(resultado);
				textFieldResultado.setText(resultadofinal);
				
				/*Mostrar resultado na caixa de baixo*/
				
				//textFieldResultado.setText
				
				
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldCelsius, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addComponent(lblCelsius)
						.addComponent(lblResultado)
						.addComponent(textFieldResultado, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addComponent(btnCalcular, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(14)
					.addComponent(lblCelsius)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldCelsius, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblResultado)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldResultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addComponent(btnCalcular)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
