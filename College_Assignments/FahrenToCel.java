public class FahrenToCel {
    public static void main(String[] args) {
        double fahren = 98.2;
        double cel = (fahren - 32.0) * 5.0/9.0;
        System.out.println("Temperature in Celsius: " + cel);
    }
}