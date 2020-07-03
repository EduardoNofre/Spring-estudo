package com.estudo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.estudo.spring.classe.Dependencia;
@Component
public class ServiceDependenciaOpcional {

	/**
	 * Observação: Dependendo da versão do sprig devemos usar essa notação
	 * para dizer ao spring caso tenho conteudo na classe Dependencia otimo se não tive blz.
	 * 
	 * Em versoes mais antiga do spring esse erro acontece e tempo de compilação.
	 *  
	 */
	
	@Autowired(required = false)
	private Dependencia dependencia;
	
	public void DependenciaOpcionalExemplo() {
		
		if(dependencia != null) {
			
			System.out.println("Objeto não esta nulo");
			
		}else {
			System.out.println("Objeto esta nulo");
		}
	}
	
}
