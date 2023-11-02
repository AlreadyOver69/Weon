package Area;

class Circulo extends Figura {
    public Circulo(String figura) {
        super(figura, 5.0);
    }

    @Override
    public void Calcular(Figura informacion) {
        double perimetrocuadrado = informacion.getPerimetro();
        System.out.println("Ingresa el tipo de figura que vas a calcular\n");

        double resultado = 3.1416 * perimetrocuadrado * perimetrocuadrado;
        System.out.print(getNombre() + " tiene un resultado de un área =" + resultado);
    }

    @Override
    public void Calcular(Figura Base, Figura Altura) {
        // Implementa el cálculo de área de un círculo en función de la base y la altura
    }
}







