import java.util.Scanner;
public class vote {
    int age;

    public void input(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter ypur age:");
        age=sc.nextInt();
    }
    public void check_eligibility(){
        if(age>=18){
            System.out.println("You can vote.");
        }
        else{
            System.out.println("You cannot vote.");
        }
    }
    public static void main(String[] args){
        vote v=new vote();
        v.input();
        v.check_eligibility();
    }
}
