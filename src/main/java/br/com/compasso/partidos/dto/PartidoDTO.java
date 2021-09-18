package br.com.compasso.partidos.dto;

import java.time.LocalDate;
import java.util.List;

import br.com.compasso.partidos.constant.Ideologia;
import br.com.compasso.partidos.entity.Associado;
import br.com.compasso.partidos.entity.Partido;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PartidoDTO {
	
	private Long id;
	
	private String nome;
	
	private String sigla;
	
	private Ideologia ideologia;
	
	private LocalDate dataFundacao;

	public PartidoDTO(Partido partido) {
		this.id = partido.getId();
		this.nome = partido.getNome();
		this.sigla = partido.getSigla();
		this.ideologia = partido.getIdeologia();
		this.dataFundacao = partido.getDataFundacao();
	}

	
}
