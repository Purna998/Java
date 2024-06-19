import java.util.*;
public class Concur {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double INR,USD,Yen,Yuan,Peso;
        System.out.println("How much NPR currency do you want to convert?");
        double NPR=obj.nextDouble();
        System.out.println("In which currency you want to convert among:\n 1.INR\n 2.USD\n 3.Yen\n 4.Yuan\n 5.Peso");
        int cur=obj.nextInt();
        switch (cur){
            case 1:
                INR=NPR/1.6;
                System.out.println("NPR "+NPR+"= INR"+INR);
                break;
            case 2:
                USD=NPR/116;
                System.out.println("NPR "+NPR+"= USD"+USD);
                break;
            case 3:
                Yen=NPR/0.92;
                System.out.println("NPR "+NPR+"= Yen"+Yen);
                break;
            case 4:
                Yuan=NPR/18.35;
                System.out.println("NPR "+NPR+"= Yuan"+Yuan);
                break;
            case 5:
                Peso=NPR/2.26;
                System.out.println("NPR "+NPR+"= Peso"+Peso);
                break;
        }
    }
}
