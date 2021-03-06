package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostraEmpresa implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));

		System.out.println("Mostrando empresa " + id);

		Banco banco = new Banco();
		Empresa empresa = banco.getEmpresaById(id);

		request.setAttribute("empresa", empresa);

		return "forward:formMostraEmpresa.jsp";
	}

}
