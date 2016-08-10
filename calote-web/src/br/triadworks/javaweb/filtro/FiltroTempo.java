package br.triadworks.javaweb.filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class FiltroTempo implements Filter{
	
	public void destroy(){
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain) throws IOException, ServletException{
		long tempoInicial = System.currentTimeMillis();
		
		chain.doFilter(request,response);
		long tempoFinal = System.currentTimeMillis();
		String uri = ((HttpServletRequest)request).getRequestURI();
		System.out.println("Requisição para: " + uri + " foi de: "
				+(tempoFinal - tempoInicial));
	}
	
	public void init(FilterConfig arg0) throws ServletException{
		
	}

}
