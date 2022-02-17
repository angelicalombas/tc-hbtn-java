public class FolhaPagamento {

    public static double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calculoSalario) {
        double salario = funcionario.getSalario();
        return calculoSalario.calcular(salario);
    }
}
