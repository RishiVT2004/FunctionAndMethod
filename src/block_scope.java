public class block_scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
        //int a =130>> value of a cant be initialised twice(already initialsed in the same method)
             //if/*
            a = 100;
            System.out.println(a);

                int c =99;
        // value initialised in the block will remain in the block
        }
        /*System.out.println(c);//cant be used outside the block*/

        }

    }
// anything initialised outside can be used inside the block but not vice versa//
// anything initialised outside the block can't be initialised inside the block but anything
//initialised inside the block can be initialsed outside.e