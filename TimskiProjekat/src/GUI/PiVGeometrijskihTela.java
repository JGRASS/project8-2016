package GUI;
import interfejs.PiV;

public class PiVGeometrijskihTela implements PiV {

	@Override
	public double povrsinaKocke(double a) {
		return 6*a*a;
	}

	@Override
	public double povrsinaKvadra(double a, double b, double c) {
		return 2*(a*b+a*c+b*c);
	}

	@Override
	public double povrsinaValjka(double r, double H) {
		return 2*r*3.14*(r+H);
	}

	@Override
	public double povrsinaKupe(double r, double s) {
		return r*3.14*(r+s);
	}

	@Override
	public double povrsinaLopte(double r) {
		return 4*r*r*3.14;
	}

	@Override
	public double povrsinaPrizme(double B, double M) {
		return 2*(B+M);
	}

	@Override
	public double povrsinaPiramide(double B, double M) {
		return B+M;
	}

	@Override
	public double zapreminaKocke(double a) {
		return a*a*a;
	}

	@Override
	public double zapreminaKvadra(double a, double b, double c) {
		return a*b*c;
	}

	@Override
	public double zapreminaValjka(double r, double H) {
		return r*r*3.14*H;
	}

	@Override
	public double zapreminaKupe(double r, double H) {
		return 1/3*r*r*3.14*H;
	}

	@Override
	public double zapreminaLopte(double r) {
		return 4/3*r*r*r*3.14;
	}

	@Override
	public double zapreminaPrizme(double B, double H) {
		return B*H;
	}

	@Override
	public double zapreminaPiramide(double B, double H) {
		return 1/3*B*H;
	}

}
