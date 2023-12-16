public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public void verificarTipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.printf("Triangulo equilatero.%n");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.printf("Triangulo isosceles.%n");
        } else {
            System.out.printf("Triangulo escaleno.%n");
        }
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5, 4.9, 1.4);

        System.out.printf("Lados do triangulo: %.2f, %.2f, %.2f%n", triangulo.getLado1(), triangulo.getLado2(),
                triangulo.getLado3());
        System.out.printf("Area do triangulo: %.2f%n", triangulo.calcularArea());
        triangulo.verificarTipoTriangulo();
    }
}
