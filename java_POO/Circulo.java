public class Circulo {
    private Ponto centro;
    private double raio;

    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public static void main(String[] args) {
        Ponto centroCirculo = new Ponto(2, 4);
        double raioCirculo = 2.5;

        Circulo circulo = new Circulo(centroCirculo, raioCirculo);

        System.out.println("Dados do Circulo:");
        System.out.printf("Centro: ( %s, %s )%n", circulo.getCentro().getX(), circulo.getCentro().getY());
        System.out.printf("Raio: %s%n", circulo.getRaio());
        System.out.printf("Area: %.2s%n", circulo.calcularArea());
        System.out.printf("Perimetro: %.2s%n", circulo.calcularPerimetro());
    }
}
