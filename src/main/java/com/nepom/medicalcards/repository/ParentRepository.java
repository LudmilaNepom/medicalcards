package com.nepom.medicalcards.repository;

import com.nepom.medicalcards.data.Person;
import com.nepom.medicalcards.data.QPerson;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "parents", collectionResourceRel = "parents", itemResourceRel = "parent")
public interface ParentRepository extends ExCustomRepository<Person, QPerson, Long> {
    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    <S extends Person> S save(S s);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    <S extends Person> Iterable<S> saveAll(Iterable<S> iterable);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void deleteById(Long id);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void delete(Person tourPackage);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Person> iterable);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void deleteAll();
}
