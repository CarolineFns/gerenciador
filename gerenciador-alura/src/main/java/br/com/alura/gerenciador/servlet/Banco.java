package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();

	static {
		lista.add(new Empresa("Alura"));
		lista.add(new Empresa("Caelum"));
	}

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}
}
