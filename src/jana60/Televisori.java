package jana60;

public class Televisori extends Prodotto {
	private int dimensioni;
	private boolean tvSmart;
	public Televisori(int codice, String nome, String marca, double prezzo, int iva,int dimensioni, boolean tvSmart) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.tvSmart = tvSmart;
	}
	public double getDimensioni() {
		return dimensioni;
	}
	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}
	public boolean isTvSmart() {
		return tvSmart;
	}
	public void setTvSmart(boolean tvSmart) {
		this.tvSmart = tvSmart;
	}
	//metodo che restituisce la stampa cn la stringa in polli fatta per far capire che ogni classe puo avere metodi propri
	public String getDimensioniInPollici() {
		return dimensioni + "pollici";
			
	}
	private String isSmart() {
	    if (tvSmart) {
	      return "smart tv";
	    } else {
	      return "no smart";
	    }
	}
	@Override
	public String toString() {

		return super.toString() + " e le sue dimensioni sono " + getDimensioniInPollici() + " ed è " + isSmart() ;
	}
	
	
	
}
