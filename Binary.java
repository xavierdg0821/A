public class Binary {
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, power);
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        String[] binaryNumbers = {"2", "1111", "100"};

        for (String binary : binaryNumbers) {
            int decimal = binaryToDecimal(binary);
            System.out.println("Binary: " + binary + " - Decimal: " + decimal);
        }
    }
}