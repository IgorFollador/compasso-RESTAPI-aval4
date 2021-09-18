package br.com.compasso.partidos.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.compasso.partidos.constant.Ideologia;
import lombok.Data;

@Data
@Entity
@Table(name = "partidos")
public class Partido {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String sigla;
	
	@Enumerated(EnumType.STRING)
	private Ideologia ideologia;
	
	private LocalDate dataFundacao;
	
	@OneToMany
	private List<Associado> Associados;
}
