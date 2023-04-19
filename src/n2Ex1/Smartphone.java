package n2Ex1;

public class Smartphone extends Telefon implements Camara,Relotje{


	public Smartphone(String marca,String model){
		super(marca,model);
	}
	
	public String trucar(int numTelf) {
		return "S´està trucant al número de teléfon :" + numTelf;	
		
	}
	public String alarma() {
		return "Està sonant l´alarma! Aixeca´t!";
	}

	public String fotografiar() {
			return "S´està fent una foto!";
	}

}
