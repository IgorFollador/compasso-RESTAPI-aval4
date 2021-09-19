package br.com.compasso.partidos.config.validacao;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErroDeFormularioDTO {
	
	private String campo;
	private String mensagem;
	
}
