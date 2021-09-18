package br.com.compasso.partidos.dto;

import java.time.LocalDate;

import br.com.compasso.partidos.constant.Ideologia;
import lombok.Data;

@Data
public class PartidoFormDTO {

	private String nome;
	private String sigla;
	private Ideologia ideologia;
	private LocalDate dataFundacao;
	
}
