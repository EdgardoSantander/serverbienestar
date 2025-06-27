package mx.buap.bienestaremocional.service;


import mx.buap.bienestaremocional.dto.MetricaDTO;

import java.util.List;

public interface MetricaService {
    public void guardarMetrica(MetricaDTO metricaDTO);
    public List<MetricaDTO> getAllMetricas();
    public MetricaDTO getMetrica(Long id);
}
