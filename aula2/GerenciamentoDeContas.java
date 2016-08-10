public class GerenciamentoDeContas{
	public static void main(String[] args){
		Conta c1 = new Conta();
			c1.cliente.nome = "Handerson Frota";
			c1.numero = 10;
			c1.saldo = 20;
			c1.limite = 100;
			System.out.println("-----------------------");
			System.out.println("Conta");
			System.out.println("-----------------------");
			System.out.println("Dono:" + c1.cliente.nome);
			System.out.println("numero:" + c1.numero);
			System.out.println("saldo:" + c1.saldo);
			System.out.println("limite:" + c1.limite);

		Conta c2 = new Conta();
			c2.cliente.nome = "Rafael Ponte";
			c2.numero = 43;
			c2.saldo = 299;
			c2.limite = 900;
			System.out.println("-----------------------");
			System.out.println("Conta");
			System.out.println("-----------------------");
			System.out.println("Dono:" + c2.cliente.nome);
			System.out.println("numero:" + c2.numero);
			System.out.println("saldo:" + c2.saldo);
			System.out.println("limite:" + c2.limite);
	}
}