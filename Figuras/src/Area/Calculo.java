package Area;

class Calculo {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo("Circulo"); 
		Circulo per = circulo;
		circulo.Calcular(per);
		
		Cuadro cuadro = new Cuadro("Cuadro");
		Cuadro per1=cuadro;
		cuadro.Calcular(per1);

		

	
		
	}

}
