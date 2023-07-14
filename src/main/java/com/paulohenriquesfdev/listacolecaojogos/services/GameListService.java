package com.paulohenriquesfdev.listacolecaojogos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paulohenriquesfdev.listacolecaojogos.dto.GameListDTO;
import com.paulohenriquesfdev.listacolecaojogos.dto.GameMinDTO;
import com.paulohenriquesfdev.listacolecaojogos.entities.GameList;
import com.paulohenriquesfdev.listacolecaojogos.repositories.GameListRepository;

@Service // registrar o componente como sendo do sistema
public class GameListService {
	
	//injetando uma instancia do GameListRepository pra ser possivel o GameService chamar o GameListRepository
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		
		List<GameList> result = gameListRepository.findAll();
		
		//converter a list de GameList que veio do banco de dados (acima) pra uma list de GameListDTO:
		
		List<GameListDTO> listDto = result.stream().map(x -> new GameListDTO(x)).toList();
		
		return listDto;
	}
}
