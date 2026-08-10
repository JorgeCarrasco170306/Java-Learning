package DataTypes;

public class App {
    // there are 2 data types in java, primitive and non-primitive data types
    public static void main(String[] args) {
        String greetings = "Hello, World!";
        System.out.println(greetings);
        System.out.println("greetings.toUpperCase() = " + greetings.toUpperCase());

        int number = 10;
        System.out.println("number = " + number);

        boolean isJavaFun = true;

        int numero = 10;

        if (isJavaFun) {
            System.out.println("isJavaFun = " + isJavaFun);
            numero = 17;
        }

        System.out.println("numero = " + numero);

        var name = "Jorge";

        System.out.println("name = " + name);

    }
}