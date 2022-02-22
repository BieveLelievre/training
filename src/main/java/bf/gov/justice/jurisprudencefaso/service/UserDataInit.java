package bf.gov.justice.jurisprudencefaso.service;

import bf.gov.justice.jurisprudencefaso.domain.User;
import bf.gov.justice.jurisprudencefaso.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.stream.Stream;

@Component
public class UserDataInit {
    private Logger log = LoggerFactory.getLogger(UserDataInit.class);
    private final UserRepository userRepository;

    public UserDataInit(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void  init() {
        log.info("user data initialization");
        User admin = new User("Bieve", "Bieve", true, "ROLE_ADMIN,ROLE_USER");
        User user = new User("User", "Bieve", true, "ROLE_USER");
        if(userRepository.count() == 0) {
            Stream.of(admin, user).forEach(u -> userRepository.save(u));
        }

    }
}
