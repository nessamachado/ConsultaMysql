package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import entities.Pessoa;



public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
}


//classe responsavel por gerenciar as requisições.