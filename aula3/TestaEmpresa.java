public class TestaEmpresa{
	
	public static void main(String[] args){
		Empresa empresa = new Empresa();
		empresa.funcionarios = new Funcionario[10];

		Funcionario f1 = new Funcionario();
		f1.nome = "Handerson Frota";
		f1.salario = 1000;
		empresa.adiciona(f1);

		Funcionario f2 = new Funcionario();
		f2.nome = "Rafael Ponte";
		f2.salario = 1000;
		empresa.adiciona(f2);

		for (int y=0; y<5; y++){
			Funcionario funcionario = new Funcionario();
			funcionario.nome = "Funcionario 0" + y;
			funcionario.salario = 100 + y * 10;
			empresa.adiciona(funcionario);
		}
			
	}
}