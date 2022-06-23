package jana60;

public class MainShop {
public static void main(String[] args) {
		
		Smartphone iphone = new Smartphone(100 ,"Iphone","Apple",800.00, 22, "1231234241",64);
		
		Televisori samsung =new Televisori (120 ,"led 4k","Samsung",600.00,22,52,true);
		
		Cuffie jbl = new Cuffie (122 ,"insonorizzate","jbl",40.00,22,"rosso",true);
       System.out.println(iphone);
       System.out.println(samsung);
       System.out.println(jbl);
	}

}
