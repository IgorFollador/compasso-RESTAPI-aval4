package br.com.compasso.partidos.dto;

import java.util.Date;
import java.util.GregorianCalendar;

import br.com.compasso.partidos.constant.Ideologia;
import br.com.compasso.partidos.constant.Sexo;
import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class PartidoFormDTO {

	@NotEmpty(message = "nome is required")
	private String nome;

	@NotEmpty(message = "sigla is required")
	private String sigla;

	@NotNull(message = "ideologia is required")
	@Getter private Ideologia ideologia;

	@NotNull(message = "dataFundacao is required")
	@Getter private Date dataFundacao;

	public void setIdeologia(String ideologiaS) {
		this.ideologia = Ideologia.valueOf(ideologiaS.toUpperCase());
	}

	public void setDataFundacao(Date dataFundacao) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dataFundacao);
		gc.add(gc.DATE, 1);
		this.dataFundacao = gc.getTime();
	}
}
