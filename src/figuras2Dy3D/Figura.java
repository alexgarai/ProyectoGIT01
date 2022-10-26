package figuras2Dy3D;

import java.util.Objects;

public class Figura {
	
	private String nombre,color;

	
	
	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	public Figura() {
		super();
	}



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
	
	

	@Override
	public int hashCode() {
		return Objects.hash(color, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		return Objects.equals(color, other.color) && Objects.equals(nombre, other.nombre);
	}

	public void borrar(){
		this.nombre="XXXXXXX";
		this.color="XXXXXXX";
	}

}

