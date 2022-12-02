import collection.Collextions;

import java.awt.List;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Практическое задание для Java 8
//
//        1. Напишите программу на Java, чтобы создать новый список массивов,
//        добавить несколько городов, вывести их в консоль.
//
//        2. Напишите программу Java для вставки элемента в список массивов в первую позицию.
//
//        3. Напишите программу Java для извлечения элемента (по указанному индексу) из заданного списка массивов.
//
//        4. Напишите программу Java для обновления определенного элемента массива заданным элементом.
//
//        5. Напишите программу на Java для удаления третьего элемента из списка массивов.
//
//        6. Напишите программу Java для поиска элемента в списке массивов.
//
//        7. Напишите программу на Java для сортировки заданного списка массивов.
//
//        8. Напишите программу на Java для копирования одного списка массивов в другой.
//
//        9. Напишите программу на Java для перемешивания элементов в списке массивов.
//
//        10. Напишите программу на Java, чтобы поменять местами элементы в списке массивов.
//
//        11. Напишите программу Java для извлечения части массива
//
//
//
//
//        Java 8 үчүн практикалык тапшырма
//
//        1. Жаңы массив тизмесин түзүү үчүн Java программасын жазыңыз,
//        бир нече шаарларды  кошуп, аларды консольго чыгарыныз.
        ArrayList<String>strings = new ArrayList<>();
        strings.add("Barcelona");
        strings.add("Milan");
        strings.add("Almaty");
        strings.add("Bishkek");
        System.out.println("strings = " + strings);
//
//        2. Массив тизмесине элементти биринчи орунга киргизүү үчүн Java программасын жаз.
//        strings.add(0,"Milan");
//        System.out.println(strings);
//
//        3. Берилген массивдердин тизмесинен элементти (белгиленген индексте) алуу үчүн Java программасын жазыңыз.
//        System.out.println(strings.get(4));
//
//        4. Берилген элемент боюнча белгилүү бир массив элементин озгортуу үчүн Java программасын жазыңыз.
//        System.out.println(strings.set(4,"Osh"));
//
//        5. Массив тизмесинен үчүнчү элементти очуруп салуу үчүн Java программасын жазыңыз.
//        System.out.println(strings.remove(2));
//
//        6. Массив тизмесиндеги элементти издөө үчүн Java программасын жазыңыз.
//        System.out.println(strings.contains("Milan"));
//
//        7. Берилген массивдердин тизмесин сорттоо үчүн Java программасын жазыңыз.
//        Collections.sort(strings);
//        System.out.println("strings = " + strings);
//
//        8. Бир массив тизмесин экинчи масивге көчүрүү үчүн Java программасын жазыңыз.
//        ArrayList<String>strings2 = new ArrayList<>();
//        strings2.add("Naryn");
//        strings2.add("Kara-Kol");
//        strings2.add("Talas");
//        strings2.add("Osh");
//        Collections.copy(strings,strings2);
//        System.out.println("strings :"+strings);
//        System.out.println("strings2 :"+strings2);
//
//        9. Массив тизмесиндеги элементтерди аралаштыруу үчүн Java программасын жазып.
//        Маанилерин консольго чыгарыныз.
//        Collections.shuffle(strings,new Random());
//        System.out.println("strings = " + strings);

//
//        10. Массив тизмесиндеги элементтерди тескери өзгөртүү үчүн Java программасын жазыңыз.
        Collections.reverse(strings);
        System.out.println("strings = " + strings);
    }
//
//        11. Аррейлисттин бир бөлүгүн алуу үчүн Java программасын жазыңыз
//        System.out.println("strings.subList(1,3) = " + strings.subList(1, 3));

    }
