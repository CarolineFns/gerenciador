package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> empresas = banco.getEmpresas();

		PrintWriter out = response.getWriter();
		out.append("<html>");
		out.append("<body>");
		out.append("<ul>");
		for (Empresa empresa : empresas)
			out.append("<li>").append(empresa.getNome()).append("</li>");
		out.append("</ul>");
		out.append("</body>");
		out.append("</html>");
	}

}
