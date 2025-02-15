package br.com.lucazolvr.twtodos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucazolvr.twtodos.models.Todo;

public interface TodoRepository extends JpaRepository <Todo, Long> {
    
}
