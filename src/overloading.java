public class overloading {
    public static void main(String[] args) {
     //   name(100)
        // name("pizza");
        int ans = sum(4,8,5);
        System.out.println(ans);
        //at compile time it decides which function to run//
    }
    static int sum(int a,int b) {
        return a + b;

    }
    static int sum(int a,int b, int c){
        return a+b+c;
    }

    static void name(int a){
        System.out.println(a);

    }

    static void name(String food){
        System.out.println(food);
    }
}
//2 or more function can exist when their parameters are different