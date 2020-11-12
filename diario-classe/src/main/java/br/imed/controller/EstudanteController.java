package br.imed.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.imed.dao.EstudanteDAO;
import br.imed.model.Estudante;

@Controller
@Path("/estudante")
public class EstudanteController {

	private Result result;
	private EstudanteDAO dao;

	public EstudanteController() {
	}

	@Inject
	public EstudanteController(Result result, EstudanteDAO dao) {
		this.result = result;
		this.dao = dao;
	}
	
	@Get("")
	public void listar() {
		result.include("estudantes", dao.listar());
	}
	
	@Get("/adicionar")
	public void adicionar() {
		result.forwardTo(this).formulario(new Estudante());
	}
	
	@Get("/editar/{id}")
	public void editar(Long id) {
		Estudante estudante = dao.get(id);
		result.forwardTo(this).formulario(estudante);
	}
	
	public void formulario(Estudante estudante) {
		result.include("estudante", estudante);
	}

	@Post("/salvar")
	public void salvar(Estudante estudante) {
		dao.salvar(estudante);
		result.include("sucesso", true);
		result.redirectTo(this).listar();
	}
	
	@Get("/deletar/{id}")
	public void deletar(Long id) {
		dao.deletar(id);
		result.include("sucesso", true);
		result.redirectTo(this).listar();
	}
}
