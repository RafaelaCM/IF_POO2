import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class MaisComponentes {

	private JFrame frmMaisComponentesSwing;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaisComponentes window = new MaisComponentes();
					window.frmMaisComponentesSwing.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MaisComponentes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMaisComponentesSwing = new JFrame();
		frmMaisComponentesSwing.setTitle("Mais componentes Swing");
		frmMaisComponentesSwing.setBounds(100, 100, 634, 457);
		frmMaisComponentesSwing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMaisComponentesSwing.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmMaisComponentesSwing.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Componentes básicos", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Teste do Label");
		lblNewLabel.setBounds(20, 32, 139, 16);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(20, 55, 567, 28);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Habilitar o JTextField");
		chckbxNewCheckBox.setBounds(20, 95, 195, 18);
		panel_1.add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Minas Gerais", "São Paulo", "Rio de Janeiro"}));
		comboBox.setBounds(17, 151, 553, 26);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione o estado");
		lblNewLabel_1.setBounds(20, 125, 245, 16);
		panel_1.add(lblNewLabel_1);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Azul", "Verde", "Vermelho"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(20, 212, 150, 92);
		panel_1.add(list);
		
		JLabel lblNewLabel_2 = new JLabel("Cor favorita");
		lblNewLabel_2.setBounds(20, 189, 150, 16);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Outros Componentes", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(18, 59, 574, 106);
		panel_2.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel_3 = new JLabel("Deixe seu comentário");
		lblNewLabel_3.setBounds(26, 40, 181, 16);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Selecione o sexo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(6, 185, 564, 107);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(16, 35, 115, 18);
		panel_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Feminio");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(16, 65, 115, 18);
		panel_3.add(rdbtnNewRadioButton_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 130, 1));
		spinner.setBounds(99, 317, 136, 28);
		panel_2.add(spinner);
		
		JLabel lblNewLabel_4 = new JLabel("Idade");
		lblNewLabel_4.setBounds(26, 323, 55, 16);
		panel_2.add(lblNewLabel_4);
		
		JMenuBar menuBar = new JMenuBar();
		frmMaisComponentesSwing.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Abrir");
		mntmNewMenuItem.setIcon(new ImageIcon(MaisComponentes.class.getResource("/img/add-folder16x16.png")));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Fechar");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Sair");
		mntmNewMenuItem_2.setIcon(null);
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Sobre");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Principal");
		mnNewMenu_1.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Item 1");
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Item 2");
		mnNewMenu_2.add(mntmNewMenuItem_4);
	}
}
