package OOP.OOP.ShowChar.OOP;


//
//

public class ShowChar {
    // create the function
    public static void showChar (String str, int position) {
        System.out.println(str.charAt(position));

    }

    public static void main(String[] args) {

//        test: should output "w"
        showChar("New York", 2);

        // test 2: should output capital letter "W"
        showChar("Hello World", 6);

    }
}
