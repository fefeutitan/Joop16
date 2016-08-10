public class Casting{
	public static void main(String[] args){
	int numero = 10;
	double pi = 3.145;
	
	System.out.println("Numero: "+numero);
	System.out.println("PI: "+pi);

	int cast = (int)pi;
	
	System.out.println("Numero: "+numero);
	System.out.println("PI: "+pi);
	System.out.println("Casting: "+cast);
	}
}