import java.util.Scanner;
public class Loss{
    public static void main(String args[]){
        float cp,sp;
        Scanner sc=new Scanner(System.in);
        cp=sc.nextFloat();
        sp=sc.nextFloat();
        float res= ((cp-sp)/cp)*100;
        System.out.printf("%.2f%n", res);

    }
}