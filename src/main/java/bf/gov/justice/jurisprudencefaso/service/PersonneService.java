package bf.gov.justice.jurisprudencefaso.service;

import bf.gov.justice.jurisprudencefaso.domain.Personne;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface PersonneService {

    Personne create(Personne personne);
    Optional<Personne> get(int id);
    Page<Personne> getAll(Pageable pageable);
}
