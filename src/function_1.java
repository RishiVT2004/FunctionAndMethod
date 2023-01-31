import java.util.Scanner;
public class function_1 {
    public static void main(String[] args){
        int ans = sum2();//calling of function
        System.out.println(ans);
    }
    // return the value
    static int sum2(){// sum2 --> (function name)
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no 1 : ");
        int num1 = sc.nextInt();
        System.out.println("enter no 2 : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
        //nothing will be executed after return//

    }

}

