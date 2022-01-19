import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dimension;

public class Calculadora {

	private JFrame frmNossaCalculadora;
	private JTextField textFieldResuldado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmNossaCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNossaCalculadora = new JFrame();
		frmNossaCalculadora.setTitle("Calculadora");
		frmNossaCalculadora.setMinimumSize(new Dimension(367, 441));
		frmNossaCalculadora.setBounds(600, 300, 367, 441);
		frmNossaCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmNossaCalculadora.getContentPane().setLayout(new MigLayout("", "[30:30,grow][30:30,grow][30:30,grow][30:30,grow][30:30,grow]", "[60:60,grow][60:60,grow][60:60,grow][60:60,grow][60:60,grow][60:60,grow]"));
		
		textFieldResuldado = new JTextField();
		textFieldResuldado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textFieldResuldado.setEditable(false);
		textFieldResuldado.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldResuldado.setText("0");
		frmNossaCalculadora.getContentPane().add(textFieldResuldado, "cell 0 0 5 1,growx");
		textFieldResuldado.setColumns(10);
		
		JButton btnDeletar = new JButton("Deletar");
		frmNossaCalculadora.getContentPane().add(btnDeletar, "cell 0 1 2 1,grow");
		
		JButton btnLimpar = new JButton("Limpar");
		frmNossaCalculadora.getContentPane().add(btnLimpar, "cell 2 1 3 1,grow");
		
		JButton btn7 = new JButton("7");
		frmNossaCalculadora.getContentPane().add(btn7, "cell 0 2,grow");
		
		JButton btn8 = new JButton("8");
		frmNossaCalculadora.getContentPane().add(btn8, "cell 1 2,grow");
		
		JButton btn9 = new JButton("9");
		frmNossaCalculadora.getContentPane().add(btn9, "cell 2 2,grow");
		
		JButton btnOperadorDivisao = new JButton("/");
		frmNossaCalculadora.getContentPane().add(btnOperadorDivisao, "cell 3 2,grow");
		
		JButton btnOperadorElevaQuadrado = new JButton("x^2");
		frmNossaCalculadora.getContentPane().add(btnOperadorElevaQuadrado, "cell 4 2,grow");
		
		JButton btn4 = new JButton("4");
		frmNossaCalculadora.getContentPane().add(btn4, "cell 0 3,grow");
		
		JButton btn5 = new JButton("5");
		frmNossaCalculadora.getContentPane().add(btn5, "cell 1 3,grow");
		
		JButton btn6 = new JButton("6");
		frmNossaCalculadora.getContentPane().add(btn6, "cell 2 3,grow");
		
		JButton btnOperadorMultiplicacao = new JButton("*");
		frmNossaCalculadora.getContentPane().add(btnOperadorMultiplicacao, "cell 3 3,grow");
		
		JButton btnOperadorUmSobre = new JButton("1/x");
		frmNossaCalculadora.getContentPane().add(btnOperadorUmSobre, "cell 4 3,grow");
		
		JButton btn1 = new JButton("1");
		frmNossaCalculadora.getContentPane().add(btn1, "cell 0 4,grow");
		
		JButton btn2 = new JButton("2");
		frmNossaCalculadora.getContentPane().add(btn2, "cell 1 4,grow");
		
		JButton btn3 = new JButton("3");
		frmNossaCalculadora.getContentPane().add(btn3, "cell 2 4,grow");
		
		JButton btnOperadorSubtracao = new JButton("-");
		frmNossaCalculadora.getContentPane().add(btnOperadorSubtracao, "cell 3 4,grow");
		
		JButton btn0 = new JButton("0");
		frmNossaCalculadora.getContentPane().add(btn0, "cell 0 5 2 1,grow");
		
		JButton btnVirgula = new JButton(",");
		frmNossaCalculadora.getContentPane().add(btnVirgula, "cell 2 5,grow");
		
		JButton btnOperadorAdicao = new JButton("+");
		frmNossaCalculadora.getContentPane().add(btnOperadorAdicao, "flowx,cell 3 5,grow");
		
		JButton btnOperadorIgual = new JButton("=");
		frmNossaCalculadora.getContentPane().add(btnOperadorIgual, "cell 4 4 1 2,grow");
	}

}
