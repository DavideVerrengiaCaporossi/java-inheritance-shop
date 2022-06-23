package jana60;

public class Cuffie extends Prodotto{
private String colore;
private boolean wirless;

public Cuffie(int codice,String nome, String marca, double prezzo, int iva,String colore, boolean wirless) {
	super(codice,nome, marca, prezzo, iva);
	this.colore = colore;
	this.wirless = wirless;
}





public String getColore() {
	return colore;
}





public void setColore(String colore) {
	this.colore = colore;
}





public boolean isWirless() {
	return wirless;
}





public void setWirless(boolean wirless) {
	this.wirless = wirless;
}

private String isWireless() {
    if (wirless) {
    return "wireless";
    } 
    else {
    return "cablate";
     }
}
    



@Override
public String toString() {

	return super.toString() + " e di colore " + colore + " e sono" + isWireless() ;
}

}
