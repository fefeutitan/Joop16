package br.triadworks.javaweb.modelo;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import br.triadworks.javaweb.dao.CaloteiroDAO;

public class ListaCaloteiroLogica implements Logica{

	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception{

		Connection connection = (Connection)request.getAttribute("conexao");
		
		 List<Caloteiro> caloteiro = new CaloteiroDAO(connection).getLista();
		 request.setAttribute("lista", caloteiro);
			System.out.println("Listando caloteiro... ");
		 		
		RequestDispatcher rd = 
		request.getRequestDispatcher("/listaCaloteiros.jsp");
		rd.forward(request, response);
	}
}
