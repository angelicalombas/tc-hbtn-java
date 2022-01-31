import java.text.NumberFormat;
import java.util.Locale;

public class Empregado {
    public double salarioFixo;

    Locale ptBR = new Locale("pt", "BR");
    NumberFormat numberFormat = NumberFormat.getNumberInstance(ptBR);

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        if (departamento.alcancouMeta()){
            return Double.valueOf(numberFormat.format(salarioFixo*0.1));
        }else{
            return 0.00;
        }
    }

    double calcularSalarioTotal(Departamento departamento){
        return Double.valueOf(numberFormat.format(calcularBonus(departamento) + salarioFixo));
    }

}
