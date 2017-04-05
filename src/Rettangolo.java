
public class Rettangolo {
	private float base;
	private float altezza;
	
	public Rettangolo(float b, float h){
		base = b;
		altezza = h;
	}
	
	public void ridimensiona(float b, float h){
		base = b;
		altezza = h;
	}
	
	public float perimetro(){
		return 2 * (base + altezza);
	}
	
	public float area(){
		return base * altezza;
	}
}
