package br.com.compasso.partidos.dto;

import java.util.Date;
import java.util.GregorianCalendar;

import br.com.compasso.partidos.constant.CargoPolitico;
import br.com.compasso.partidos.constant.Sexo;
import lombok.Data;
import lombok.Getter;

@Data
public class AssociadoFormDTO {
	
	private String nome;
	@Getter private CargoPolitico cargoPolitico;
	@Getter private Date dataNascimento;
	@Getter private Sexo sexo;
	
	public void setCargoPolitico(String cargoPoliticoS) {
		this.cargoPolitico = CargoPolitico.valueOf(cargoPoliticoS.toUpperCase());
	}

	public void setSexo(String sexoS) {
		this.sexo = Sexo.valueOf(sexoS.toUpperCase());
	}	
	
	public void setDataNascimento(Date dataNascimento) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dataNascimento);
		gc.add(gc.DATE, 1);
		this.dataNascimento = gc.getTime();
	}
}
