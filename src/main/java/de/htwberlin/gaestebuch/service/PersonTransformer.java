package de.htwberlin.gaestebuch.service;

import de.htwberlin.gaestebuch.persistence.Gender;
import de.htwberlin.gaestebuch.persistence.PersonEntity;
import de.htwberlin.gaestebuch.web.api.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonTransformer {
    public Person transformEntity(PersonEntity personEntity) {
        String gender = personEntity.getGender() != null ? personEntity.getGender().name() : Gender.UNKNOWN.name();
        return new Person(
                    personEntity.getId(),
                    personEntity.getFirstName(),
                    personEntity.getLastName(),
                    personEntity.getInvited(),
                    gender);

        }
    }

