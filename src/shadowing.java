public class shadowing {
    static int x = 7; //available to MAIN scope.//it will be shadowed at line 6
    public static void main(String[] args) {//function scope
        System.out.println(x);//7
        int x = 10;
        System.out.println(x);//10--> only in main scope
        name();
    }
    static void name(){
        System.out.println(x);//7
    }


}

//scope for x begins when x is initialised..
//shadowing--> using 2 variable with same name in the scope that overlaps