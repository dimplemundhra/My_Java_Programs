public class MaxOfThree {
    public static void main(String[] args) {
        int num1 = 29,num2 = 15, num3 = 4,max;
        if(num1 > num2 && num1>num3) {
            max = num1;
        }
       else if(num2 > num1 && num2>num3 ) {
            max = num2;
        }
       else {
            max = num3;
        }
System.out.println("Maximum number: " + max);
    }
}
