package br.com.compasso.partidos.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class BindFormDTO {
	
	@NotNull(message = "Id do associado é necessário")
	private Long idAssociado;
	
	@NotNull(message = "Id do partido é necessário")
	private Long idPartido;
	
}
