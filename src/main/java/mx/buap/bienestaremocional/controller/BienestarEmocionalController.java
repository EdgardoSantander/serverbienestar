package mx.buap.bienestaremocional.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bienestar-emocional")
public class BienestarEmocionalController {


    @GetMapping
    public ResponseEntity<?> getAllMetrics(){

        int personaje = 5;
        return ResponseEntity.ok(personaje);

    }

    @PostMapping
    public ResponseEntity<?> setBodyMovile(){

        int personaje = 5;
        return ResponseEntity.ok(personaje);
    }
}
