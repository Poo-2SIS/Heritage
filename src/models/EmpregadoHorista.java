package models;

public class EmpregadoHorista extends Empregado {
    public int totalDeHorasTrabalhadas;
    public double valorDaHoraTrabalhada;

    public EmpregadoHorista(String nome, int matricula, int totalDeHorasTrabalhadas, int valorDaHoraTrabalhada) {
        super(nome, matricula);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }

    @Override
    public String getDados() {
        String mensagem = super.getDados();
        return mensagem + "\nSalario: " + calcularSalario();
    }

    @Override
    public double calcularSalario() {
        return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;
    }
}
