package case1.solution;

public class EmployeeDiscount implements DiscountStrategy {

	@Override
    public double applyDiscount(double price) {
        return price * 0.20; // 20% de desconto
    }
}
