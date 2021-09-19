 package br.com.compasso.partidos.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.compasso.partidos.constant.CargoPolitico;
import br.com.compasso.partidos.constant.Sexo;
import lombok.Data;

@Data
@Entity
@Table(name = "associados")
public class Associado {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;

	@Enumerated(EnumType.STRING)
	private CargoPolitico cargoPolitico;
	
	private Date dataNascimento;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@OneToOne
	private Partido partido;
}
