import java.util.Scanner;
public class King{
    public static void main(String args[]){
        Scanner read= new Scanner(System.in);
        int n= read.nextInt();
        int m= read.nextInt();
        int res=n*5+m*7;
        System.out.println(res);
    }
}