//Реализовать методы
//        endsWith()+
//        charAt()+
//        contains()+
//        equals()+

public class Main {
    public static void main(String[] args) {
        endsWith();
        charAt();
        contains();
        equals();
    }

    public static void endsWith() {
        System.out.println("Lesson #1");
        String Str = new String("Пирожки мягкие");
        boolean retVal;

        retVal = Str.endsWith("Пирожки мягкие");
        System.out.println("Возвращаемое значение: " + retVal);

        retVal = Str.endsWith("Пирожки вкусные");
        System.out.println("Возвращаемое значение: " + retVal + "\n");
    }

    public static void charAt() {
        System.out.println("Lesson #2");
        String s = "Я буду хорошим программистом!";
        char result1 = s.charAt(9);
        char result2 = s.charAt(10);
        System.out.println("Cимвол строки по счету - " + result1);
        System.out.println("Cимвол строки по счету - " + result2 + "\n");
    }

    public static void contains() {
        System.out.println("Lesson #3");
        String str1 = "Свежие пирожки очень вкусные";
        if (str1.contains("пирожки")) {
            System.out.println("Ключевое слово найдено" + "\n");
        } else {
            System.out.println("Ключевое слово не найдено" + "\n");
        }
    }

    public static void equals() {
        System.out.println("Lesson #4");
        String Str1 = "Цветы сакуры очень красивы";
        String Str2 = Str1;
        String Str3 = new String("Кудрявые кактусы очень смешные");
        boolean retVal;

        retVal = Str1.equals(Str2);
        System.out.println("Строка Str1 равна строке Str2? Ответ: " + retVal );

        retVal = Str1.equals(Str3);
        System.out.println("Строка Str1 равна строке Str3? Ответ: " + retVal );
    }
}






