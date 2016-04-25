package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.parser.ParserDelegator;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class PiVTelaGUI extends JFrame {
	
	PiVGeometrijskihTela o1 = new PiVGeometrijskihTela();

	private JPanel contentPane;
	private JLabel lblUnesiteNazivTela;
	private JComboBox comboBox;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PiVTelaGUI frame = new PiVTelaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PiVTelaGUI() {
		setTitle("Povrsina i zapremina geometrijskih tela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUnesiteNazivTela());
		contentPane.add(getComboBox());
		contentPane.add(getLblUnesi());
		contentPane.add(getPolje1());
		contentPane.add(getLblPovrsinaJe());
		contentPane.add(getPoljeP());
		contentPane.add(getLblZapreminaJe());
		contentPane.add(getPoljeZ());
		contentPane.add(getBtnPovrsina());
		contentPane.add(getBtnZapremina());
		contentPane.add(getLblUnesiBazu());
		contentPane.add(getPolje2());
		contentPane.add(getLblUnesiOmotac());
		contentPane.add(getPolje3());
	}
	private JLabel getLblUnesiteNazivTela() {
		if (lblUnesiteNazivTela == null) {
			lblUnesiteNazivTela = new JLabel("Izaberite geometrijsko telo:");
			lblUnesiteNazivTela.setBounds(10, 11, 265, 48);
		}
		return lblUnesiteNazivTela;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kocka", "Kvadar", "Lopta", "Valjak", "Prizma", "Piramida"}));
			comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(comboBox.getSelectedItem().equals("Kocka")){
						lblUnesi.setText("Unesite duzinu ivice kocke: ");
						lblUnesi.setVisible(true);
						polje1.setVisible(true);
						
						btnPovrsina.setVisible(true);
						btnZapremina.setVisible(true);
						
						btnPovrsina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								
								String a = polje1.getText();
								double rez = Double.parseDouble(a);
							    double p = o1.povrsinaKocke(rez);
							    String rezultat = String.valueOf(p);
							    poljeP.setText(rezultat);
							    
							    lblPovrsinaJe.setVisible(true);
							    poljeP.setVisible(true);
								
								
							}
						});
						
						btnZapremina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								String a = polje1.getText();
								double rez = Double.parseDouble(a);
							    double p = o1.zapreminaKocke(rez);
							    String rezultat = String.valueOf(p);
							    PoljeZ.setText(rezultat);
							    
							    lblZapreminaJe.setVisible(true);
							    PoljeZ.setVisible(true);
							}
						});
					    
					}
					//........................................................................................
					
					if(comboBox.getSelectedItem().equals("Lopta")){
					
						lblUnesi.setVisible(true);
						polje1.setVisible(true);
						
						btnPovrsina.setVisible(true);
						btnZapremina.setVisible(true);
						
						btnPovrsina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								
								String a = polje1.getText();
								double rez = Double.parseDouble(a);
							    double p = o1.povrsinaLopte(rez);
							    String rezultat = String.valueOf(p);
							    poljeP.setText(rezultat);
							    
							    lblPovrsinaJe.setVisible(true);
							    poljeP.setVisible(true);
								
								
							}
						});
						
						btnZapremina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								String a = polje1.getText();
								double rez = Double.parseDouble(a);
							    double p = o1.zapreminaLopte(rez);
							    String rezultat = String.valueOf(p);
							    PoljeZ.setText(rezultat);
							    
							    lblZapreminaJe.setVisible(true);
							    PoljeZ.setVisible(true);
							}
						});
					}
				}
			});
			comboBox.setBounds(285, 21, 86, 29);
		}
		return comboBox;
	}
	private JLabel getLblUnesi() {
		if (lblUnesi == null) {
			lblUnesi = new JLabel("Unesi poluprecnik: ");
			lblUnesi.setVisible(false);
			lblUnesi.setBounds(10, 70, 247, 17);
		}
		return lblUnesi;
	}
	private JTextField getPolje1() {
		if (polje1 == null) {
			polje1 = new JTextField();
			polje1.setVisible(false);
			polje1.setBounds(316, 68, 86, 20);
			polje1.setColumns(10);
		}
		return polje1;
	}
	private JLabel getLblPovrsinaJe() {
		if (lblPovrsinaJe == null) {
			lblPovrsinaJe = new JLabel("Povrsina je: ");
			lblPovrsinaJe.setVisible(false);
			lblPovrsinaJe.setBounds(10, 199, 140, 14);
		}
		return lblPovrsinaJe;
	}
	private JTextField getPoljeP() {
		if (poljeP == null) {
			poljeP = new JTextField();
			poljeP.setVisible(false);
			poljeP.setBounds(316, 196, 86, 20);
			poljeP.setColumns(10);
		}
		return poljeP;
	}
	private JLabel getLblZapreminaJe() {
		if (lblZapreminaJe == null) {
			lblZapreminaJe = new JLabel("Zapremina je: ");
			lblZapreminaJe.setVisible(false);
			lblZapreminaJe.setBounds(10, 224, 140, 14);
		}
		return lblZapreminaJe;
	}
	private JTextField getPoljeZ() {
		if (PoljeZ == null) {
			PoljeZ = new JTextField();
			PoljeZ.setVisible(false);
			PoljeZ.setBounds(316, 221, 86, 20);
			PoljeZ.setColumns(10);
		}
		return PoljeZ;
	}
	private JButton getBtnPovrsina() {
		if (btnPovrsina == null) {
			btnPovrsina = new JButton("POVRSINA");
			
			btnPovrsina.setVisible(false);
			btnPovrsina.setBounds(20, 154, 105, 22);
		}
		return btnPovrsina;
	}
	private JButton getBtnZapremina() {
		if (btnZapremina == null) {
			btnZapremina = new JButton("ZAPREMINA");
			
			btnZapremina.setVisible(false);
			btnZapremina.setBounds(176, 154, 115, 22);
		}
		return btnZapremina;
	}
	private JLabel getLblUnesiBazu() {
		if (lblUnesiBazu == null) {
			lblUnesiBazu = new JLabel("Unesi bazu: ");
			lblUnesiBazu.setVisible(false);
			lblUnesiBazu.setBounds(10, 98, 140, 14);
		}
		return lblUnesiBazu;
	}
	private JTextField getPolje2() {
		if (polje2 == null) {
			polje2 = new JTextField();
			polje2.setVisible(false);
			polje2.setBounds(316, 99, 86, 20);
			polje2.setColumns(10);
		}
		return polje2;
	}
	private JLabel getLblUnesiOmotac() {
		if (lblUnesiOmotac == null) {
			lblUnesiOmotac = new JLabel("Unesi omotac");
			lblUnesiOmotac.setVisible(false);
			lblUnesiOmotac.setBounds(10, 123, 247, 20);
		}
		return lblUnesiOmotac;
	}
	private JTextField getPolje3() {
		if (polje3 == null) {
			polje3 = new JTextField();
			polje3.setVisible(false);
			polje3.setBounds(316, 130, 86, 20);
			polje3.setColumns(10);
		}
		return polje3;
	}
}
