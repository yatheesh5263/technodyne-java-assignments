public class switchex1 {
    public static void main (String[] args){
        int day = 5 ;
        switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
 switch2();
    }



    public static void switch2(){
        char grade = 'B' ;
        switch (grade) {
  case 'A':
    System.out.println("Excellent");
    break;
  case 'B':
    System.out.println("Good");
    break;
  case 'C':
    System.out.println("Average");
    break;
  case 'D':
    System.out.println("Below average");
    break;
  case 'F':
    System.out.println("Fail");
    break;
}
    switch3();
    }


    public static void switch3() {
        int num1 = 38;
        int num2 = 10;
        char operator = '-'; 
        
        switch (operator) {  
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
