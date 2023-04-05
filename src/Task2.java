import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Задача 2* (не обязательно).
// Дана последовательность слов (количество, а затем и сами слова, каждое слово с новой строки).
//
// Вывести все самые короткие слова через пробел.
//
// Оценить временную и пространственную сложность алгоритма.
public class Task2 {
  public static void main(String[] args) throws IOException {  // O(n) - time, O(n) - space
    List<String> list = new ArrayList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder result = new StringBuilder();
    System.out.print("Введите количество слов: ");
    int n = Integer.parseInt(br.readLine());
    System.out.println("Введите " + n + " слов, каждое с новой строки:");
    for (int i = 0; i < n; ++i) { // O(n) - time, O(n) - space
      String input = br.readLine();
      list.add(input);
    }
    Collections.sort(list);
    System.out.println("Результирующая строка:");
    for (int i = 0; i < list.size(); ++i) {  // O(n) - time, O(n) - space
      if (i != 0) {
        System.out.print(" ");
      }
      System.out.print(list.get(i));
    }
    System.out.println();
  }
}