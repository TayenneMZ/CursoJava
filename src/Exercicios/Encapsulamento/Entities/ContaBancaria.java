package Exercicios.Encapsulamento.Entities;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double valorDeposito;

    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public ContaBancaria(int numeroConta, String nomeTitular, double valorDeposito) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(valorDeposito);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void deposito(double valorDeposito){
        this.valorDeposito += valorDeposito;
    }

    public void saque(double valorDeposito){
        this.valorDeposito -= valorDeposito + 5.0;
    }

    public String toString(){
        return "Account " + numeroConta + ", Holder: " + nomeTitular + ", Balance: $ " + String.format("%.2f", valorDeposito);
    }
}
