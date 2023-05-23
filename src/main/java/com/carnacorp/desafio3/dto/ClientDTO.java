package com.carnacorp.desafio3.dto;

import java.time.LocalDate;

import com.carnacorp.desafio3.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class ClientDTO {

	private Long id;
	
	@Size(min = 3, max = 80, message = "Nome precisa ter entre 3 e 80 caracteres")
	@NotBlank(message = "Campo requerido")
	private String name;
	
	@Size(min = 11, max = 11, message = "O CPF deve conter 11 dígitos")
	@Pattern(regexp = "\\d+", message = "O CPF deve conter apenas números")
	@NotBlank(message = "Campo requerido")
	private String cpf;
	
	@Positive(message = "O salário deve ter um valor positivo")
	@NotBlank(message = "Campo requerido")
	private Double income;
	
	@PastOrPresent(message = "A data de nascimento não pode ser futura")
	@NotBlank(message = "Campo requerido")
	@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "A data deve estar no formato yyyy-MM-dd")
	private LocalDate birthDate;
	
	@PositiveOrZero(message = "O valor deve ser positivo ou zero")
	@NotBlank(message = "Campo requerido")
	private Integer children;

	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}

	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}

}
