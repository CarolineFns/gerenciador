package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mostrarEmpresa")
public class MostrarEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer id = Integer.parseInt(request.getParameter("id"));

		System.out.println("Mostrando empresa " + id);

		Banco banco = new Banco();
		Empresa empresa = banco.getEmpresaById(id);

		request.setAttribute("empresa", empresa);

		RequestDispatcher rd = request.getRequestDispatcher("/formMostraEmpresa.jsp");
		rd.forward(request, response);

	}

}