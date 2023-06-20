import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("яблоко", "груша", "банан", "яблоко", "слива", "персик", "персик"));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        System.out.println("Задание 1");
        method1(nums);
        System.out.println("Задание 2");
        method2(nums);
        System.out.println("Задание 3");
        method3(words);
        System.out.println("Задание 4");
        method4(strings);
    }

    private static void method1(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    private static void method2(List<Integer> nums) {
        nums = new ArrayList<>(new HashSet(nums));
        Collections.sort(nums);
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    private static void method3(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);

    }

    private static void method4(List<String> strings) {
        Map<String, Integer> mapStrings = new HashMap<>();
        for (String string : strings) {
            if (mapStrings.containsKey(string)) {
                int stringCount = mapStrings.get(string) + 1;
                mapStrings.put(string, stringCount);
            } else {
                mapStrings.put(string, 1);

            }
        }
        System.out.println(mapStrings);
    }
}