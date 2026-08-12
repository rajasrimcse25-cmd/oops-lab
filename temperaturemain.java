import java.util.Scanner;
import temperature.Converter;
public class TemperatureMian {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
     Converter obj = new Converter();
     System.out.print("Enter temperature in Celsius:");
     double c = sc.nextDouble();
     system.out.println("Celsius to Fahrenheit = " + obj.celsiusToFahrenheit(c));
     System.out.println("Calsius to Kelvin = " + obj.celsiusToKelvin(c));
     system.out.println("Enter temperature in Fahrenheit:");
     double f = sc.nextDouble();
     System.out.println("Fahrenheit to Celsius = " = + obj.fahrenheitToCesius(f));
     System.out.println("Enter temperature in Kelvin:");
     double K = sc.nextDouble();
     System.out.println("Kelvin to Celsius = " + obj.KelvinToCelsius(K));
     sc.close();
     }
   }  
