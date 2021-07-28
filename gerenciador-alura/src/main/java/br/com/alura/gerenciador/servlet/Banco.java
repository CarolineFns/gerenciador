package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Integer sequencial = 1;

	static {
		lista.add(new Empresa("Alura", sequencial++));
		lista.add(new Empresa("Caelum", sequencial++));
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(sequencial++);
		lista.add(empresa);
	}

	public void remove(Integer id) {

		Iterator<Empresa> empresas = lista.iterator();

		while (empresas.hasNext()) {

			Empresa emp = empresas.next();

			if (emp.getId() == id)
				empresas.remove();

		}
	}

	public Empresa getEmpresaById(Integer id) {

		for (Empresa empresa : lista)
			if (empresa.getId().equals(id))
				return empresa;

		return null;
	}

	public void altera(Empresa empresa) {

		Iterator<Empresa> empresas = lista.iterator();

		while (empresas.hasNext()) {

			Empresa emp = empresas.next();

			if (emp.getId() == empresa.getId()) {
				emp.setNome(empresa.getNome());
				emp.setDataAbertura(empresa.getDataAbertura());
			}

		}
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}
}
