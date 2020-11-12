package br.imed.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.hibernate.Session;

import br.imed.model.Disciplina;

@SuppressWarnings("unchecked")
public class DisciplinaDao {

	private static Map<Long, Disciplina> db = new HashMap<Long, Disciplina>();
	private Session session;

	@Deprecated
	public DisciplinaDao() {}

	@Inject
	public DisciplinaDao(Session session) {
		this.session = session;
	}
	
	public void salvar(Disciplina disciplina) {
		session.saveOrUpdate(disciplina);
		Long id = disciplina.getId();
		db.put(id, disciplina);
	}
	
	public Collection<Disciplina> lista() {
		return (Collection<Disciplina>) session.createCriteria(Disciplina.class).list();
	}

	public Disciplina get(Long id) {
		Disciplina disciplina = (Disciplina)session.load(Disciplina.class, id);
		return db.get(id);
	}


	public void deletar(Long id) {
		Disciplina disciplina = new Disciplina();
		disciplina.setId(id);
		session.delete(disciplina);
		db.remove(id);
	}

}
