package figuras2Dy3D;

public class Circulo extends Figura2D {
	
	private double radio;
	
	public Circulo() {
		this.radio = 0;
	}

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return(Math.PI*Math.pow(radio, 2));
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return(2*Math.PI*radio);
	}
	
	public void mostrarFigura(){
		System.out.println("El nombre del circulo es:"+this.getNombre()+" y de color:"+this.getColor());
		System.out.println("El radio del circulo es: "+radio);
	}
	
	public void borrar(){
		super.borrar();
		radio=0;
	}
	
	
}
