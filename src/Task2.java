import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// Задача 2* (не обязательно).
// Дана последовательность слов (количество, а затем и сами слова, каждое слово с новой строки).
//
// Вывести все самые короткие слова через пробел.
//
// Оценить временную и пространственную сложность алгоритма.
public class Task2 {
  public static void main(String[] args) throws IOException { // O(n) - time, O(n) - space
    List<String> list = new ArrayList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder result = new StringBuilder();
    int shortestLength = -1;
    System.out.print("Введите количество слов: ");
    int n = Integer.parseInt(br.readLine());
    System.out.println("Введите " + n + " слов, каждое с новой строки:");
    for (int i = 0; i < n; ++i) { // O(n) - time, O(n) - space
      String input = br.readLine();
      list.add(input);
      if (shortestLength == -1) {
        shortestLength = input.length();
      } else if (input.length() < shortestLength) {
        shortestLength = input.length();
      }
    }
    for (String word: list) { // O(n) - time, O(1) - space
      if(word.length() == shortestLength) {
        if (!result.isEmpty()) {
          result.append(" ");
        }
        result.append(word);
      }
    }
    System.out.println("Результирующая строка:");
    System.out.println(result);
  }
}