package com.paulohenriquesfdev.listacolecaojogos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulohenriquesfdev.listacolecaojogos.dto.GameListDTO;
import com.paulohenriquesfdev.listacolecaojogos.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	//injetando uma instancia do GameService pra ser possivel o GameController chamar o GameService
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
}
