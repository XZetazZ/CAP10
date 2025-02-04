package eticket;

public class NotEnoughStock extends Exception {
    public NotEnoughStock(String message) {
        super(message);
    }
}