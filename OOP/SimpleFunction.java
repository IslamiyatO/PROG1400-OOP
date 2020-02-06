package OOP;

public class SimpleFunction {


//    To create a function

    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    public static int modifyNumber(int num){
        num = num + 1;
        return num;

    }
    public static  MyNumber modifyMyNumber (MyNumber num){
        num.number = num.number + 1;
        return num;

    }

    public static String addName(String name){
        name = "Hello, " + name;
        return name;

    }


    public static void main(String[] args) {

//        passing by value

        int original_number = 12345;
        System.out.println(modifyNumber(original_number));
        System.out.println(original_number);

//        also passed value
        String name = "John";
        System.out.println(addName(name));
        System.out.println(name);

//        passed by reference
        MyNumber num = new MyNumber();
        num.number = 12345;
      MyNumber mynum = modifyMyNumber(num);
        System.out.println("My number = " + mynum.number);
        System.out.println("Original MyNumber = " + num.number);



//        System.out.println("Hello World!");

        //        calling the function

//        printHelloWorld();
    }
}
