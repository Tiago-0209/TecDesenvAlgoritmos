    package Aula06.atividades.src;
    public class contacorrente {
    
    private double saldo;
    private double limite;
    private String agencia;

    
    public contacorrente(String agencia, double saldoInicial, double limite) {
        this.agencia = agencia;
        this.saldo = saldoInicial;
        this.limite = limite;
    }

    
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de R$ " + valor);
        }
    }

    
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    
    public void verSaldo() {
        System.out.println("Saldo disponível: R$ " + saldo);
        System.out.println("Limite: R$ " + limite);
        System.out.println("Agência: " + agencia);
    }
}
