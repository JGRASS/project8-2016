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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Dimension;

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
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmRefresh;

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
		setSize(new Dimension(200, 100));
		setResizable(false);
		setTitle("Povrsina i zapremina geometrijskih tela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
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
			comboBox.setModel(new DefaultComboBoxModel(
					new String[] { "Kocka", "Kvadar", "Lopta", "Valjak", "Kupa", "Prizma", "Piramida" }));
			comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if (comboBox.getSelectedItem().equals("Kocka")) {
						lblUnesi.setText("Unesite duzinu ivice kocke: ");
						lblUnesi.setVisible(true);
						polje1.setText(null);
						polje1.setVisible(true);
						lblUnesiBazu.setVisible(false);
						polje2.setText(null);
						polje2.setVisible(false);
						lblUnesiOmotac.setVisible(false);
						polje3.setText(null);
						polje3.setVisible(false);

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
					// ........................................................................................

					if (comboBox.getSelectedItem().equals("Lopta")) {

						lblUnesi.setText("Unesi poluprecnik lopte: ");
						lblUnesi.setVisible(true);
						polje1.setText(null);
						polje1.setVisible(true);
						lblUnesiBazu.setVisible(false);
						polje2.setText(null);
						polje2.setVisible(false);
						lblUnesiOmotac.setVisible(false);
						polje3.setText(null);
						polje3.setVisible(false);

						btnPovrsina.setVisible(true);
						btnZapremina.setVisible(true);
						
						poljeP.setText(null);
						PoljeZ.setText(null);

						btnPovrsina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								double r = Double.parseDouble(polje1.getText());
								double p = o1.povrsinaLopte(r);
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
					//..........................................................................................
					if (comboBox.getSelectedItem().equals("Kvadar")) {

						lblUnesi.setText("Unesi ivicu a: ");
						lblUnesi.setVisible(true);
						polje1.setText(null);
						polje1.setVisible(true);
						lblUnesiBazu.setText("Unesi ivicu b: ");
						lblUnesiBazu.setVisible(true);
						polje2.setText(null);
						polje2.setVisible(true);
						lblUnesiOmotac.setText("Unesi ivicu c: ");
						lblUnesiOmotac.setVisible(true);
						polje3.setText(null);
						polje3.setVisible(true);

						btnPovrsina.setVisible(true);
						btnZapremina.setVisible(true);
						
						
						btnPovrsina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								double a = Double.parseDouble(polje1.getText());
								double b = Double.parseDouble(polje2.getText());
								double c = Double.parseDouble(polje3.getText());
								
								double p = o1.povrsinaKvadra(a,b,c);
								String rezultat = String.valueOf(p);
								poljeP.setText(rezultat);

								lblPovrsinaJe.setVisible(true);
								poljeP.setVisible(true);

							}
						});

						btnZapremina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								double a = Double.parseDouble(polje1.getText());
								double b = Double.parseDouble(polje2.getText());
								double c = Double.parseDouble(polje3.getText());
								
								double p = o1.zapreminaKvadra(a,b,c);
								String rezultat = String.valueOf(p);
								PoljeZ.setText(rezultat);

								lblZapreminaJe.setVisible(true);
								PoljeZ.setVisible(true);
							}
						});
					
					}
					//.........................................................................................
					if (comboBox.getSelectedItem().equals("Valjak")) {

						lblUnesi.setVisible(true);
						polje1.setText(null);
						polje1.setVisible(true);
						lblUnesiBazu.setText("Unesi visinu valjka: ");
						lblUnesiBazu.setVisible(true);
						polje2.setText(null);
						polje2.setVisible(true);
						lblUnesiOmotac.setVisible(false);
						polje3.setText(null);
						polje3.setVisible(false);

						
						btnPovrsina.setVisible(true);
						btnZapremina.setVisible(true);
						
						
						btnPovrsina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								double r = Double.parseDouble(polje1.getText());
								double H = Double.parseDouble(polje2.getText());
								
								double p = o1.povrsinaValjka(r,H);
								String rezultat = String.valueOf(p);
								poljeP.setText(rezultat);

								lblPovrsinaJe.setVisible(true);
								poljeP.setVisible(true);

							}
						});

						btnZapremina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								double r = Double.parseDouble(polje1.getText());
								double H = Double.parseDouble(polje2.getText());
								
								double p = o1.zapreminaValjka(r,H);
								String rezultat = String.valueOf(p);
								PoljeZ.setText(rezultat);

								lblZapreminaJe.setVisible(true);
								PoljeZ.setVisible(true);
							}
						});
						
					}
					//...........................................................................................
					if (comboBox.getSelectedItem().equals("Kupa")) {

						lblUnesi.setText("Unesi poluprecnik baze kupe: ");
						lblUnesi.setVisible(true);
						polje1.setText(null);
						polje1.setVisible(true);
						lblUnesiBazu.setText("Unesi visinu kupe: ");
						lblUnesiBazu.setVisible(true);
						polje2.setText(null);
						polje2.setVisible(true);
						lblUnesiOmotac.setText("Unesi izvodnicu kupe: ");
						lblUnesiOmotac.setVisible(true);
						polje3.setText(null);
						polje3.setVisible(true);

						
						btnPovrsina.setVisible(true);
						btnZapremina.setVisible(true);
						
						
						btnPovrsina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								double r = Double.parseDouble(polje1.getText());
								double s = Double.parseDouble(polje3.getText());
								
								double p = o1.povrsinaKupe(r,s);
								String rezultat = String.valueOf(p);
								poljeP.setText(rezultat);

								lblPovrsinaJe.setVisible(true);
								poljeP.setVisible(true);

							}
						});

						btnZapremina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								double r = Double.parseDouble(polje1.getText());
								double H = Double.parseDouble(polje2.getText());
								
								double p = o1.zapreminaKupe(r,H);
								String rezultat = String.valueOf(p);
								PoljeZ.setText(rezultat);

								lblZapreminaJe.setVisible(true);
								PoljeZ.setVisible(true);
							}
						});
						
					}
					//........................................................................
					if (comboBox.getSelectedItem().equals("Prizma")) {

						lblUnesi.setText("Unesi visinu prizme: ");
						lblUnesi.setVisible(true);
						polje1.setText(null);
						polje1.setVisible(true);
						lblUnesiBazu.setVisible(true);
						polje2.setText(null);
						polje2.setVisible(true);
						lblUnesiOmotac.setVisible(true);
						polje3.setText(null);
						polje3.setVisible(true);

						
						btnPovrsina.setVisible(true);
						btnZapremina.setVisible(true);
						
						
						btnPovrsina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								double B = Double.parseDouble(polje2.getText());
								double M = Double.parseDouble(polje3.getText());
								
								double p = o1.povrsinaPrizme(B,M);
								String rezultat = String.valueOf(p);
								poljeP.setText(rezultat);

								lblPovrsinaJe.setVisible(true);
								poljeP.setVisible(true);

							}
						});

						btnZapremina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								double H = Double.parseDouble(polje1.getText());
								double B = Double.parseDouble(polje2.getText());
								
								double p = o1.zapreminaPrizme(B,H);
								String rezultat = String.valueOf(p);
								PoljeZ.setText(rezultat);

								lblZapreminaJe.setVisible(true);
								PoljeZ.setVisible(true);
							}
						});
						
					}
					//..................................................................................
					if (comboBox.getSelectedItem().equals("Piramida")) {

						lblUnesi.setText("Unesi visinu piramide: ");
						lblUnesi.setVisible(true);
						polje1.setText(null);
						polje1.setVisible(true);
						lblUnesiBazu.setVisible(true);
						polje2.setText(null);
						polje2.setVisible(true);
						lblUnesiOmotac.setVisible(true);
						polje3.setText(null);
						polje3.setVisible(true);

						
						btnPovrsina.setVisible(true);
						btnZapremina.setVisible(true);
						
						
						btnPovrsina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {

								double B = Double.parseDouble(polje2.getText());
								double M = Double.parseDouble(polje3.getText());
								
								double p = o1.povrsinaPiramide(B,M);
								String rezultat = String.valueOf(p);
								poljeP.setText(rezultat);

								lblPovrsinaJe.setVisible(true);
								poljeP.setVisible(true);

							}
						});

						btnZapremina.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								double H = Double.parseDouble(polje1.getText());
								double B = Double.parseDouble(polje2.getText());
								
								double p = o1.zapreminaPiramide(B,H);
								String rezultat = String.valueOf(p);
								PoljeZ.setText(rezultat);

								lblZapreminaJe.setVisible(true);
								PoljeZ.setVisible(true);
							}
						});
						
					}
				}
			});
			comboBox.setBounds(205, 21, 86, 29);
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
			lblPovrsinaJe.setBounds(10, 196, 140, 14);
		}
		return lblPovrsinaJe;
	}

	private JTextField getPoljeP() {
		if (poljeP == null) {
			poljeP = new JTextField();
			poljeP.setVisible(false);
			poljeP.setBounds(316, 193, 86, 20);
			poljeP.setColumns(10);
		}
		return poljeP;
	}

	private JLabel getLblZapreminaJe() {
		if (lblZapreminaJe == null) {
			lblZapreminaJe = new JLabel("Zapremina je: ");
			lblZapreminaJe.setVisible(false);
			lblZapreminaJe.setBounds(10, 221, 140, 14);
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
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmRefresh());
		}
		return mnFile;
	}
	private JMenuItem getMntmRefresh() {
		if (mntmRefresh == null) {
			mntmRefresh = new JMenuItem("Refresh");
			mntmRefresh.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblUnesi.setVisible(false);
					polje1.setText(null);
					polje1.setVisible(false);
					lblUnesiBazu.setVisible(false);
					polje2.setText(null);
					polje2.setVisible(false);
					lblUnesiOmotac.setVisible(false);
					polje3.setText(null);
					polje3.setVisible(false);
					
					btnPovrsina.setVisible(false);
					btnZapremina.setVisible(false);
					
					lblPovrsinaJe.setVisible(false);
					lblZapreminaJe.setVisible(false);
					poljeP.setText(null);
					poljeP.setVisible(false);
					PoljeZ.setText(null);
					PoljeZ.setVisible(false);
					
				}
			});
		}
		return mntmRefresh;
	}
}
