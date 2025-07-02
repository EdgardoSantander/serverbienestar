package mx.buap.bienestaremocional.service;

import jakarta.persistence.EntityNotFoundException;
import mx.buap.bienestaremocional.dto.MetricaDTO;
import mx.buap.bienestaremocional.entity.Metrica;
import mx.buap.bienestaremocional.repository.MetricaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MetricaServiceImple implements MetricaService{

    @Autowired
    private MetricaRepository metricaRepository;



    @Override
    public void guardarMetrica(MetricaDTO metricaDTO) {
       // Uso de Builder en lugar de hacer instancia de objeto con new Metrica, solo ponemos Metrica.builder()
        Metrica metrica = Metrica.builder().ejercicioCont(metricaDTO.getEjercicioCont()).
                pasosTotales(metricaDTO.getPasosTotales()).frecuenciaCardiaca(metricaDTO.getFrecuenciaCardiaca())
                .ritmoCardiacaTotal(metricaDTO.getRitmoCardiacaTotal()).presionArterialDia(metricaDTO.getPresionArterialDia()).
                presionArterialSys(metricaDTO.getPresionArterialSys()).suenioCont(metricaDTO.getSuenioCont()).build();


        metricaRepository.save(metrica);

    }

    @Override
    public List<MetricaDTO> getAllMetricas() {
        List<MetricaDTO> metricas = metricaRepository.findAll().stream().map(metricaRepository -> {
            MetricaDTO metrica = new MetricaDTO();
            metrica.setId(metricaRepository.getId());
            metrica.setEjercicioCont(metricaRepository.getEjercicioCont());
            metrica.setFrecuenciaCardiaca(metricaRepository.getFrecuenciaCardiaca());
            metrica.setPresionArterialSys(metricaRepository.getPresionArterialSys());
            metrica.setPresionArterialDia(metricaRepository.getPresionArterialDia());
            metrica.setRitmoCardiacaTotal(metricaRepository.getRitmoCardiacaTotal());
            metrica.setSuenioCont(metricaRepository.getSuenioCont());
            metrica.setPasosTotales(metricaRepository.getPasosTotales());

            return metrica;
        }).collect(Collectors.toList());
        return metricas;
    }

    @Override
    public MetricaDTO getMetrica(Long id) {


        MetricaDTO metricadt = metricaRepository.findById(id).map(metrica -> {
             MetricaDTO metric = new MetricaDTO();
            metric.setId(metrica.getId());
            metric.setEjercicioCont(metrica.getEjercicioCont());
            metric.setFrecuenciaCardiaca(metrica.getFrecuenciaCardiaca());
            metric.setPresionArterialSys(metrica.getPresionArterialSys());
            metric.setPresionArterialDia(metrica.getPresionArterialDia());
            metric.setRitmoCardiacaTotal(metrica.getRitmoCardiacaTotal());
            metric.setSuenioCont(metrica.getSuenioCont());
            metric.setPasosTotales(metrica.getPasosTotales());

             return metric;
         }).orElseThrow( () -> new EntityNotFoundException("no se encontro la metrica con el id: "+id));


       return  metricadt;
    }
}
