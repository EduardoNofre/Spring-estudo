package com.estudo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.spring.service.ServiceDependenciaOpcional;
import com.estudo.spring.service.ServiceInjecaoAutowired;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@RestController
@RequestMapping(value = "/ControllerEstudoSpring")
public class Controller {

	@Autowired
	private ServiceInjecaoAutowired serviceExemploInjecaoAutowired;
	
	@Autowired
	private ServiceDependenciaOpcional serviceDependenciaOpcional;

	@ApiOperation(value = "Meu primeiro controller")
	@GetMapping("/controller")
	public String meuPrimeiroController() {

		System.out.println("Meu primeiro controller");

		return "Meu primeiro controller.\nAqui!!!!";
	}
	
	@ApiOperation(value = "Injecao com @Autowired")
	@GetMapping("/injecao")
	public String injecaoAutowiredExemploController() {

		serviceExemploInjecaoAutowired.testeAutowired();

		System.out.println("Spring injecao exemplo as 3 formas");

		return "Spring injecao exemplo as 3 formas.<br>Aqui!!!!";
	}
	
	@ApiOperation(value = "dependencia Opcional")
	@GetMapping("/dependenciaOpcional")
	public String dependenciaOpcional() {

		serviceDependenciaOpcional.DependenciaOpcionalExemplo();

		System.out.println("Dependência opcional com @Autowired");

		return "Dependência opcional Autowired.<br>Aqui!!!!";
	}
	
	@ApiOperation(value = "dependencia Opcional")
	@GetMapping("/Ambiguidade")
	public String Ambiguidade() {

		serviceDependenciaOpcional.DependenciaOpcionalExemplo();

		System.out.println("Dependência opcional com @Autowired");

		return "Ambiguidade de beans e injeção de lista de beans.<br>Aqui!!!!";
	}
}
