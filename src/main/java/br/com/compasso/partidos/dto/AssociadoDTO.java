package br.com.compasso.partidos.dto;

import java.util.Date;

import br.com.compasso.partidos.constant.CargoPolitico;
import br.com.compasso.partidos.constant.Sexo;
import br.com.compasso.partidos.entity.Associado;
import br.com.compasso.partidos.entity.Partido;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AssociadoDTO {
	
	private Long id;
	private String nome;
	private CargoPolitico cargoPolitico;
	private Date dataNascimento;
	private Sexo sexo;
	private Partido partido;
	
	public AssociadoDTO(Associado associado) {
		this.id = associado.getId();
		this.nome = associado.getNome();
		this.cargoPolitico = associado.getCargoPolitico();
		this.dataNascimento = associado.getDataNascimento();
		this.sexo = associado.getSexo();
		this.partido = associado.getPartido();
	}
	
}