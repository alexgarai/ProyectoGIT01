package figuras2Dy3D;

public class Cubo extends Figura3D {

	private double ancho,alto,fondo;
	
	public Cubo(double ancho, double alto, double fondo) {
		
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
	}
	public Cubo(double lado) {
		
		this.ancho = lado;
		this.alto = lado;
		this.fondo = lado;
	}
	
	public Cubo() {
		
		this.ancho = 0;
		this.alto = 0;
		this.fondo = 0;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getFondo() {
		return fondo;
	}

	public void setFondo(double fondo) {
		this.fondo = fondo;
	}

	public void mostrarFigura(){
		System.out.println("El nombre del cubo es:"+this.getNombre()+" y de color:"+this.getColor());
		System.out.println("Medidas del cubo son ancho: "+ancho+" ,alto: "+alto+" y fondo:"+fondo);
	}
	
	public void borrar(){
		super.borrar();
		alto=ancho=fondo=0;
	}

	@Override
	public double calcularVolumen() {
		// TODO Auto-generated method stub
		return alto*ancho*fondo;
	}

}

