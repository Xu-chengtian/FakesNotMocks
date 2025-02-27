class FakeExchange implements Exchange {
    @Override
    public float rate(String origin, String target) {
        if (origin.equalsIgnoreCase("USD") && target.equalsIgnoreCase("Euro")) {
            return 0.8f;
        }
        return 1.0f;
    }
}

public class Main {
    public static void main(String[] args) {
        // Unit Test for Cash class

        // Test setup
        Exchange exchange = new FakeExchange();
        Cash dollar = new Cash(exchange, 100);
        System.out.println("Dollar: " + dollar.toString());

        // Test 'in' method of Cash
        Cash euro = dollar.in("Euro");
        System.out.println("Dollar to Euro: " + euro.toString());
    }
}