
import java.util.*;

public class homework4 {
    public static void main(String[] args) {
//        Реализовать приложение, которое:
//        Принимает от пользователя и запоминает строки
//        Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
//        Если введено revert, то удаляем последнюю введеную строку
//        Если введено exit, то завершаем программу
//        java
//        c++
//        python
//        c#
//        print
//        < [c#, python, c++, java]
//        revert
//        print
//        < [python, c++, java]
//        exit
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        String input;
        while (!(input = sc.nextLine()).equals("exit"))
        {
            if ("print".equals(input)){
            System.out.println(reverseList(list));
            } else if("revert".equals(input)){
                list.removeLast();
            }
            else {list.add(input);
            }
        }
    }
        public static<T> List<T> reverseList(List<T> list)
        {
            List<T> reverse = new ArrayList<>(list);
            Collections.reverse(reverse);
            return reverse;
        }
}

