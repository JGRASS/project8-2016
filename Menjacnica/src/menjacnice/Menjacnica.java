package menjacnice;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsi.MenjacnicaInterfejs;
import kursevi.Kurs;
import valute.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Valuta> valute;

	@Override
	public void dodajKurs(Valuta valuta, GregorianCalendar datum, double prodajni, double srednji, double kupovni) {
		Kurs k = new Kurs();
		k.setDatum(datum);
		k.setKupovni(kupovni);
		k.setProdajni(prodajni);
		k.setSrednji(srednji);
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i) != null && valute.get(i).equals(valuta)) {
				valute.get(i).getKursevi().addFirst(k);
				break;
			}
		}
	}

	@Override
	public void brisiKurs(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs pronadjiKurs(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
