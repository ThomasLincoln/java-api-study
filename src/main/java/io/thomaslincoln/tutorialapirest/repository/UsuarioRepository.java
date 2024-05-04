package io.thomaslincoln.tutorialapirest.repository;

import org.springframework.data.repository.CrudRepository;

import io.thomaslincoln.tutorialapirest.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>{

}
