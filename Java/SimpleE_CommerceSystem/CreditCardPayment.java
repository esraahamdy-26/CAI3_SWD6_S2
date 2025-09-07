package SimpleE_CommerceSystem;

public class CreditCardPayment implements Payment{
    @Override
    public void processPayment() {

        /* ******************************************************
           !! performs the payment once the card is validated
           1. Sending the amount, card details, and transaction metadata.
           2. Handling responses (success, declined, etc.).
         ********************************************************/

    }

    @Override
    public void validateCard() {

        /* ******************************************************
           !! check whether the card details are valid
           1. Expiry date
           2. Card Type
         ********************************************************/

    }
}
