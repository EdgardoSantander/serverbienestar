package mx.buap.bienestaremocional.controller;

import mx.buap.bienestaremocional.dto.MetricaDTO;
import mx.buap.bienestaremocional.service.MetricaService;
import mx.buap.bienestaremocional.service.MetricaServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bienestar-emocional")
public class BienestarEmocionalController {
    // Importante recordar que con la anotacion Autowired le dejaremos la creacion de la implementacion de esta interface a spring
    // nota: recuerda que para que esto sea posible la clase que implementa a MetricaService debe ir decorada con la anotacion service y aparte implements MetricaService
    @Autowired
    private MetricaService metricaService;



    @GetMapping("/todos")
    public ResponseEntity<List<MetricaDTO>> getAllMetrics(){
        return ResponseEntity.ok(metricaService.getAllMetricas());

    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<MetricaDTO> getMetrica(@PathVariable Long id){

        return ResponseEntity.ok(metricaService.getMetrica(id));

    }

    @PostMapping("/obtener")
    public ResponseEntity<?> setBodyMovile(@RequestBody MetricaDTO metricaDTO){

        metricaService.guardarMetrica(metricaDTO);
        System.out.println("Nueva entrada registrada");
        return ResponseEntity.ok(metricaDTO);
    }
}
