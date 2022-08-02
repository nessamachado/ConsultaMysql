//metodos que vão manipular as telas do sistema parte visual será controlada por essa classe

package controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import entities.Pessoa;

import services.PessoaService;

@RestController
@RequestMapping("/consulta")
public class PessoaController {
	@Autowired 															//delegar a criação do objeto e a injeção no atributo repositorio ao inves de criar manualmente
	private PessoaService pessoaService;																//metodo de consulta
																		//associar o metodo listar com o protocolo get , atraves do @GetMapping
																		
	@GetMapping("/pessoa")
	@ResponseBody
	public List<Pessoa>searchPessoa(){
		return pessoaService.searchPessoa();
	}
	
//	@PostMapping
//	public void salvar(@RequestBody Pessoa pessoa) {
//		pessoaService.save(pessoa);
//	}
	
//	@PutMapping
//	public void alterar(@RequestBody Pessoa pessoa) {
//		pessoaService.save(pessoa);
//	}
	
//	@DeleteMapping
//	public void excluir(@RequestBody Pessoa pessoa) {
//		pessoaService.delete(pessoa);
//	}

}




