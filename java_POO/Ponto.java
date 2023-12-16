public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void exibirCoordenadas() {
        System.out.printf("Coordenadas: ( %s, %s )%n", x, y);
    }

    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(4.0, 1.5);

        System.out.println("Coordenadas iniciais:");
        ponto1.exibirCoordenadas();

        ponto1.setX(1.0);
        ponto1.setY(9);

        System.out.println("Coordenadas apos modificadas:");
        ponto1.exibirCoordenadas();
    }
}

