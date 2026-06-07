import java.util.*;

public class LatihanLambda {
  public static void main(String[] args) {
    Map<Integer,String> dataMap = new HashMap<>();
    dataMap.put(104, "Sulthon");
    dataMap.put(102, "Zaidan");
    dataMap.put(103, "Dzaki");

    // Menggunakan lambda untuk mencetak nilai dari map
    dataMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
  }
}
