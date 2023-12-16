public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private boolean ligado;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.ligado = false;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.printf("O carro %s foi ligado", modelo);
        } else {
            System.out.printf("O carro %s esta ligado%n", modelo);
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.printf("O carro %s foi desligado%n", modelo);
        } else {
            System.out.printf("O carro %s esta desligado.%n", modelo);
        }
    }

    public void exibirInformacoes() {
        System.out.printf("Carro:%nModelo: %s%nAno: %d%nCor: %s%nStatus: %s%n",
                modelo, ano, cor, ligado ? "Ligado" : "Desligado");
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Cobalt", 2013, "Prata");

        meuCarro.exibirInformacoes();

        meuCarro.ligar();

        meuCarro.exibirInformacoes();

        meuCarro.desligar();
        
        meuCarro.exibirInformacoes();
    }
}

