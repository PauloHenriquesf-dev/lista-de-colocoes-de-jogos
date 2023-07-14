package com.paulohenriquesfdev.listacolecaojogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulohenriquesfdev.listacolecaojogos.entities.GameList;

// Componente da camada de acesso a dados
public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
