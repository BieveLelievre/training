package bf.gov.justice.jurisprudencefaso.service.impl;

import bf.gov.justice.jurisprudencefaso.domain.Personne;
import bf.gov.justice.jurisprudencefaso.repository.PersonneRepository;
import bf.gov.justice.jurisprudencefaso.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonneServiceImpl implements PersonneService {

    private final PersonneRepository personneRepository;


    public PersonneServiceImpl(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }



    @Override
    public Personne create(Personne personne) {
        return personneRepository.save(personne);
    }

    @Override
    public Optional<Personne> get(int id) {
        return personneRepository.findById(id);
    }

    @Override
    public Page<Personne> getAll(Pageable pageable) {
        return personneRepository.findAll(pageable);
    }
}
