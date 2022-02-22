package bf.gov.justice.jurisprudencefaso.controller;

import bf.gov.justice.jurisprudencefaso.domain.Personne;
import bf.gov.justice.jurisprudencefaso.service.PersonneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/personnes")
public class PersonneController {

    private final Logger log = LoggerFactory.getLogger(PersonneController.class);

    private final PersonneService personneService;

    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }

    @PostMapping
    public Personne create(@RequestBody Personne personne) {
        return personneService.create(personne);
    }

    @GetMapping(path = "/{id}")
    public Optional<Personne> get(@PathVariable(name = "id") int id) {
        return personneService.get(id);
    }

    @GetMapping()
    @PreAuthorize("hasRole('ADMIN')")
    public List<Personne> getAll(Pageable pageable) {
        log.info("Requete de liste de personne");
        return personneService.getAll(pageable).getContent();
    }
}
