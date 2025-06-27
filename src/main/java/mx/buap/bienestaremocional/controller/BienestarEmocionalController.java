package mx.buap.bienestaremocional.controller;

import mx.buap.bienestaremocional.dto.MetricaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bienestar-emocional")
public class BienestarEmocionalController {


    @GetMapping("/todos")
    public ResponseEntity<?> getAllMetrics(){

        int personaje = 5;
        return ResponseEntity.ok(personaje);

    }

    @PostMapping("/obtener")
    public ResponseEntity<?> setBodyMovile(@RequestBody MetricaDTO metricaDTO){


        return ResponseEntity.ok(metricaDTO);
    }
}
