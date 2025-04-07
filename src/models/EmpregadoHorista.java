package models;

public class EmpregadoHorista extends Empregado {
    public int totalDeHorasTrabalhadas;
    public int valorDaHoraTrabalhada;

    @Override
    public double calcularSalario() {
        return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;
    }
}
