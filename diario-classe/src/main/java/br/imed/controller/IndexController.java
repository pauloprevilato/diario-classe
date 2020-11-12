package br.imed.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

@Controller
public class IndexController {

	@Inject private Result result;

	@Get("/")
	public void getIndex() {
		result.include("message", "Get VRaptor!");
	}
	
	@Post("/")
	public void postIndex() {
		result.include("message", "Post VRaptor!");
	}
}