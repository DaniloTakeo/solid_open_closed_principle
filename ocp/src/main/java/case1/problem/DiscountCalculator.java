package case1.problem;

public class DiscountCalculator {
    public double calculateDiscount(String customerType, double price) {
        switch (customerType) {
            case "REGULAR":
                return price * 0.05; // 5% de desconto
            case "VIP":
                return price * 0.10; // 10% de desconto
            case "EMPLOYEE":
                return price * 0.20; // 20% de desconto
            default:
                return 0;
        }
    }
}