public class Funcionario{
	String nome;
	double salario;
	String cargo;
	String rg;
	double ganho;

	Funcionario[] funcionarios = empresa.funcionarios;

	public Funcionario(){

	}
	public Funcionario(String nome){

	}

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

	//Funcionario mostra(){
		/*for (int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] != null){
				System.out.println("Nome: " + funcionarios[i].nome);
				System.out.println("Salario: " + funcionarios[i].salario);
			}
		}*/
	void mostra(){
	//for(Funcionario funcionario : funcionarios){
		//if(funcionario != null){
			System.out.println("Nome: " + this.nome);
			System.out.println("Salario: " + this.salario);
		//}

	//}
		for(Funcionario funcionario : funcionarios){
			if(funcionario != null){
				System.out.println("Nome: " + this.nome);
				System.out.println("Salario: " + this.salario);
			}
		}

	}

}