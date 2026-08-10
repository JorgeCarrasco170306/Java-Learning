package DataTypes;

public class IntegerPrimitives {
    public static void main(String[] args) {

        byte b = 127; // -> min value is -128 and max value is 127 8 bits 1 byte
        short s = 32767; // -> min value is -32,768 and max value is 32,767 16 bits 2 bytes
        int i = -2_147_483_648; // -> min value is -2,147,483,648 and max value is 2,147,483,647 32 bits 4 bytes
        long l = -9_223_372_036_854_775_808L; // -> min value is -9,223,372,036,854,775,808 and max value is
                                              // 9,223,372,036,854,775,807 64 bits 8 bytes

        System.out.println("byte = " + b);

        System.out.println();
        System.out.println("byte = " + b);
        System.out.println("Byte bits value = " + Byte.SIZE);
        System.out.println("Byte bytes value = " + Byte.BYTES);
        System.out.println("Byte min value = " + Byte.MIN_VALUE);
        System.out.println("Byte max value = " + Byte.MAX_VALUE);

        System.out.println();
        System.out.println("short = " + s);
        System.out.println("Short bits value = " + Short.SIZE);
        System.out.println("Short bytes value = " + Short.BYTES);
        System.out.println("Short min value = " + Short.MIN_VALUE);
        System.out.println("Short max value = " + Short.MAX_VALUE);

        System.out.println();
        System.out.println("int = " + i);
        System.out.println("int bits value = " + Integer.SIZE);
        System.out.println("int bytes value = " + Integer.BYTES);
        System.out.println("int min value = " + Integer.MIN_VALUE);
        System.out.println("int max value = " + Integer.MAX_VALUE);

        System.out.println();
        System.out.println("long = " + l);
        System.out.println("long bits value = " + Long.SIZE);
        System.out.println("long bytes value = " + Long.BYTES);
        System.out.println("long min value = " + Long.MIN_VALUE);
        System.out.println("long max value = " + Long.MAX_VALUE);

    }
}
