package cso.loja.virtual.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import cso.loja.virtual.model.Acesso;
import cso.loja.virtual.service.AcessoService;

@Controller
public class AcessoController {
	
	@Autowired
	private AcessoService acessoService;
	
	
	@PostMapping("/salvarAcesso")
	public Acesso salvarAcesso(Acesso acesso) {
		
		return acessoService.save(acesso);
	}

}
