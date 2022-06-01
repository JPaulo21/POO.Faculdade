package Aula31_05;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Frame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8509827209719777716L;
	private JTextField txtTurma;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtNota4;
	private JTextField txtNome;
	private ButtonGroup grpbtnTurno;

	public Frame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(690,485);
		setTitle("Calculo de média anual");
		setLocationRelativeTo(null);
		grpbtnTurno = new ButtonGroup();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblTitulo = new JLabel("Calcule a sua média");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridwidth = 8;
		gbc_lblTitulo.insets = new Insets(30, 0, 50, 0);
		gbc_lblTitulo.gridx = 0;
		gbc_lblTitulo.gridy = 0;
		getContentPane().add(lblTitulo, gbc_lblTitulo);
		
		JLabel lblNome = new JLabel("Nome:");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 20, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 1;
		getContentPane().add(lblNome, gbc_lblNome);
		
		txtNome = new JTextField();
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		gbc_txtNome.gridwidth = 6;
		gbc_txtNome.insets = new Insets(0, 0, 5, 5);
		gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNome.gridx = 1;
		gbc_txtNome.gridy = 1;
		getContentPane().add(txtNome, gbc_txtNome);
		txtNome.setColumns(10);
		
		JLabel lblTurma = new JLabel("Turma:");
		GridBagConstraints gbc_lblTurma = new GridBagConstraints();
		gbc_lblTurma.insets = new Insets(0, 20, 5, 5);
		gbc_lblTurma.anchor = GridBagConstraints.EAST;
		gbc_lblTurma.gridx = 0;
		gbc_lblTurma.gridy = 2;
		getContentPane().add(lblTurma, gbc_lblTurma);
		
		txtTurma = new JTextField();
		GridBagConstraints gbc_txtTurma = new GridBagConstraints();
		gbc_txtTurma.insets = new Insets(0, 0, 5, 5);
		gbc_txtTurma.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTurma.gridx = 1;
		gbc_txtTurma.gridy = 2;
		getContentPane().add(txtTurma, gbc_txtTurma);
		txtTurma.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Turno:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 2;
		getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JRadioButton rdbtnMatutino = new JRadioButton("Matutino");
		grpbtnTurno.add(rdbtnMatutino);
		GridBagConstraints gbc_rdbtnMatutino = new GridBagConstraints();
		gbc_rdbtnMatutino.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMatutino.gridx = 3;
		gbc_rdbtnMatutino.gridy = 2;
		getContentPane().add(rdbtnMatutino, gbc_rdbtnMatutino);
		
		JRadioButton rdbtnVespertino = new JRadioButton("Vespertino");
		grpbtnTurno.add(rdbtnVespertino);
		GridBagConstraints gbc_rdbtnVespertino = new GridBagConstraints();
		gbc_rdbtnVespertino.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnVespertino.gridx = 4;
		gbc_rdbtnVespertino.gridy = 2;
		getContentPane().add(rdbtnVespertino, gbc_rdbtnVespertino);
		
		JRadioButton rdbtnNoturno = new JRadioButton("Noturno");
		grpbtnTurno.add(rdbtnNoturno);
		GridBagConstraints gbc_rdbtnNoturno = new GridBagConstraints();
		gbc_rdbtnNoturno.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNoturno.gridx = 5;
		gbc_rdbtnNoturno.gridy = 2;
		getContentPane().add(rdbtnNoturno, gbc_rdbtnNoturno);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		GridBagConstraints gbc_lblNota1 = new GridBagConstraints();
		gbc_lblNota1.anchor = GridBagConstraints.EAST;
		gbc_lblNota1.insets = new Insets(0, 20, 5, 5);
		gbc_lblNota1.gridx = 0;
		gbc_lblNota1.gridy = 4;
		getContentPane().add(lblNota1, gbc_lblNota1);
		
		txtNota1 = new JTextField();
		GridBagConstraints gbc_txtNota1 = new GridBagConstraints();
		gbc_txtNota1.insets = new Insets(0, 0, 5, 5);
		gbc_txtNota1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNota1.gridx = 1;
		gbc_txtNota1.gridy = 4;
		getContentPane().add(txtNota1, gbc_txtNota1);
		txtNota1.setColumns(4);
		
		JLabel lblNewLabel_6 = new JLabel("Nota 2:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 2;
		gbc_lblNewLabel_6.gridy = 4;
		getContentPane().add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		txtNota2 = new JTextField();
		GridBagConstraints gbc_txtNota2 = new GridBagConstraints();
		gbc_txtNota2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNota2.insets = new Insets(0, 0, 5, 5);
		gbc_txtNota2.gridx = 3;
		gbc_txtNota2.gridy = 4;
		getContentPane().add(txtNota2, gbc_txtNota2);
		txtNota2.setColumns(4);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		GridBagConstraints gbc_lblNota3 = new GridBagConstraints();
		gbc_lblNota3.anchor = GridBagConstraints.EAST;
		gbc_lblNota3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNota3.gridx = 4;
		gbc_lblNota3.gridy = 4;
		getContentPane().add(lblNota3, gbc_lblNota3);
		
		txtNota3 = new JTextField();
		GridBagConstraints gbc_txtNota3 = new GridBagConstraints();
		gbc_txtNota3.insets = new Insets(0, 0, 5, 5);
		gbc_txtNota3.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNota3.gridx = 5;
		gbc_txtNota3.gridy = 4;
		getContentPane().add(txtNota3, gbc_txtNota3);
		txtNota3.setColumns(4);
		
		JLabel lblNota4 = new JLabel("Nota 4:");
		GridBagConstraints gbc_lblNota4 = new GridBagConstraints();
		gbc_lblNota4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNota4.gridx = 6;
		gbc_lblNota4.gridy = 4;
		getContentPane().add(lblNota4, gbc_lblNota4);
		
		txtNota4 = new JTextField();
		GridBagConstraints gbc_txtNota4 = new GridBagConstraints();
		gbc_txtNota4.insets = new Insets(0, 0, 5, 20);
		gbc_txtNota4.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNota4.gridx = 7;
		gbc_txtNota4.gridy = 4;
		getContentPane().add(txtNota4, gbc_txtNota4);
		txtNota4.setColumns(4);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(txtNota1.getText().isEmpty() || txtNota2.getText().isEmpty()  || txtNota3.getText().isEmpty()  || txtNota4.getText().isEmpty() ) {
				
					JOptionPane.showMessageDialog(null, "Notas Inválidas");

				
				} else {
					
					double nota1 = Integer.parseInt(txtNota1.getText());
					double nota2 = Integer.parseInt(txtNota2.getText());
					double nota3 = Integer.parseInt(txtNota2.getText());
					double nota4 = Integer.parseInt(txtNota4.getText());
					
					double resultado = (nota1+nota2+nota3+nota4)/4;
					
					String sresultado = "";
					String turno = "";
					
					if(resultado >= 7 && resultado <= 10) {
						
						sresultado = "Aprovado";
					} 
					else if (resultado < 7 && resultado >= 0){
						
						sresultado = "Reprovado";
					} else {};
					
					
					if(rdbtnMatutino.isSelected() == true) {		
						turno = rdbtnMatutino.getText();
						
					} else if(rdbtnVespertino.isSelected() == true) {
						turno = rdbtnVespertino.getText();
						
					} else if(rdbtnNoturno.isSelected() == true) {
						turno = rdbtnNoturno.getText();
						
					} else {};
					
					
					String msg = "Aluno: "+txtNome.getText()+"\nTurma: "+txtTurma.getText()+"\nTurno: "+turno
							+"\nMédia da Nota: "+resultado+"\nSituação: "+sresultado;
					
					JOptionPane.showMessageDialog(null, msg);
					
					txtTurma.setText(null);
					txtNota1.setText(null);
					txtNota2.setText(null);
					txtNota3.setText(null);
					txtNota4.setText(null);
					txtNome.setText(null);
					
				} 			
				
			}
		});
		GridBagConstraints gbc_btnCalcular = new GridBagConstraints();
		gbc_btnCalcular.insets = new Insets(20, 0, 0, 0);
		gbc_btnCalcular.anchor = GridBagConstraints.NORTH;
		gbc_btnCalcular.gridwidth = 8;
		gbc_btnCalcular.gridx = 0;
		gbc_btnCalcular.gridy = 5;
		getContentPane().add(btnCalcular, gbc_btnCalcular);
		
		
		
		
	}
	
}
