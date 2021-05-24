package Exercicios.Objeto.Exercicio4.Util;

public class CurrencyConverter {
    public double valorDollar;
    public double quantidadeDollar;
    public final double IOF = 0.06;

    public double converter(){
        return (quantidadeDollar*valorDollar) + ((quantidadeDollar*valorDollar)*IOF);
    }
}
