package Aula24_05;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class CadastroView extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7421242070273297879L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private ButtonGroup btngrpSexo;

	public CadastroView() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel pPessoa = new JPanel();
		pPessoa.setBorder(new TitledBorder(null, "Usu\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pPessoa.setLayout(null);
		GridBagConstraints gbc_pPessoa = new GridBagConstraints();
		gbc_pPessoa.insets = new Insets(20, 25, 20, 25);
		gbc_pPessoa.fill = GridBagConstraints.BOTH;
		gbc_pPessoa.gridx = 0;
		gbc_pPessoa.gridy = 0;
		add(pPessoa, gbc_pPessoa);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(48, 46, 46, 14);
		pPessoa.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(48, 85, 46, 14);
		pPessoa.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(117, 43, 426, 20);
		pPessoa.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 82, 127, 20);
		pPessoa.add(textField_1);
		textField_1.setColumns(14);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(161, 133, 109, 23);
		pPessoa.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(350, 133, 109, 23);
		pPessoa.add(rdbtnFeminino);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 25, 5, 25);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		add(panel, gbc_panel);
		
		JLabel lblEndereco = new JLabel("New label");
		lblEndereco.setBounds(35, 38, 46, 14);
		panel.add(lblEndereco);
		
		textField_2 = new JTextField();
		textField_2.setBounds(102, 35, 324, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNum = new JLabel("Nº");
		lblNum.setBounds(468, 38, 33, 14);
		panel.add(lblNum);
		
		textField_3 = new JTextField();
		textField_3.setBounds(511, 35, 74, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(35, 76, 46, 14);
		panel.add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(102, 73, 147, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(269, 76, 46, 14);
		panel.add(lblNewLabel_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(329, 73, 153, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(535, 72, 46, 22);
		panel.add(comboBox);
		
		JLabel lblUF = new JLabel("UF: ");
		lblUF.setBounds(492, 76, 33, 14);
		panel.add(lblUF);
		
		JButton btnNewButton = new JButton("New button");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 20, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 2;
		add(btnNewButton, gbc_btnNewButton);
	}
}
