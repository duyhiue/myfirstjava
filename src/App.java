//import java.util.Scanner;
import java.util.Random;
public class App {
	public static void main(String[] args) {
		int a,b,c;
        //Scanner s=new Scanner(System.in);
        Random rad=new Random();
        a=rad.nextInt(100)+1;
        b=rad.nextInt(100)+1;
        c=rad.nextInt(100)+1;
        //s.close();
        System.out.println(a+" "+b+" "+c);
        System.out.println(isTriangle(a, b, c));
	}
    public static boolean isTriangle(int a, int b, int c){
        boolean bo=false;
        if((a+b)>c&&(a+c)>b&&(b+c)>a)
        bo=true;
        return bo;
    }
}