package case4.solution;

public class TransporterFreight implements FreightService {
    @Override
    public double calculate(double weight) {
        return weight * 15;
    }
}