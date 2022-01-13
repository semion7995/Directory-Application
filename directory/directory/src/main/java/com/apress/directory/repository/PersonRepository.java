package com.apress.directory.repository;


import com.apress.directory.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

//описание методов запроса https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods

public interface PersonRepository extends CrudRepository<Person, String> {
    public Person findByEmailIgnoreCase(@Param("email") String email);
}
