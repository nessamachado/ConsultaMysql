package services;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;

import entities.Pessoa;
import repository.PessoaRepository;


@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
//	public Optional<Pessoa>
//	findById(@PathVariable("id") Long id){
//		return pessoaRepository.findById(id);
//		}
	
	public List<Pessoa> searchPessoa(){
        return pessoaRepository.findAll();
    }

}
//fazer validacao/verificacao logica do programa