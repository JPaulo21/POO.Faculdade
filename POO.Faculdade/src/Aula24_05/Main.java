package Aula24_05;

import java.awt.EventQueue;


public class Main {
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					FrameView frame = new FrameView();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
