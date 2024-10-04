package com.application.rest.spring_rest.reposiroty;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.rest.spring_rest.entities.Maker;


@Repository
public interface MakerRepository extends CrudRepository<Maker, Long> {


}


