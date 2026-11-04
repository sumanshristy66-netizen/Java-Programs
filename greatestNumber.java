import java.util.Scanner;
public class greatestNumber{
    int a;
    int b;

    public void input(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number:");
        a=sc.nextInt();
        b=sc.nextInt();

    }
    public void check_greatestNumber(){
        if(a>b)
            System.out.println("a is greatest.");
        else
            System.out.println("b is greatest.");
    }
    public static void main(String[] args) {
        greatestNumber g=new greatestNumber();
        g.input();
        g.check_greatestNumber();
    }
}