package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pomocni {

	private JFrame frame;
	private JLabel lblUnesi;
	private JTextField polje1;
	private JLabel lblPovrsinaJe;
	private JTextField poljeP;
	private JLabel lblZapreminaJe;
	private JTextField PoljeZ;
	private JButton btnPovrsina;
	private JButton btnZapremina;
	private JLabel lblUnesiBazu;
	private JTextField polje2;
	private JLabel lblUnesiOmotac;
	private JTextField polje3;
	
	PiVGeometrijskihTela o1 = new PiVGeometrijskihTela();

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pomocni window = new Pomocni();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pomocni() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
