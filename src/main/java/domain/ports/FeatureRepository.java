package domain.ports;

import domain.entities.Feature;
import java.util.List;
import java.util.Optional;

public interface FeatureRepository {

    void save(Feature feature);

    Optional<Feature> findById(Long id);

    List<Feature> findAll();

    void delete(Feature feature);
}