import java.util.*;

public class LambdaList {
  public static void main(String[] args) {
    ArrayList<String> mahasiswaList = new ArrayList<>();
    mahasiswaList.add("Alice");
    mahasiswaList.add("Bob");
    mahasiswaList.add("Charlie");
    mahasiswaList.add("David");

    // Lambda digunakan sebagai parameter
    mahasiswaList.forEach(nama -> System.out.println(nama));
  }
}
