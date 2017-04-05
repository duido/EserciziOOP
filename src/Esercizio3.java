
public class Esercizio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rettangolo r1 = new Rettangolo(4,6);
		Rettangolo r2 = new Rettangolo(3,16);
		Rettangolo r3 = new Rettangolo(14,86);
		
		System.out.println("Somma Area: " + (r1.area() + r2.area() + r3.area()));
		System.out.println("Somma Perimetro: " + (r1.perimetro() + r2.perimetro() + r3.perimetro()));
		
		r1.ridimensiona(34, 54);
		
		System.out.println("Somma Area: " + (r1.area() + r2.area() + r3.area()));
		System.out.println("Somma Perimetro: " + (r1.perimetro() + r2.perimetro() + r3.perimetro()));


		
	}

}
