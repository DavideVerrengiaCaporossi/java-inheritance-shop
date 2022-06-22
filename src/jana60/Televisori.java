package jana60;

public class Televisori {
	private double dimensioni;
	private boolean tvSmart;
	public Televisori(double dimensioni, boolean tvSmart) {
		super();
		this.dimensioni = dimensioni;
		this.tvSmart = tvSmart;
	}
	public double getDimensioni() {
		return dimensioni;
	}
	public void setDimensioni(double dimensioni) {
		this.dimensioni = dimensioni;
	}
	public boolean isTvSmart() {
		return tvSmart;
	}
	public void setTvSmart(boolean tvSmart) {
		this.tvSmart = tvSmart;
	}
	
	@Override
	public String toString() {

		return super.toString() + " e le sue dimensioni sono " + dimensioni + " ed è " + tvSmart ;
	}
	
	
	
}
