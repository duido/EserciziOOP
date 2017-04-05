
public class Esercizio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rettangolo r1 = new Rettangolo(4,6);
		Rettangolo r2 = new Rettangolo(3,16);
		Rettangolo r3 = new Rettangolo(14,86);
		
		System.out.println("R1 Area: " + r1.area() + " Perimetro: " + r1.perimetro());
		System.out.println("R2 Area: " + r2.area() + " Perimetro: " + r2.perimetro());
		System.out.println("R3 Area: " + r3.area() + " Perimetro: " + r3.perimetro());
		
		r1.ridimensiona(34, 54);
		
		System.out.println("R1 Area: " + r1.area() + " Perimetro: " + r1.perimetro());


		
	}

}
