package mx.buap.bienestaremocional.controller;

import mx.buap.bienestaremocional.dto.MetricaDTO;
import mx.buap.bienestaremocional.service.MetricaService;
import mx.buap.bienestaremocional.service.MetricaServiceImple;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bienestar-emocional")
public class BienestarEmocionalController {

    public MetricaService metricaService = new MetricaServiceImple();

    @GetMapping("/todos")
    public ResponseEntity<List<MetricaDTO>> getAllMetrics(){

        return ResponseEntity.ok(metricaService.getAllMetricas());

    }

    @GetMapping("/buscar")
    public ResponseEntity<?> getMetrica(@PathVariable Long id){

        return ResponseEntity.ok(metricaService.getMetrica(id));

    }

    @PostMapping("/obtener")
    public ResponseEntity<?> setBodyMovile(@RequestBody MetricaDTO metricaDTO){

        metricaService.guardarMetrica(metricaDTO);

        return ResponseEntity.ok(metricaDTO);
    }
}
