package models;

public class EmpregadoComissionado extends Empregado{
    public double totalDeVendas;
    public double comissao;

    public EmpregadoComissionado(String nome, int matricula, double totalDeVendas, double comissao) {
        super(nome, matricula);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    @Override
    public String getDados() {
        String mensagem = super.getDados();
        return mensagem + "\nSalario: " + calcularSalario();
    }

    @Override
    public double calcularSalario() {
        return totalDeVendas / comissao;
    }
}
