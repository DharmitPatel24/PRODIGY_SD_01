import java.util.Scanner;

public class task01 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter temperature unit (C/K/F): ");
        char unit = scanner.next().charAt(0);

        double celsius = 0;
        double kelvin = 0;
        double fahrenheit = 0;

        if (unit == 'C' || unit == 'c') {
            celsius = temperature;
            kelvin = celsiusToKelvin(celsius);
            fahrenheit = celsiusToFahrenheit(celsius);
        } else if (unit == 'K' || unit == 'k') {
            kelvin = temperature;
            celsius = kelvinToCelsius(kelvin);
            fahrenheit = celsiusToFahrenheit(celsius);
        } else if (unit == 'F' || unit == 'f') {
            fahrenheit = temperature;
            celsius = fahrenheitToCelsius(fahrenheit);
            kelvin = celsiusToKelvin(celsius);
        } else {
            System.out.println("Invalid temperature unit!");
            return;
        }

        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Kelvin: " + kelvin);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
