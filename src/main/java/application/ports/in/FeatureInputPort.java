package application.ports.in;

import domain.entities.FeatureData;

public interface FeatureInputPort {
    void processFeatureData(FeatureData featureData);
}