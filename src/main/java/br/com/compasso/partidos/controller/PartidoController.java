package br.com.compasso.partidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.compasso.partidos.dto.PartidoDTO;
import br.com.compasso.partidos.dto.PartidoFormDTO;
import br.com.compasso.partidos.service.PartidoService;

@RestController
@RequestMapping("partidos")
public class PartidoController {
	
	@Autowired
	private PartidoService service;
	
	@PostMapping
	public ResponseEntity<PartidoDTO> save(@RequestBody PartidoFormDTO form){
		PartidoDTO dto = this.service.save(form);
		return ResponseEntity.status(HttpStatus.CREATED).body(dto);
	}
	
	@GetMapping
	public ResponseEntity<Page<PartidoDTO>> findAll(@PageableDefault Pageable page) {
		Page<PartidoDTO> partidos = this.service.findAll(page);
        return ResponseEntity.ok(partidos);
	}
	
}
