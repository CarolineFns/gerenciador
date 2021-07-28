package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alterarEmpresa")
public class AlterarEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			System.out.println("Cadastrando nova empresa");

			Banco banco = new Banco();

			SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

			Empresa empresa = banco.getEmpresaById(Integer.parseInt(request.getParameter("id")));
			empresa.setNome(request.getParameter("nome"));
			empresa.setDataAbertura(fmt.parse(request.getParameter("dataAbertura")));

			response.sendRedirect("listaEmpresas");

		} catch (ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}