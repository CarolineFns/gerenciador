package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
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

			Empresa empresa = new Empresa();

			String nomeEmpresa = request.getParameter("nome");
			empresa.setNome(nomeEmpresa);

			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			String dataAbertura = request.getParameter("dataAbertura");

			empresa.setDataAbertura(formato.parse(dataAbertura));

			Banco banco = new Banco();
			banco.adiciona(empresa);

			RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
			request.setAttribute("empresa", empresa.getNome());
			request.setAttribute("dataAbertura", empresa.getDataAbertura());
			rd.forward(request, response);

		} catch (ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}