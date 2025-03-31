package case4.solution;

public class CorreiosFreight implements FreightService {
    @Override
    public double calculate(double weight) {
        return weight * 10;
    }
}