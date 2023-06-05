import java.util.Arrays;

// (){}[]
public class Main {
    public static String[] input = {"{", "}" ,"(", ")", "[", "]"};

    public static String keyImput(String tab) {
            if (tab == "{" || tab == "}" || tab == "(" || tab == ")" || tab == "[" || tab == "]")
                System.out.println("true");
            else {
                System.out.println("false");
            }
        return tab;
    }

    public static void main(String[] args) {
            String tab = "]";
            System.out.println(keyImput(tab));
        System.out.println(Arrays.toString(input));
    }
}