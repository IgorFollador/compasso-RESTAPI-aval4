package br.com.compasso.partidos.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.compasso.partidos.dto.PartidoDTO;
import br.com.compasso.partidos.dto.PartidoFormDTO;
import br.com.compasso.partidos.entity.Partido;
import br.com.compasso.partidos.repository.PartidoRepository;

@Service
public class PartidoServiceImpl implements PartidoService{
	
	@Autowired
	private PartidoRepository repository;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	@Transactional
	public PartidoDTO save(PartidoFormDTO form) {	
		Partido entity = this.repository.save(mapper.map(form, Partido.class));
        return mapper.map(entity, PartidoDTO.class);
	}

	@Override
	public Page<PartidoDTO> findAll(Pageable page) {
		Page<Partido> partidos = this.repository.findAll(page);
		Page<PartidoDTO> partidosDTOS = partidos.map(PartidoDTO::new);
		return partidosDTOS;
	}
		
}
