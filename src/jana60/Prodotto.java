package jana60;

import java.text.DecimalFormat;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private int iva;

	public Prodotto(int codice,String nome, String marca, double prezzo, int iva) {
		super();
		this.nome = nome;
		this.codice = codice;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	DecimalFormat df = new DecimalFormat("#0.00€");

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodice() {
		return codice;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public double prezzoTotale() {
		double prezzoFinale = (prezzo / 100) * iva + prezzo;
		return prezzoFinale;
	}
	//da cambiare
	public String formattaPrezzo() 
	{
		String prezzoFormattato = df.format(prezzoTotale()) ;
		return prezzoFormattato;
	}
	
	public String toString() {
		
		return ("il prodotto con codice " + codice + "è un " + marca + "e costa " + prezzo + "e ha un iva di " + iva);
	}
}
