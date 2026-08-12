import java.util.Scanner;
public class VolumeConversion{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter litres:");
    double litres = sc.nextDouble();
    double millilitres = litres*1000;
    System.out.println("Millilitres =" + millilitres);
    sc.close();
}
  }
