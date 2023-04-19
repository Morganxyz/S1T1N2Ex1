package n2Ex1;

public abstract class Telefon {

	String marca;
	String model;
	
	public Telefon(String marca,String model){
		this.marca = marca;
		this.model = model;
	}
	
	public abstract String trucar(int numTelf);
	
}
