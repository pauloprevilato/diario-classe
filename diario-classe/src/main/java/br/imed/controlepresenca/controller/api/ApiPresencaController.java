package br.imed.controlepresenca.controller.api;

import java.util.Collection;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.imed.dao.PresencaDAO;
import br.imed.model.Estudante;
import br.imed.model.Presenca;

@Controller
@Path("/presenca")
public class ApiPresencaController {

	private static final int SUCESSO = 200;
	private static final String XML_FORMAT = "xml";
	private static final String JSON_FORMAT = "json";
	
	@Inject
	private Result result;
	@Inject
	private PresencaDAO dao;
	
	@Put("/adicionar")
	@Consumes({ "application/json", "application/xml" })
	public void adicionar(Presenca presenca) {
		dao.salvar(presenca);
		retornarSucesso();
	}
	
	@Get("/lista.{formato}")
	public void buscarTodos(String formato){
		Collection<Presenca> presencas = dao.listar();
		switch (formato) {
		case JSON_FORMAT:
			result.use(Results.json()).from(presencas).serialize();
			break;
		case XML_FORMAT:
			result.use(Results.xml()).from(presencas).serialize();
			break;

		default:
			break;
		}
		retornarSucesso();
	}
	
	private void retornarSucesso() {
		result.use(Results.http()).setStatusCode(SUCESSO);
	}
}
