package mx.buap.bienestaremocional.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetricaDTO implements Serializable {
    private Long id;
    private Long pasosTotales;  // Pasos dados
    private Double frecuenciaCardiaca;  // Frecuencia cardiaca
    private Double presionArterialSys;  // Presion arterial Systolica
    private Double presionArterialDia;  // Presion arterial Diastolica
    private Long suenioCont;  // Total de horas dormidas en minutos
    private Double ejercicioCont; // Conteo de ejercicio hecho
    private Double ritmoCardiacaTotal; // conteo del ritmo cardiaco

}
