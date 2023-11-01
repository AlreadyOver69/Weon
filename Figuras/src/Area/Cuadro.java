package Area;

 class Cuadro extends Figura {

	public Cuadro(String Figura) {
		super(Figura, 5.0, 4.2);
		}

	@Override
	public void Calcular(Figura Base, Figura Altura) {
		// TODO Auto-generated method stub
		double base=Base.getBase();
		double altura=Altura.getAltura();
		System.out.println("ingresa el tipo de figura que vas a calcular cuardro\n");
		
		double resultado = altura*base;
		System.out.println(getNombre() + " tiene un resultado de un área =" + resultado);
	}

	@Override
	public void Calcular(Figura perimetro) {
		// TODO Auto-generated method stub
		
	}

	





	
}
