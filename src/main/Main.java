package main;

import models.Empregado;
import models.EmpregadoComissionado;
import models.EmpregadoHorista;

public class Main {
    public static void main(String[] args) {
        EmpregadoComissionado teste =  new EmpregadoComissionado();
        teste.nome = "Jorge";
        teste.matricula = 1;
        teste.comissao = 150.25;
        teste.totalDeVendas = 60;

        EmpregadoHorista teste2 = new EmpregadoHorista();
        teste2.nome = "Antonio";
        teste2.matricula = 2;
        teste2.valorDaHoraTrabalhada = 23;
        teste2.totalDeHorasTrabalhadas = 100;

        Empregado[] empregados = new Empregado[2];
        empregados[0] = teste;
        empregados[1] = teste2;

        for (Empregado empregado : empregados) {
            System.out.println(empregado.calcularSalario());
        }


    }
}
