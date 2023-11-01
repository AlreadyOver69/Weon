package Area;


abstract class Figura {

	protected double Area;
	protected double Altura;
	protected double Base;
	protected double Perimetro;
	protected String nombre;


public Figura(String nombre, double perimetro) {
	this.nombre = nombre;
	this.Perimetro = perimetro;
}

public Figura(String nombre,double base, double Altura) {
	this.nombre = nombre;
	this.Altura = Altura;
	this.Base = base;
}

public abstract void Calcular(Figura perimetro);
public abstract void Calcular(Figura Base, Figura Altura);

public double getArea() {
	return Area;
	}
public String getNombre() {
	return nombre;
	}
public double getPerimetro() {
	return Perimetro;
	}
public double getBase() {
	return Base;
	}

public double getAltura() {
	return Altura;
	}

}
