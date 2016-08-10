public class TestandoReferencias{

 	public static void main(String[] args) {
	
		Conta c3 = new Conta();
			c3.nome = "Fernando";
			c3.numero = 11;
			c3.saldo = 2000;
			c3.limite = 100;

			System.out.println("Saldo anterior:" + c3.saldo);

			c3.deposita(500);

			System.out.println("Saldo atual:" + c3.saldo);

		Conta c4 = new Conta();
			c4.nome = "teste";
			c4.numero = 12;
			c4.saldo = 0;
			c4.limite = 100;

			System.out.println("Saldo anterior conta principal:" + c3.saldo);
			System.out.println("Saldo anterior da conta destino:" + c4.saldo);
			c3.transfere(c4,500);
			System.out.println("Saldo depois conta principal:" + c3.saldo);
			System.out.println("Saldo depois conta destino:" + c4.saldo);
		
	}
}