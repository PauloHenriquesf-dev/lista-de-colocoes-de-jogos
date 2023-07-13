package com.paulohenriquesfdev.listacolecaojogos.dto;

import com.paulohenriquesfdev.listacolecaojogos.entities.Game;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}
	
	//Instancia o GameMinDTO a partir do objeto Game, copiando os dados do Game para o DTO
	public GameMinDTO(Game entity) {
		id = entity.getId(); // pega o id da entidade e salva no id do DTO
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
}
