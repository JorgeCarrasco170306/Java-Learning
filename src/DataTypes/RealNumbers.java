package DataTypes;

public class RealNumbers {
    public static void main(String[] args) {

        float s = 3.4028235E38f; // -> 32 bits 4 bytes
        double d = 1.7976931348623157E308; // -> 64 bits 8 bytes

        IO.println();
        IO.println("float = " + s);
        IO.println("float bits value = " + Float.SIZE);
        IO.println("float bytes value = " + Float.BYTES);
        IO.println("float min value = " + Float.MIN_VALUE);
        IO.println("float max value = " + Float.MAX_VALUE);

        IO.println();
        IO.println("double = " + d);
        IO.println("double bits value = " + Double.SIZE);
        IO.println("double bytes value = " + Double.BYTES);
        IO.println("double min value = " + Double.MIN_VALUE);
        IO.println("double max value = " + Double.MAX_VALUE);

    }
}
