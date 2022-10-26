package figuras2Dy3D;

public class Piramide extends Figura3D {

	private double altura,base;
	
	
	public Piramide(double altura, Rectangulo r) {

		this.altura = altura;
		this.base = r.calcularArea();
	}

	public Piramide() {

		this.altura = 0;
		this.base = 0;
	}
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public void mostrarFigura(){
		
		System.out.println("El nombre de la piramide es:"+this.getNombre()+" y de color:"+this.getColor());
		System.out.println("Medidas de la piramide es altura:"+altura+" y base:"+base);
	}
	
	public void borrar(){
		super.borrar();
		this.altura=0;
		this.base=0;
	}

	@Override
	public double calcularVolumen() {
		return base*altura/3;

	}

}

