package case4.solution;

public class FreightCalculator {
    private final FreightService freightService;

    public FreightCalculator(FreightService freightService) {
        this.freightService = freightService;
    }

    public double calculate(double weight) {
        return freightService.calculate(weight);
    }
}