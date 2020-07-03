package com.estudo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.spring.classe.InjecaoAutowired;

@Service
public class ServiceInjecaoAutowired {

	// **************************************************************** //
	// Existem 3 forma de injetar os objetos no spring //
	// Veja os exemplo abaixo //
	// **************************************************************** //

	/**
	 * Forma - 1 @Autowired ponto de injeção pelo atributo
	 * 
	 * Observação: utilizado pela maioria dos desenvolvedores
	 * 
	 * @Autowired
	 */

	// @Autowired
	private InjecaoAutowired injecaoAutowired;

	/**
	 * Forma - 2 @Autowired ponto de injeção pelo contrutor da classe
	 * 
	 * Observação: Quando se usa mais de um construtor na classe devemos indicar
	 * para o Spring qual deles devem ser iniciado.
	 * 
	 * @Autowired
	 */

	public ServiceInjecaoAutowired(String qualquer) {

	}

	@Autowired
	public ServiceInjecaoAutowired(InjecaoAutowired injecaoAutowired) {
		this.injecaoAutowired = injecaoAutowired;
	}

	/**
	 * Forma - 3 @Autowired ponto de injeção pelo metodo setters
	 * 
	 * Observação: Não é muito usual
	 * 
	 * @Autowired
	 */

	// @Autowired
	public void setInjecaoAutowired(InjecaoAutowired injecaoAutowired) {
		this.injecaoAutowired = injecaoAutowired;
	}

	public void testeAutowired() {

		injecaoAutowired.exemploInjecao();
	}
}
