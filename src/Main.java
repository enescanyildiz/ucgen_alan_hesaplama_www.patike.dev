import java.util.Scanner;
public class Main {
 public static void main(String[] args)
 {
  Scanner input= new Scanner (System.in);
  double a,b,c,s,k,cevre;
  System.out.print("Lütfen Birinci Kenar Uzunluğunu Giriniz: ");
  a=input.nextDouble();
  System.out.print("Lütfen İkinci Kenar Uzunluğunu Giriniz: ");
  b=input.nextDouble();
  System.out.print("Lütfen Üçüncü Kenar Uzunluğunu Giriniz: ");
  c=input.nextDouble();
  cevre=a+b+c;
  System.out.println("Üçgenin Çevresi: "+cevre);
  s=cevre/2;
  k=s*(s-a)*(s-b)*(s-c);
  System.out.print("Üçgenin Alanı: "+ Math.sqrt(k));
 }
}