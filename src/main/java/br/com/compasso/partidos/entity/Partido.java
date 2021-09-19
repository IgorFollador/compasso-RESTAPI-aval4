package br.com.compasso.partidos.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	private Date dataFundacao;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Associado> associados = new ArrayList<>();;
}
