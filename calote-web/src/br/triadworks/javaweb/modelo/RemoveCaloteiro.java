package br.triadworks.javaweb.modelo;

import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;

public class RemoveCaloteiro implements Logica {
	
	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		long id = Long.parseLong(request.getParameter("id"));
		Caloteiro caloteiro = new Caloteiro();
		caloteiro.setId(id);
		CaloteiroDAO dao = new CaloteiroDAO(null);
		dao.deleta(caloteiro);
		System.out.println("Excluindo caloteiro... ");
		
		RequestDispatcher rd = 
		request.getRequestDispatcher("/lista-Caloteiros.jsp");
		rd.forward(request, response);
	}

}
