package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			System.out.println("Cadastrando nova empresa");
			SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

			Empresa empresa = new Empresa();
			empresa.setNome(request.getParameter("nome"));
			empresa.setDataAbertura(fmt.parse(request.getParameter("dataAbertura")));

			Banco banco = new Banco();
			banco.adiciona(empresa);

			response.sendRedirect("listaEmpresas");

			// RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
			// request.setAttribute("empresa", empresa.getNome()); 
			// request.setAttribute("dataAbertura", empresa.getDataAbertura());
			// rd.forward(request, response);

		} catch (ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}