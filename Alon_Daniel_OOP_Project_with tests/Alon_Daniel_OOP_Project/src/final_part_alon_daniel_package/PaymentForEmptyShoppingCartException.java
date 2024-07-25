package final_part_alon_daniel_package;

public class PaymentForEmptyShoppingCartException extends Exception{
    public PaymentForEmptyShoppingCartException() {
        super("The shopping cart is empty, can't pay for that");
    }
}
