package figuras2Dy3D;

public class Figura {
	
	private String nombre,color;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void mostrarFigura(){
		System.out.println("El nombre de la figura es: "+nombre+" y el color: "+color);
	}
	
	public void borrar(){
		this.nombre="";
		this.color="";
	}

}

