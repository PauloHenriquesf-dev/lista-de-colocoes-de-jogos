package com.paulohenriquesfdev.listacolecaojogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulohenriquesfdev.listacolecaojogos.entities.Game;

// Componente da camada de acesso a dados
// componente para fazer consultas no banco: inserir, atualizar, deletar... 
public interface GameRepository extends JpaRepository<Game, Long> {
	
}
