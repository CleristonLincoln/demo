package com.Sample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sample.Entity.Gestor;

@Repository
public interface GestorRepository extends CrudRepository<Gestor, Long> {

}
