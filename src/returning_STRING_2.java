import java.util.Scanner;
public class returning_STRING_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("write the command : ");
        String command = in.next();
        String report = message(command );
        System.out.println(report);
    }
    static String message(String info){
        String message = info + " ,Roger that !";
        return message;
    }
}
