package br.com.diegohfcelestino.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.diegohfcelestino.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
