package DataTypes;

public class PrimitiveBoolean {
    public static void main(String[] args) {

        boolean isJavaFun = true;

        double d = 1203.43e-3;
        float f = 1.2456e2f;

        boolean isDGreaterThanF = d > f;
        boolean tgt = 3 > 2;

        IO.println("isJavaFun = " + isJavaFun);
        IO.println("isDGreaterThanF = " + isDGreaterThanF);
        IO.println("Three greater than 2 -> " + tgt);
    }
}
