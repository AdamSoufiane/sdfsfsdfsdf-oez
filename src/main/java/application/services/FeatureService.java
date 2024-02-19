package application.services;

import application.ports.in.FeatureInputPort;
import application.ports.out.FeatureOutputPort;
import domain.entities.Feature;
import domain.ports.FeatureRepository;

public class FeatureService implements FeatureInputPort {

    private final FeatureOutputPort featureOutputPort;
    private final FeatureRepository featureRepository;

    public FeatureService(FeatureOutputPort featureOutputPort, FeatureRepository featureRepository) {
        this.featureOutputPort = featureOutputPort;
        this.featureRepository = featureRepository;
    }

    @Override
    public void processFeatureData(Feature feature) {
        // Implement the business logic here
        // For example, save the feature using the repository
        featureRepository.save(feature);
        // And then send data or trigger an event using the output port
        featureOutputPort.sendData(feature);
    }
}