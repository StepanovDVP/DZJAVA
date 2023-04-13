import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


public class homework3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
//        System.out.println(strings); // [string, my_string]
        List<Integer> even = new ArrayList<>();
        even.add(15);
        even.add(12);
        even.add(5);
        even.add(4);
        removeEvenNumber(even);
    }

    static void removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        System.out.println(numbers);
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println(numbers);
    }

    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        System.out.println(strings);
        Iterator<String> it = strings.iterator();
        while (it.hasNext()){
            try {
                Integer.parseInt(it.next());
                it.remove();
// число
            } catch (NumberFormatException e) {
// не число
            }
        }
        System.out.println(strings);
    }
}

