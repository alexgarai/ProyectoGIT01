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
	

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", color=" + color + "]";
	}

	public void borrar(){
		this.nombre="";
		this.color="";
	}

}

