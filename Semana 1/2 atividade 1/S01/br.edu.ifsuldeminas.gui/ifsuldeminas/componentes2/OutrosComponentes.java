package ifsuldeminas.componentes2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;

public class OutrosComponentes {

	private JFrame frmMaisComponetesSwing;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OutrosComponentes window = new OutrosComponentes();
					window.frmMaisComponetesSwing.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OutrosComponentes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMaisComponetesSwing = new JFrame();
		frmMaisComponetesSwing.setTitle("Mais componetes swing");
		frmMaisComponetesSwing.setBounds(100, 100, 450, 300);
		frmMaisComponetesSwing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMaisComponetesSwing.getContentPane().setLayout(new BoxLayout(frmMaisComponetesSwing.getContentPane(), BoxLayout.X_AXIS));
	}

}
