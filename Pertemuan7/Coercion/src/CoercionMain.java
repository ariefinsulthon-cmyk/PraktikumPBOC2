public class CoercionMain {
    public static void main(String[] args) {
        // Nilai Semula
        int x = 65;
        // System.out.println("int: " + x);
        
        // int ke char
        char output = (char)x;
        System.out.println("char: " + output);

        // int ke double
        double output2 = (double)(x);
        System.out.println("double: " + output2);

        // real ke int
        double output3 = (double)x;
        int output4 = (int)(output3);
        System.out.println("int: " + output4);

        // Konkatenasi & Penjumlahan
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        System.out.println("Konkatenasi: " + S);
        int Z = (int)(Integer.parseInt(X) + Integer.parseInt(Y));
        System.out.println("Penjumlahan: " + Z);

        // Konkatenasi & Penjumlahan
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        System.out.println("Konkatenasi: " + R);
        double W = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Penjumlahan: " + W);

        // Konversi nilai S ke Integer
        int A = Integer.parseInt(S);
        System.out.println("Konversi ke Integer: " + A);

        // Konversi nilai A ke String
        String B = String.valueOf(A);
        System.out.println("Konversi ke String: " + B);
    }
}
