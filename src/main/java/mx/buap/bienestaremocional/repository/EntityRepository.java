package mx.buap.bienestaremocional.repository;

import mx.buap.bienestaremocional.entity.Metrica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EntityRepository extends JpaRepository<Metrica,Long> {
}
