public class ContaBancaria {
    private double saldo;
    private String numeroConta;
    
    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 200;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Deposito realizado com sucesso. Novo saldo: R$%.2f%n", valor, saldo);
        } else {
            System.out.println("O valor do deposito deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque realizado com sucesso. Novo saldo: R$%.2f%n", valor, saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo da Conta %s: R$%.2f%n", numeroConta, saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("65657868");

        conta.exibirSaldo();

        conta.depositar(50.00);

        conta.sacar(70.000);

        conta.exibirSaldo();
    }
}

