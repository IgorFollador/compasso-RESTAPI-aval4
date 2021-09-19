package br.com.compasso.partidos.dto;

import java.util.Date;
import java.util.GregorianCalendar;

import br.com.compasso.partidos.constant.Ideologia;
import lombok.Data;
import lombok.Getter;

@Data
public class PartidoFormDTO {
	
	private String nome;
	private String sigla;
	private Ideologia ideologia;
	@Getter private Date dataFundacao;
	
	public void setDataFundacao(Date dataFundacao) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dataFundacao);
		gc.add(gc.DATE, 1);
		this.dataFundacao = gc.getTime();
	}
}
