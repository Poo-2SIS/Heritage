package main;

import models.Empregado;
import models.EmpregadoComissionado;
import models.EmpregadoHorista;

public class Main {
    public static void main(String[] args) {
        EmpregadoComissionado teste =  new EmpregadoComissionado("Jorge",
                1,
                150.25,
                10);

        EmpregadoHorista teste2 = new EmpregadoHorista("Antonio",
                2,
                23,
                100);

        Empregado[] empregados = new Empregado[2];
        empregados[0] = teste;
        empregados[1] = teste2;

        for (Empregado empregado : empregados) {
            System.out.println(empregado.getDados());
        }


    }
}
