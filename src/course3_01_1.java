import java.util.Arrays;

public class course3_01_1 {
    public static void main(String[] args) {
        String[] printStr = {
                "      _        _       __     __       _            _        ___ ",
                "     | |      / \\      \\ \\   / /      / \\          / |      ( _ )",
                "  _  | |     / _ \\      \\ \\ / /      / _ \\         | |      / _ \\",
                " | |_| |    / ___ \\      \\ V /      / ___ \\        | |  _  | (_) |",
                "  \\___/    /_/   \\_\\      \\_/      /_/   \\_\\       |_| (_)  \\___/"
        };
        // выведем на экран
        for (int i = 0; i < printStr.length; i++) {
            System.out.println(printStr[i] + " ");
        }
    }
}
