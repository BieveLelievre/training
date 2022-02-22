package bf.gov.justice.jurisprudencefaso.service.impl;

import bf.gov.justice.jurisprudencefaso.domain.User;
import bf.gov.justice.jurisprudencefaso.domain.Utilistateur;
import bf.gov.justice.jurisprudencefaso.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImp implements UserDetailsService {
    private Logger log = LoggerFactory.getLogger(UserDetailsServiceImp.class);

    private final UserRepository userRepository;

    public UserDetailsServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Load user {}", username);
        User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Bad user " + username));
        // User user = userRepository.findByLogin(username);
        return new Utilistateur(user);
    }
}
