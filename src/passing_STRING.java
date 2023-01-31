import java.util.Scanner;
public class passing_STRING {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("write the colour : ");
            String colour = in.next();
            paint(colour);
        }

        static void paint(String type){
            System.out.println(type);
        }
    }
