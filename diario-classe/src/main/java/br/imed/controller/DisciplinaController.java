package br.imed.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.imed.dao.DisciplinaDao;
import br.imed.model.Disciplina;
import br.imed.model.Estudante;

@Controller
@Path("/disciplina")
public class DisciplinaController {

	@Inject private DisciplinaDao dao;
	@Inject private Result result;
	
	@Get("")
	public void listar(){
		result.include("disciplinas",dao.lista());
	}
		
	@Get("/adicionar")
	public void adicionar(){
		result.forwardTo(this).formulario(new Disciplina());
	}
	
	public void formulario(Disciplina disciplina) {
		result.include("disciplina", disciplina);
	}

	@Get("/editar/{id}")
	public void edit(Long id){
		result.forwardTo(this).formulario(dao.get(id));
	}
	
	@Post("/salvar")
	public void salvar(Disciplina disciplina){
		dao.salvar(disciplina);
		result.redirectTo(this).listar();
	}
	
	@Get("/deletar/{id}")
	public void delete(Long id){
		dao.deletar(id);
		result.redirectTo(this).listar();
	}
}
