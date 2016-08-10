package br.triadworks.javaweb.servlets;

import javax.servlet.ServletException;

@SuppressWarnings("serial")
public class CaloteiroServletException extends ServletException {
	
	public CaloteiroServletException(String msg){
		super(msg);
	}
	
	public CaloteiroServletException(){
		super();
	}

}
