package fomatodecampo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.ListSelectionModel;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JButton;

public class Formato {

	private JFrame frmFormatoDeCampo;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formato window = new Formato();
					window.frmFormatoDeCampo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Formato() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormatoDeCampo = new JFrame();
		frmFormatoDeCampo.setType(Type.UTILITY);
		frmFormatoDeCampo.setFont(new Font("Verdana", Font.PLAIN, 14));
		frmFormatoDeCampo.setTitle("Formato de Campo");
		frmFormatoDeCampo.setBounds(100, 100, 522, 472);
		frmFormatoDeCampo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormatoDeCampo.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmFormatoDeCampo.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Fomato", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Categoria");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 67, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Formato");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(145, 11, 61, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idioma");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(306, 11, 46, 14);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Portugu\u00EAs (Brasil)"}));
		comboBox.setBounds(305, 24, 170, 22);
		panel.add(comboBox);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"N\u00FAmero", "Porcentagem", "Moeda", "Data", "Hora", "Cient\u00EDfico", "Fra\u00E7\u00E3o", "Valor L\u00F3gico"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(10, 27, 92, 112);
		panel.add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(101, 24, 17, 115);
		panel.add(scrollBar);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"BRL R$ Portugu\u00EAs (Brasil)"}));
		comboBox_1.setBounds(145, 24, 136, 22);
		panel.add(comboBox_1);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"-R$ 1.234", "-R$ 1.234,00", "-R$ 1.234", "-R$ 1.234,--", "- 1.234,00 BRL"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setBounds(145, 46, 120, 93);
		panel.add(list_1);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(264, 46, 17, 93);
		panel.add(scrollBar_1);
		
		JLabel lblNewLabel_3 = new JLabel("Op\u00E7\u00F5es");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 150, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Casas decimais:");
		lblNewLabel_4.setBounds(10, 175, 108, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Zeros \u00E0 esquerda:");
		lblNewLabel_5.setBounds(10, 213, 92, 14);
		panel.add(lblNewLabel_5);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(145, 163, 39, 28);
		panel.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(145, 206, 39, 28);
		panel.add(spinner_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("N\u00FAmeros negativos em vermelho");
		rdbtnNewRadioButton.setBounds(205, 166, 193, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnSeparadorDeMilhares = new JRadioButton("Separador de milhares");
		rdbtnSeparadorDeMilhares.setBounds(205, 204, 193, 23);
		panel.add(rdbtnSeparadorDeMilhares);
		
		JLabel lblNewLabel_6 = new JLabel("C\u00F3digo do Formato");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(10, 254, 120, 14);
		panel.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(10, 276, 303, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		JToggleButton tglbtnV = new JToggleButton("V");
		tglbtnV.setBounds(323, 279, 46, 29);
		panel.add(tglbtnV);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("...");
		tglbtnNewToggleButton_2.setBounds(373, 279, 46, 29);
		panel.add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnX = new JToggleButton("X");
		tglbtnX.setBounds(429, 279, 46, 29);
		panel.add(tglbtnX);
		
		JButton btnNewButton = new JButton("Ajuda");
		btnNewButton.setBounds(10, 374, 91, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("OK");
		btnNewButton_1.setBounds(244, 374, 67, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Cancelar");
		btnNewButton_1_1.setBounds(323, 374, 81, 23);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("Redefinir");
		btnNewButton_2.setBounds(414, 374, 77, 23);
		panel.add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(306, 83, 169, 56);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Alinhamento", null, tabbedPane_1, null);
	}
}
