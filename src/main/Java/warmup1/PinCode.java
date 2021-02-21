package warmup1;

public class PinCode {

    static int secretPincode = 1123;
    static int counter = 3;
    static int count = 0;

    public static boolean validPinCode(int pincode) {
        System.out.println("Hello.Please write your pincode to the blank");

        try {
            if (pincode == secretPincode) {
                System.out.println("Card is valid.Please choose your language ");
                return true;
            } else {
                throw new InvalidNumberException("Pin code is invalid");
            }

        } catch (InvalidNumberException invalidNumberException) {
            System.out.println("Invalid pin code.Please input pin code again");
            count = count + 1;
            if (count == counter) {
                System.out.println("Cart is blocked");
                System.out.println("Call to the Bank: +37529 144 44 44");
                System.exit(1);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        validPinCode(1133);
        validPinCode(1133);
        validPinCode(1133);



    }
}

