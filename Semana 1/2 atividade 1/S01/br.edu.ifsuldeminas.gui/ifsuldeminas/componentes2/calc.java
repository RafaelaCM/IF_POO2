package ifsuldeminas.componentes2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dimension;

public class calc {

	private JFrame frmNossaCalculadora;
	private JTextField textFieldResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNossaCalculadora = new JFrame();
		frmNossaCalculadora.setTitle("Nossa calculadora");
		frmNossaCalculadora.setMinimumSize(new Dimension(340, 496));
		frmNossaCalculadora.setBounds(100, 100, 340, 496);
		frmNossaCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNossaCalculadora.getContentPane().setLayout(new MigLayout("", "[30:30,grow][30:30,grow][30:30,grow][30:30,grow][30:30,grow]", "[60:60,grow][60:60,grow][60:60,grow][60:60,grow][60:60,grow][60:60,grow]"));
		
		textFieldResultado = new JTextField();
		textFieldResultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textFieldResultado.setEditable(false);
		textFieldResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldResultado.setText("0");
		frmNossaCalculadora.getContentPane().add(textFieldResultado, "cell 0 0 5 1,grow");
		textFieldResultado.setColumns(10);
		
		JButton btnDel = new JButton("Deletar");
		frmNossaCalculadora.getContentPane().add(btnDel, "cell 0 1 2 1,grow");
		
		JButton btnClean = new JButton("Limpar");
		frmNossaCalculadora.getContentPane().add(btnClean, "cell 2 1 3 1,grow");
		
		JButton btnSeven = new JButton("7");
		frmNossaCalculadora.getContentPane().add(btnSeven, "cell 0 2,grow");
		
		JButton btnEight = new JButton("8");
		frmNossaCalculadora.getContentPane().add(btnEight, "cell 1 2,grow");
		
		JButton btnNine = new JButton("9");
		frmNossaCalculadora.getContentPane().add(btnNine, "cell 2 2,grow");
		
		JButton btnDiv = new JButton("/");
		frmNossaCalculadora.getContentPane().add(btnDiv, "cell 3 2,grow");
		
		JButton btnOnediv = new JButton("1/x");
		frmNossaCalculadora.getContentPane().add(btnOnediv, "cell 4 2,grow");
		
		JButton btnFour = new JButton("4");
		frmNossaCalculadora.getContentPane().add(btnFour, "cell 0 3,grow");
		
		JButton btnFive = new JButton("5");
		frmNossaCalculadora.getContentPane().add(btnFive, "cell 1 3,grow");
		
		JButton btnSix = new JButton("6");
		frmNossaCalculadora.getContentPane().add(btnSix, "cell 2 3,grow");
		
		JButton btnMult = new JButton("*");
		frmNossaCalculadora.getContentPane().add(btnMult, "cell 3 3,grow");
		
		JButton btnSquare = new JButton("x\u00B2");
		frmNossaCalculadora.getContentPane().add(btnSquare, "cell 4 3,grow");
		
		JButton btnOne = new JButton("1");
		frmNossaCalculadora.getContentPane().add(btnOne, "cell 0 4,grow");
		
		JButton btnTwo = new JButton("2");
		frmNossaCalculadora.getContentPane().add(btnTwo, "cell 1 4,grow");
		
		JButton btnThre = new JButton("3");
		frmNossaCalculadora.getContentPane().add(btnThre, "cell 2 4,grow");
		
		JButton btnMinus = new JButton("-");
		frmNossaCalculadora.getContentPane().add(btnMinus, "cell 3 4,grow");
		
		JButton btn0 = new JButton("0");
		frmNossaCalculadora.getContentPane().add(btn0, "cell 0 5 2 1,grow");
		
		JButton btnComma = new JButton(",");
		frmNossaCalculadora.getContentPane().add(btnComma, "cell 2 5,grow");
		
		JButton btnPlus = new JButton("+");
		frmNossaCalculadora.getContentPane().add(btnPlus, "cell 3 5,grow");
		
		JButton btnNewButton_1 = new JButton("=");
		frmNossaCalculadora.getContentPane().add(btnNewButton_1, "cell 4 4 1 2,grow");
	}

}
