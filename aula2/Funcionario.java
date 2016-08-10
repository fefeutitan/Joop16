public class Funcionario{
	String nome;
	double salario;
	String cargo;
	String rg;
	double ganho;

	void bonifica(double aumento){
		salario = salario + aumento;
	}
	double calculaGanhoAnual(){
		ganho = (salario*12);
		return ganho;
	}
	double exibirSalario(){
		return salario;
	}
	double exibirGanhoAnual(){
		ganho = (salario*12);
		return ganho;
	}
}