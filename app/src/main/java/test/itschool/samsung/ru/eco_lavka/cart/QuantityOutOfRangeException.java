package test.itschool.samsung.ru.eco_lavka.cart;

public class QuantityOutOfRangeException extends RuntimeException {
    private static final long serialVersionUID = 44L;

    private static final String DEFAULT_MESSAGE = "Quantity is out of range";

    public QuantityOutOfRangeException() {
        super(DEFAULT_MESSAGE);
    }

    public QuantityOutOfRangeException(String message) {
        super(message);
    }
}