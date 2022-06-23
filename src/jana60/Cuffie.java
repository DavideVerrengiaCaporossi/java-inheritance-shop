package jana60;

public class Cuffie extends Prodotto{
private String colore;
private boolean wifiSiNo;
public Cuffie(int codice,String nome, String marca, double prezzo, int iva,String colore, boolean wifiSiNo) {
	super(codice,nome, marca, prezzo, iva);
	this.colore = colore;
	this.wifiSiNo = wifiSiNo;
}
public String getColore() {
	return colore;
}
public void setColore(String colore) {
	this.colore = colore;
}
public boolean isWifiSiNo() {
	return wifiSiNo;
}
public void setWifiSiNo(boolean wifiSiNo) {
	this.wifiSiNo = wifiSiNo;
}

@Override
public String toString() {

	return super.toString() + " e di colore " + colore + "e sono" + wifiSiNo ;
}

}
