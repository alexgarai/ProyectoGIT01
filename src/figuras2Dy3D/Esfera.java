package figuras2Dy3D;

public class Esfera extends Figura3D {

	private double radio;
	
	
	public Esfera(double radio) {
		
		this.radio = radio;
	}
	
	public Esfera() {
		
		this.radio = 0;
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}
	public void mostrarFigura(){
		
		System.out.println("El nombre de la esfera es:"+this.getNombre()+" y de color:"+this.getColor());
		System.out.println("Medidas de la esfera es radio:"+radio);
	}
	
	public void borrar(){
		super.borrar();
		radio=0;
	}


	@Override
	public double calcularVolumen() {
		// TODO Auto-generated method stub
		return (4/3)*Math.PI*Math.pow(radio,3);
	}

}

