package br.imed.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.imed.model.Estudante;

public class EstudanteDAO {

	private static Map<Long, Estudante> db = new HashMap<Long, Estudante>();

	public EstudanteDAO() {}

	public void salvar(Estudante estudante) {
		Long id = estudante.getId();
		db.put(id, estudante);
	}

	public Estudante get(Long id) {
		return db.get(id);
	}

	public Collection<Estudante> listar() {
		return db.values();
	}

	public void deletar(Long id) {
		db.remove(id);
	}
}
