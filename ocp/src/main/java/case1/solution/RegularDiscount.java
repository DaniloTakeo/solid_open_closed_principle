package case1.solution;

public class RegularDiscount implements DiscountStrategy {

	@Override
    public double applyDiscount(double price) {
        return price * 0.05; // 5% de desconto
    }

}
