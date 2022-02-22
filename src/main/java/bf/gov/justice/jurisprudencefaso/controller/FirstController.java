package bf.gov.justice.jurisprudencefaso.controller;

import bf.gov.justice.jurisprudencefaso.domain.Personne;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {

    @GetMapping()
    public Personne firtMethod() {
        return new Personne("Bieve", "Lelievre");
    }
}

