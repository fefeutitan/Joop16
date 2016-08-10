package br.triadworks.javaweb.filtro;

import java.io.IOException;
import java.net.URI;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import br.triadworks.javaweb.modelo.Logica;
import br.triadworks.javaweb.modelo.Usuario;

/**
 * Servlet Filter implementation class FiltroAutorizacao
 */
@WebFilter(filterName="/FiltroAutorizacao", urlPatterns="/*")
public class FiltroAutorizacao implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroAutorizacao() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		HttpServletRequest req = (HttpServletRequest) request;
		String uri = req.getRequestURI();
		String logica = req.getParameter("logica");
		if(logica == null){
			logica = "";
		}
		if(uri.equals("login.jsp") 
				|| logica.endsWith("AutenticaUsuario")
				|| uri.endsWith("png")
				|| uri.endsWith("js")){
			// pass the request along the filter chain
			chain.doFilter(request, response);
			
		}else{
			Usuario usuarioLogado= (Usuario) req.getSession().getAttribute("usuarioLogado");
			if(usuarioLogado != null){
				chain.doFilter(request, response);
				
			}else{
				RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
				request.setAttribute("msgUsuario", "Voce não tem autorização!");
				rd.forward(request, response);
			}
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
