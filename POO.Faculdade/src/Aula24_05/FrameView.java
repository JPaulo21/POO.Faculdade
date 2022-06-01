package Aula24_05;

import javax.swing.JFrame;

public class FrameView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1228865417363971110L;
	
	public FrameView() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(720, 460);
		setTitle("Cadastro");
		setLocationRelativeTo(null);
		setContentPane(new CadastroView());

	}
}
