package jana60;

import java.text.DecimalFormat;

public class Prodotto {
private int codice;
private String marca;
private double prezzo;
private int iva;
public Prodotto(int codice, String marca, double prezzo, int iva) {
	super();
	this.codice = codice;
	this.marca = marca;
	this.prezzo = prezzo;
	this.iva = iva;
}

DecimalFormat df= new DecimalFormat ("#0.00€");

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

public double prezzoTotale()
{
	double prezzoFinale = (prezzo / 100)* iva + prezzo;
	return prezzoFinale;
}

}
