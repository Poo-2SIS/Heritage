package models;

public abstract class Empregado {
    public String nome;
    public int matricula;

    public Empregado(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getDados(){
        return "Nome: " + nome + "\nMatricula: " + matricula;
    }

    public abstract double calcularSalario();
}
