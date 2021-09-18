package br.com.compasso.partidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.compasso.partidos.entity.Partido;

public interface PartidoRepository extends JpaRepository<Partido, Long>{

}
