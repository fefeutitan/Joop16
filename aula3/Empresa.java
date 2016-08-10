public class Empresa{
	String nome;
	String cnpj;
	Funcionario[] funcionarios;


	void adiciona(Funcionario f){
		for (int x = 0;x<funcionarios.length;x++){
			if (funcionarios[x] == null){
				this.funcionarios[x]=f;
				break;				
			}
		}
	}

	/*Funcionario mostraFunc(){
		for (int i = 0; i < funcionario.length; i++){
		//for(Funcionario funcionario : funcionarios){
			if(funcionario != null){
				funcionario.mostra;
			}
		}
	}*/
}