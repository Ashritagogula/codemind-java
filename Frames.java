import java.util.Scanner;
public class Frames{
    public static void main(String args[]){
        int n,m,x;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        x=sc.nextInt();
        int area=2*(n+m);
        int res=area*x;
        System.out.println(res);
    }
}