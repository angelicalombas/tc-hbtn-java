public class Empregado {
    public double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    double calcularBonus(Departamento departamento){
        if (departamento.alcancouMeta()){
            return salarioFixo*0.1;
        }else{
            return 0;
        }
    }

    double calcularSalarioTotal(Departamento departamento){
        return calcularBonus(departamento) + salarioFixo;
    }

}
