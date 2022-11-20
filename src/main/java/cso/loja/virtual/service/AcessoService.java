package cso.loja.virtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cso.loja.virtual.model.Acesso;
import cso.loja.virtual.repository.AcessoRepository;

@Service
public class AcessoService {
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	
	public Acesso save(Acesso acesso) {
		
		/*Qualquer tipo de validação*/
		
		return acessoRepository.save(acesso);
	}

}
