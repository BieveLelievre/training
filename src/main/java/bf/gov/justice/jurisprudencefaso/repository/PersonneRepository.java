package bf.gov.justice.jurisprudencefaso.repository;

import bf.gov.justice.jurisprudencefaso.domain.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {

}
