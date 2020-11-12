package br.imed.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.caelum.vraptor.util.test.MockResult;
import br.imed.dao.EstudanteDAO;
import br.imed.model.Estudante;

public class EstudanteControllerTest {

	private static final long ID_DE_ESTUDANTE_VALIDO = 99L;
	@Mock
	EstudanteDAO dao;
	private EstudanteController controller;
	private MockResult result;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.result = new MockResult();
		this.controller = new EstudanteController(result, dao);
	}

	@Test
	public void deveAdicionar_comSucesso_umNovoEstudante_preenchidoCorretamente() {
		this.controller.salvar(new Estudante());
		assertTrue("Deveria ter adicionado com sucesso!", this.result
				.included().containsKey("sucesso"));
	}

	@Test
	public void deveDeletar_comSucesso_umEstudante_UsandoOIdDoEstudante() {
		this.controller.deletar(ID_DE_ESTUDANTE_VALIDO);
		assertTrue("Deveria ter removido o estudante com sucesso!", this.result
				.included().containsKey("sucesso"));
	}
	
	@Test
	public void deveListar_comSucesso_todosOsEstudantesExistente(){
		controller.listar();
		assertTrue(result.included().containsKey("estudantes"));
	}
}
