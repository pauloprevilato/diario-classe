package br.imed.dao;

import java.util.Collection;

import javax.inject.Inject;

import org.hibernate.Session;

import br.imed.model.Disciplina;
import br.imed.model.Presenca;

public class PresencaDAO {

	private Session session;
	
	@Deprecated
	public PresencaDAO() {}

	@Inject
	public PresencaDAO(Session session) {
		this.session = session;
	}

	
	public void salvar(Presenca presenca) {
		session.saveOrUpdate(presenca);
	}

	public Collection<Presenca> listar() {
		return (Collection<Presenca>) session.createCriteria(Presenca.class).list();
	}

}
