public class returning_STRING {

        public static void main(String[] args) {
            String message = greet();
            System.out.println(message);
        }

        static String greet(){

            String greeting = "are you well";
            return greeting;
        }
    }
//greet()-->function call
//message--> string variable
//greeting --> string that store value of greet() function
//message --> returns value of greet()


