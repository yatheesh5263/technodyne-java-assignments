public class IfLoops {

    public static void main(String[] args) {
        int num = 18;
        if (num >= 18) {  // Fixed condition
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        temperatureConversion();
    }

    public static void temperatureConversion() {
        float celsiusTemp = 12.00f;
        float fahrenheit = (celsiusTemp * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        if (celsiusTemp < 10) {
            System.out.println("Cold");
        } else if (celsiusTemp > 10) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }

        Discount(); 
    }

    public static void Discount() {  
        float totalamount = 550.00f; 
        float discount = 0.00f;

        if (totalamount < 100) {
            discount = 0;
        } else if (totalamount <= 500) {
            discount = totalamount * 0.10f; 
        } else {
            discount = totalamount * 0.20f; 
        }

        float finalamount = totalamount - discount;

        System.out.println("Total amount: " + totalamount);
        System.out.println("Discount: " + discount);
        System.out.println("Total after discount: " + finalamount);
    }
}
