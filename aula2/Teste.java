public class Teste{
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
			f1.nome = "funcionario um";
			f1.salario = 0;
			f1.cargo = "analista";
			f1.rg = "1338752";
			f1.ganho = 0;

			f1.bonifica(600);
			System.out.println("Salario atual:" + f1.salario);
			f1.calculaGanhoAnual();
			System.out.println("Salario anual:" + f1.ganho);

		Funcionario f2 = new Funcionario();
			f2.nome = "Frodo";
			f2.salario = 100;

		Funcionario f3 = new Funcionario();
			f3.nome = "Frodo";
			f3.salario = 100;

		if(f2==f3){
			System.out.println("Iguais");
		}else{
			System.out.println("Diferentes");
		}

		Funcionario f4 = new Funcionario();
			f4.nome = "Frodo";
			f4.salario = 300;

		Funcionario f5 = f4;
			if(f4==f5){
				System.out.println("Iguais");
			}else{
				System.out.println("Diferentes");
			}
	}
}