package br.com.equipe04.CRUDCamisa10.repositorys;

import br.com.equipe04.CRUDCamisa10.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
