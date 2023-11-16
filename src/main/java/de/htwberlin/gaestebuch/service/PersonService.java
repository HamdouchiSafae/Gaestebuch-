package de.htwberlin.gaestebuch.service;

import de.htwberlin.gaestebuch.persistence.PersonEntity;
import de.htwberlin.gaestebuch.persistence.PersonRepository;
import de.htwberlin.gaestebuch.web.api.Person;
import de.htwberlin.gaestebuch.web.api.PersonCreateRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
    public List<Person> findAll(){
        List<PersonEntity> persons = personRepository.findAll();
        return persons.stream()
                .map(this::transformEntity)
                .collect(Collectors.toList());

    }
    public Person create(PersonCreateRequest request){
        var personEntity = new PersonEntity(request.getFirstName(), request.getLastName(), request.isInvited());
        personEntity = personRepository.save(personEntity);
        return transformEntity(personEntity);
    }

    private Person transformEntity(PersonEntity personEntity){
        return new Person(
                personEntity.getId(),
                personEntity.getFirstName(),
                personEntity.getLastName(),
                personEntity.getInvited()
        );

    }
}
