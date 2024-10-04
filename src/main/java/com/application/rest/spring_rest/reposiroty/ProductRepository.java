package com.application.rest.spring_rest.reposiroty;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends CrudRepository<Producto, Long> {

}
