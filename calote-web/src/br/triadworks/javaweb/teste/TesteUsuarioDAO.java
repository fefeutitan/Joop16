package br.triadworks.javaweb.teste;

import java.sql.Connection;

import br.triadworks.javaweb.dao.ConnectionFactory;
import br.triadworks.javaweb.dao.UsuarioDAO;
import br.triadworks.javaweb.modelo.Usuario;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexao = new ConnectionFactory().getConnection();
		UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
		
		Usuario usuarioLogado = usuarioDAO.autentica("rponte", "r123");
		if(usuarioLogado != null){
			System.out.println("Usuario logado: " + usuarioLogado.getNome());
		}
		
		Usuario usuarioErrado = usuarioDAO.autentica("handerson", "123");
		if(usuarioErrado == null){
			System.out.println("Usuario não existe");
		}

	}

}
