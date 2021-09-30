package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class AlteraEmpresa implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			System.out.println("Cadastrando nova empresa");

			Banco banco = new Banco();

			SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

			Empresa empresa = banco.getEmpresaById(Integer.parseInt(request.getParameter("id")));
			empresa.setNome(request.getParameter("nome"));
			empresa.setDataAbertura(fmt.parse(request.getParameter("dataAbertura")));

			return "redirect:entrada?acao=ListaEmpresas";

		} catch (ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}
