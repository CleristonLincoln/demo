package com.Sample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sample.Entity.Programa;

@Repository
public interface ProgramaRepository extends CrudRepository<Programa, Long> {

}
