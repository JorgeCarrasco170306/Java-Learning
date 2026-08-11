void main() {
    String a = IO.readln("Please enter the name number 1 -> ");
    String b = IO.readln("Please enter the name number 2 -> ");
    String c = IO.readln("Please enter the name number 3 -> ");

    String[] nombres = {a, b, c};

    for (int i = 0; i < nombres.length; i++) {
        IO.print(Character.toString(nombres[i].charAt(1)).toUpperCase()
                + "."
                + nombres[i].substring(nombres[i].length() - 2)
        );

        if(i < nombres.length - 1 ) IO.print("_");
    }
}