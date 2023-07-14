package com.paulohenriquesfdev.listacolecaojogos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulohenriquesfdev.listacolecaojogos.dto.GameDTO;
import com.paulohenriquesfdev.listacolecaojogos.dto.GameMinDTO;
import com.paulohenriquesfdev.listacolecaojogos.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	//injetando uma instancia do GameService pra ser possivel o GameController chamar o GameService
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = gameService.findById(id);
		return result;
		// chama o servise que chama o repository do banco de dados, retorna um GameDTO e retorna o result.
	}
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
}
