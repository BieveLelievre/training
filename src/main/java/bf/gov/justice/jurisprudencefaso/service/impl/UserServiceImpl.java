package bf.gov.justice.jurisprudencefaso.service.impl;

import bf.gov.justice.jurisprudencefaso.domain.User;
import bf.gov.justice.jurisprudencefaso.repository.UserRepository;
import bf.gov.justice.jurisprudencefaso.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            throw new RuntimeException("Le password de l'utilisateur n'existe pas !");
        }
        if (user.getRoles() == null || user.getRoles().isEmpty()) {
            user.setRoles("ROLE_USER");
        }
        user.setActif(true);
        return userRepository.save(user);
    }

    @Override
    public Optional<User> get(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Page<User> getAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public void delete(String username) {
        userRepository.deleteByUsername(username);
    }
}
