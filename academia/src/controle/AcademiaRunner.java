package controle;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class AcademiaRunner {

	private JFrame frame;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					AcademiaRunner window = new AcademiaRunner();
					window.frame.setVisible(true);

					Gerenciador gerenciador = new Gerenciador(window.frame);
					gerenciador.start();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AcademiaRunner() {
		this.initialize();
	}

	private void initialize() {
		this.frame = new JFrame("GYM Fitness Center");
		this.frame.setBounds(100, 100, 450, 300);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
