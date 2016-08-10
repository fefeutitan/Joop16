public class Conta{

	int numero;
	double saldo;
	double limite;
	Cliente cliente = new Cliente();
	
	boolean saca(double valor){

		return true;
	}

	void deposita(double valor){
		saldo = saldo + valor;
	}


	boolean transfere(Conta destino, double valor){
		saldo = saldo - valor;
		destino.saldo = destino.saldo + valor;
		return true;
	}

}