package case4.problem;

public class FreightCalculator {
    public double calculateFreight(String shippingType, double weight) {
        if (shippingType.equals("CORREIOS")) {
            return weight * 10;
        } else if (shippingType.equals("TRANSPORTADORA")) {
            return weight * 15;
        } else if (shippingType.equals("RETIRADA")) {
            return 0;
        } else {
            throw new IllegalArgumentException("Tipo de frete não suportado");
        }
    }
}