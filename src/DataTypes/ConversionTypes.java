package DataTypes;

public class ConversionTypes {

    public static void main(String[] args) {

        // ? string -> primitive

        String nuString = "58";

        int nuInt = Integer.parseInt(nuString);

        IO.println("nuInt = " + nuInt);

        String reaString = "1231.3123";

        double realDouble = Double.parseDouble(reaString);
        IO.println("realDouble = " + realDouble);

        String logicString = "true";

        boolean logicBoolean = Boolean.parseBoolean(logicString);
        IO.println("logicBoolean = " + logicBoolean);

        // ? primitive -> string

        int intPrim = 100;
        String intPrimstr = String.valueOf(intPrim);
        String strDouble = Double.toString(realDouble);
        String bool = Boolean.toString(logicBoolean);

        IO.println("intPrimstr = " + intPrimstr);
        IO.println("strDouble = " + strDouble);
        IO.println("bool = " + bool);

        // ? between primitives -> 

        int intPrim2 = 200;
        long longPrim = 300;

        intPrim2 = (int) longPrim;

        IO.println("intPrim2" + intPrim2);

    }

}
