package case1.solution;

public class DiscountCalculator {
    public double calculateDiscount(DiscountStrategy strategy, double price) {
        return strategy.applyDiscount(price);
    }
}