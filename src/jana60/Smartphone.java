package jana60;

public class Smartphone {
private String imei;
private float memoria;

public Smartphone(String imei, float memoria) {
	super();
	this.imei = imei;
	this.memoria = memoria;
}

public String getImei() {
	return imei;
}

public void setImei(String imei) {
	this.imei = imei;
}

public float getMemoria() {
	return memoria;
}

public void setMemoria(float memoria) {
	this.memoria = memoria;
}
@Override
public String toString() {
	
	return super.toString() + " e il suo IMEI è " + imei + " ed ha una memoria di " + memoria + "GB";
}
}
