package Area;

 class Cuadro extends Figura {

	public Cuadro(String Figura) {
		super(Figura, 5.0, 4.2);
		}

	@Override
	public void Calcular(Figura informacion) {
		// TODO Auto-generated method stub
		double base=informacion.getBase();
		double altura=informacion.getAltura();
		System.out.println("\n \ningresa el tipo de figura que vas a calcular cuardro\n");
	
		double resultado = altura*base;
		System.out.println(getNombre() + " tiene un resultado de un área =" + resultado);
	}

	@Override
	public void Calcular(Figura Base, Figura Altura) {
		
	}

	

	





	
}
