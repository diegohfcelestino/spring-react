package br.com.diegohfcelestino.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.diegohfcelestino.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{

}
