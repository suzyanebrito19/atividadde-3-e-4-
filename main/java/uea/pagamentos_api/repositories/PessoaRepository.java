package uea.pagamentos_api.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uea.pagamentos_api.models.Pessoa;
import uea.pagamentos_api.repositories.filters.PessoaFilter;

@Repository
public interface PessoaRepository  extends JpaRepository<Pessoa, Long> {

	Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable);
}
