package br.com.triadworks.jdbc.main;

import java.util.Calendar;
import java.util.List;

import br.com.triadworks.dao.CaloteiroDAO;
import br.com.triadworks.jdbc.modelo.Caloteiro;

public class SistemaCaloteiro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caloteiro caloteiro = new Caloteiro();
		caloteiro.setNome("Nome do caloteiro");
		caloteiro.setEmail("emailCaloteiro@caloteiro.com.br");
		caloteiro.setDevendo(200);
		caloteiro.setDataDivida(Calendar.getInstance());
		CaloteiroDAO dao = new CaloteiroDAO();
		
		
		//dao.adiciona(caloteiro);
		
		System.out.println("Gravando-----------------------------------");
		

		System.out.println("Listando Caloteiros------------------------");
		
		List<Caloteiro> lista = dao.getLista();
		
		for(Caloteiro c : lista){
			System.out.println("Nome: "+ c.getNome());
			System.out.println("Email: "+ c.getEmail());
			System.out.println("Devendo: "+ c.getDevendo());
			System.out.println("Data: "+ c.getDataDivida().getTime()+"\n");
		}

		
		
		Caloteiro c = dao.getCaloteiro(1l);
		c.setNome("FRANCISCO");
		dao.altera(c);
		System.out.println("ALTERANDO----------------------------------");

		System.out.println("Nome: "+ c.getNome());
		System.out.println("Email: "+ c.getEmail());
		System.out.println("Devendo: "+ c.getDevendo());
		System.out.println("Data: "+ c.getDataDivida().getTime()+"\n");
		
		//Caloteiro ca = dao.getCaloteiro(8l);
		//dao.deleta(ca);
		
		}

}
