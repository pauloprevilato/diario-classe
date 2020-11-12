package br.imed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="presenca")
public class Presenca {
	
	public Presenca() {
	}
	
    @Id   
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "presenca")  
    @SequenceGenerator(name = "presenca", sequenceName = "presenca_id_seq")    
	@Column
	private Long id;
	
	@Column(name="id_disciplina")
	private Long disciplina;
	
	@Column(name="id_estudante")
	private Long estudante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Long disciplina) {
		this.disciplina = disciplina;
	}

	public Long getEstudante() {
		return estudante;
	}

	public void setEstudante(Long estudante) {
		this.estudante = estudante;
	}
}
