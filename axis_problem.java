package conditional;
import java.util.Scanner;
public class axis_problem {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  value: ");
        int x = sc.nextInt();
        System.out.println("Enter your  value: ");
        int y = sc.nextInt();

        if(x==0 && y==0){
            System.out.println("The point are in the origin");
        }
        else if(x==0){
            System.out.println("The point in the y axis");
        }
        else if(x==y){
            System.out.println("The point in the between x axis and y axis");
        }
        else{
            System.out.println("The point in the x axis");
        }
    }
}
