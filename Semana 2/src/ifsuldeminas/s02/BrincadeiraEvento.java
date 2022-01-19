package ifsuldeminas.s02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BrincadeiraEvento {

	private JFrame frmCliqueEmMim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrincadeiraEvento window = new BrincadeiraEvento();
					window.frmCliqueEmMim.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BrincadeiraEvento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCliqueEmMim = new JFrame();
		frmCliqueEmMim.setBounds(100, 100, 600, 500);
		frmCliqueEmMim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnCliqueAqui = new JButton("Clique aqui");
		btnCliqueAqui.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println(btnCliqueAqui.getX() + " " + btnCliqueAqui.getY() + " " +frmCliqueEmMim.getWidth() + "  " + frmCliqueEmMim.getHeight());
				
				int posicaoAtualX = btnCliqueAqui.getX();
				int posicaoAtualY = btnCliqueAqui.getY();
				
				if(posicaoAtualX <= 50) {
					posicaoAtualX = frmCliqueEmMim.getWidth() - 180;
				}
				
				if(posicaoAtualY <= 50) {
					posicaoAtualY = frmCliqueEmMim.getHeight() - 120;
				}
				
				btnCliqueAqui.setLocation(posicaoAtualX-180, posicaoAtualY-120);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmCliqueEmMim.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(424, Short.MAX_VALUE)
					.addComponent(btnCliqueAqui)
					.addGap(118))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(371, Short.MAX_VALUE)
					.addComponent(btnCliqueAqui)
					.addGap(92))
		);
		frmCliqueEmMim.getContentPane().setLayout(groupLayout);
	}
}
