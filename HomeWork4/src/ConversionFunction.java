public class ConversionFunction {

    public String intToString (int number) {
        return Integer.toString(number);
    }

    public String doubleToString (double number) {
        return Double.toString(number);
     }

    public int stringToInt (String something) {
        return Integer.parseInt(something);
    }

    public double stringToDouble (String something) {
        return Double.parseDouble(something);
    }
}

