package mx.buap.bienestaremocional.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "metricas")
@Data
public class Metrica{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id; // Identificador unico genrado automaticamente gracias a la anotacion
    private Long pasosTotales;  // Pasos dados
    private Double frecuenciaCardiaca;  // Frecuencia cardiaca
    private Double presionArterialSys;  // Presion arterial Systolica
    private Double presionArterialDia;  // Presion arterial Diastolica
    private Long suenioCont;  // Total de horas dormidas en minutos
    private Double ejercicioCont; // Conteo de ejercicio hecho
    private Double ritmoCardiacaTotal; // conteo del ritmo cardiaco

}
