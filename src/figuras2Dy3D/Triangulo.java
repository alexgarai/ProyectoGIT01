package figuras2Dy3D;

public class Triangulo extends Figura2D {

	private double base,altura;
	
	public Triangulo(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	}
	
	public Triangulo() {
		
		this.base = 0;
		this.altura = 0;
	}
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (base*altura/2);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		double lado= Math.hypot(altura, (base/2));
		return (lado*2)+base;
		
	}

	
	
	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}

	public void borrar(){
		super.borrar();
		this.altura=this.base=0;
	}

}

