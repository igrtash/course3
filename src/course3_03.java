import java.util.Scanner;
import java.util.regex.*;

public class course3_03 {

    public static boolean validUserName(String s_value) {
        /*if (Pattern.matches("^[a-zA-Z]{3,16}$", s_value)) {
            System.out.println("UserName valid");
            return true;
        } else {
            System.out.println("UserName NO valid");
            return false;
        }*/
        return Pattern.matches("^[a-zA-Z]{3,16}$", s_value);
    }

    public static boolean validNums(String s_value) {
        /*if (s_value.length() >= 1 && s_value.length() <= 5) {
            System.out.println("nums valid");
        } else {
            System.out.println("nums NO valid");
            return false;
        }
        try {
            Integer i = Integer.valueOf(s_value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }*/
        /*if (!Pattern.matches("^[0-9]{2,5}$", s_value)) {
            System.out.println("nums NO valid");
            return false;
        } else {
            System.out.println("nums valid");
            return true;
        }*/
        return Pattern.matches("^[0-9]{2,5}$", s_value);
    }

    public static Integer sumNums(String s_value) {
        if (s_value.length() == 1) {
            return Integer.valueOf(s_value);
        } else if (s_value.length() >= 1 ) {
            return Integer.valueOf(s_value.substring(s_value.length() - 1))
                    + sumNums(s_value.substring(0, s_value.length() - 1));
        } else {
            return 0;
        }
    }

    public static String num2word(Integer i_value) {
        String[] nword = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        if (i_value >= 0 && i_value <= 9) {
            return nword[i_value];
        } else {
            return "не определена";
        }
    }

    public static void main(String[] args) {
        // печать входящих параметров
        System.out.println("args.count = " + args.length);
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] = " + args[i]);
            }
        }
        String userName = new String();
        String numsStr = new String();
        // обработка входящих параметров
        if (args.length == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите два параметра <ИМЯ> и <ЧИСЛО> через пробел, далее нажмите <ВВОД>");
            System.out.println("<ИМЯ> - слово латинскими буквами");
            System.out.println("<ЧИСЛО> - от 2 до 5 разрядов");
            String input_s = sc.nextLine();
            String[] args_splited = input_s.trim().split(" ");
            userName = args_splited[0];
            if (args_splited.length == 2) numsStr = args_splited[1];
            else System.out.println("Задано неверное кол-во параметров");
        } else if (args.length == 1) { // как пример "Igor 12345"
            String[] args_splited = args[0].trim().split(" ");
            userName = args_splited[0];
            if (args_splited.length == 2) numsStr = args_splited[1];
            else System.out.println("Задано неверное кол-во параметров");
        } else if (args.length == 2) {
            userName = args[0];
            numsStr = args[1];
        } else {
            System.out.println("Задано неверное кол-во параметров. Требуется не более 2.");
            return;
        }
        //System.out.println("userName=[" + userName + "]");
        //System.out.println("numsStr=[" + numsStr + "]");
        if (validUserName(userName)) {
            if (validNums(numsStr)) {
                Integer sums = sumNums(numsStr);
                if (sums < 10) {
                    System.out.println("Добрый день, " + userName + "!");
                    System.out.println("Вы ввели числа "+ numsStr +
                            ", сумма которых равна " + num2word(sums) + ".");
                } else {
                    System.out.println("Неверно задано <ЧИСЛО>. ");
                    System.out.println("Требуется от 2 до 5 разрядоов и сумма всех цифр не должна быть более 10.");
                }
            } else {
                System.out.println("Неверно задано <ЧИСЛО>. ");
                System.out.println("Требуется от 2 до 5 разрядоов и сумма всех цифр не должна быть более 10.");
            }
        } else {
            System.out.println("Неверно задано <ИМЯ>");
            System.out.println("Требуется имя латинскими буквами.");
        }
    }
}
