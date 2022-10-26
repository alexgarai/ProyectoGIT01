package figuras2Dy3D;

public class Rectangulo extends Figura2D {

	private double lado1,lado2;
	
	public Rectangulo() {
		this.lado1 = 0;
		this.lado2 = 0;
	}
	
	public Rectangulo(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public Rectangulo(double lado) {
		this.lado1 = this.lado2 = lado;
	}
	
	public Rectangulo(Rectangulo r) {
		this.lado1 = r.getLado1();
		this.lado2 = r.getLado2();
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return(lado1*lado2);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return((2*lado1)+(2*lado2));
	}
	
	public void mostrarFigura(){
		System.out.println("El nombre del rectangulo es:"+this.getNombre()+" y de color:"+this.getColor());
		System.out.println("Medidas del rectangulo son altura: "+lado1+" y base: "+lado2);
		System.out.println("La diagonal es:"+this.calcularDiagonal());
	}
	
	public void borrar(){
		super.borrar();
		lado1=lado2=0;
	}
	public double calcularDiagonal(){
		return Math.sqrt(Math.pow(lado1,2)+Math.pow(lado2,2));
	}
	
	public void copiaRectangulo(Rectangulo r){
		
		this.lado1=r.getLado1();
		this.lado2=r.getLado2();
		
	}
	
	public boolean equals(Object o){
		Rectangulo r=(Rectangulo) o;
		return ((this.lado1==r.lado1) && (this.lado2==r.lado2));
	}

}

