package Exercicios.Objeto.Exercicio3.Entities;

public class Studant {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double finalGrade(){
        return nota1 + nota2 + nota3;
    }

    public double missing(){
        return 60.00 - finalGrade();
    }
}
