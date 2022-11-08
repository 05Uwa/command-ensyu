import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	    System.out.println("身長を入力してください");
        double g = new Scanner(System.in).nextInt();
	    System.out.println("体重を入力してください");
        double kg = new Scanner(System.in).nextInt();
        double cm = g/100.0;

        double bmi = kg/(cm*cm);

        double f = ((double)Math.round(bmi*100))/100;
        System.out.println("BMIは"+ f);
        
        
    }
}
