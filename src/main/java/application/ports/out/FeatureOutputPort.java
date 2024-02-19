package application.ports.out;

public interface FeatureOutputPort {
    void sendData(Object data);
    void triggerEvent(Object eventData);
}