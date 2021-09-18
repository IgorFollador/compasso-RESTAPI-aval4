package br.com.compasso.partidos.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.compasso.partidos.dto.PartidoDTO;
import br.com.compasso.partidos.dto.PartidoFormDTO;

public interface PartidoService {

	PartidoDTO save(PartidoFormDTO form);

	Page<PartidoDTO> findAll(Pageable page);
	
}
