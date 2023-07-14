package com.paulohenriquesfdev.listacolecaojogos.dto;

import com.paulohenriquesfdev.listacolecaojogos.entities.GameList;

public class GameListDTO {
	
	private Long id;
	private String name;
	
	public GameListDTO() {
		
	}
	
	// nao quero que receba os campos separados, e sim uma entidade
	public GameListDTO(GameList entity) {
		//poderia usar o "BeanUtils" que foi usado em GameDTO, mas como aqui é pequeno da pra fazer um por um
		id = entity.getId();
		name = entity.getName();
	}

	// como nao usamos o "BeanUtils" podemos implementar so os Getters
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
