package main;

import models.Empregado;

public class Controle {
    Empregado[] lista;
    int contador;

    public Controle() {
        lista = new Empregado[5];
    }

    public void inserir(Empregado empregado) {
        lista[contador] = empregado;
        contador++;
    }

    public Empregado pesquisar(int matricula) {
        for (int i = 0; i < contador; i++) {
            if (lista[i] != null && lista[i].matricula == matricula) return lista[i];
        }
        return null;
    }

    public String listar() {
        String mensagem = "";
        for (int i = 0; i < contador; i++) {
            mensagem += "========================================\n";
            mensagem += lista[i].getDados();
            mensagem += "\n========================================";
        }
        return mensagem;
    }
}
