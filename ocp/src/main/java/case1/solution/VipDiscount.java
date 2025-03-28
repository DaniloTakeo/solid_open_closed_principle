package case1.solution;

public class VipDiscount implements DiscountStrategy {

	@Override
    public double applyDiscount(double price) {
        return price * 0.10; // 10% de desconto
    }

}
