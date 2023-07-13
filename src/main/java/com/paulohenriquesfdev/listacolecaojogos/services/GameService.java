package com.paulohenriquesfdev.listacolecaojogos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulohenriquesfdev.listacolecaojogos.dto.GameMinDTO;
import com.paulohenriquesfdev.listacolecaojogos.entities.Game;
import com.paulohenriquesfdev.listacolecaojogos.repositories.GameRepository;

@Service // registrar o componente como sendo do sistema
public class GameService {
	
	//injetando uma instancia do GameRepository pra ser possivel o GameService chamar o GameRepository
	@Autowired
	private GameRepository gameRepository;
	
	// funcao que retorna uma lista de games DTO
	public List<GameMinDTO> findAll() {
		
		/* trazer do banco de dados uma lista de games (todos - findAll() ):
		 * findAll busca todos os games, o resultado da consulta q vai ser uma tabela de games
		 * é automaticamente convertida em uma lista de games */ 
		List<Game> result = gameRepository.findAll();
		
		/* queremos so os dados que estao em GameMinDTO,vaos criar uma lista equivalente
		 * transformando todo mundo que for Game para GameMinDTO
		 * map: transforma objetos de uma coisa para outra, o x é o objeto "original"
		 * toList: voltar o stream para uma lista normal */
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		
		return dto;
	}
}
