package bf.gov.justice.jurisprudencefaso.repository;

import bf.gov.justice.jurisprudencefaso.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);

    void deleteByUsername(String username);
}
