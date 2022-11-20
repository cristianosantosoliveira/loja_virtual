package cso.loja.virtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cso.loja.virtual.controller.AcessoController;
import cso.loja.virtual.model.Acesso;

@SpringBootTest(classes = LojaVirtualApplication.class)
public class LojaVirtualApplicationTests {
	

	
	@Autowired
	private AcessoController acessoController; 
	
	
	@Test
	public void testCadastraAcesso() {
		
		Acesso acesso = new Acesso();
		
		acesso.setDescricao("ROLE_ADMIN");

		acessoController.salvarAcesso(acesso);
	}

}
