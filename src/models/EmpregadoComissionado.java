package models;

public class EmpregadoComissionado extends Empregado{
    public double totalDeVendas;
    public double comissao;

    @Override
    public double calcularSalario() {
        return comissao * totalDeVendas;
    }
}
