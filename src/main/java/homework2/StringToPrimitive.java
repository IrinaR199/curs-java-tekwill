package homework2;

public class StringToPrimitive {
    public static void run() {

        String strBoolean = "tRue";
        String strByte = "120";
        String strShort = "32000";
        String strInt = "147895632";
        String strLong = "987654321987654321";
        String strDouble = "4444.5d";
        String strFloat = "2354.56f";


        boolean valueBoolean = Boolean.parseBoolean(strBoolean);
        byte valueByte = Byte.parseByte(strByte);
        short valueShort = Short.parseShort(strShort);
        int valueInt = Integer.parseInt(strInt);
        long valueLong = Long.parseLong(strLong);
        double valueDouble = Double.parseDouble(strDouble.replace("d", ""));
        float valueFloat = Float.parseFloat(strFloat.replace("f", ""));


        System.out.println("Boolean: " + valueBoolean);
        System.out.println("Byte: " + valueByte);
        System.out.println("Short: " + valueShort);
        System.out.println("Int: " + valueInt);
        System.out.println("Long: " + valueLong);
        System.out.println("Double: " + valueDouble);
        System.out.println("Float: " + valueFloat);
    }
}
