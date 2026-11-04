import java.util.Scanner;
public class Even_odd {
    int num;

    public void  input(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a no.");
        num=sc.nextInt();
    }
    public void checkEvenodd(){
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd"); 
    }
    public static void main(String[] args) {
        Even_odd e=new Even_odd();
        e.input();
        e.checkEvenodd();
    }
}
