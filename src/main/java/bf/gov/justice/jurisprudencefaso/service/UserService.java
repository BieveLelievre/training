package bf.gov.justice.jurisprudencefaso.service;

import bf.gov.justice.jurisprudencefaso.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {

    User create(User user);
    Optional<User> get(String username);
    Page<User> getAll(Pageable pageable);
    void delete(String username);
}
