import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Task 01
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

//        Task02
        String fullNameUpper = lastName.toUpperCase() + " " + firstName.toUpperCase() + " " + middleName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpper);

        task03();
        task04();
        task05();
        task06();
        task07();
    }

    public static void task03() {
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace('ё', 'е'));
        System.out.println("-----------------------------------------");

    }

    public static void task04() {
        String fullName = "Ivanov Ivan Ivanovich";
        String lastName = fullName.substring(fullName.indexOf("I"), fullName.indexOf(" "));
        String firstName = fullName.substring(fullName.indexOf("I"), fullName.indexOf("n") + 1);
        String middleName = fullName.substring(fullName.lastIndexOf('I'), fullName.lastIndexOf("vich") + 4);

        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Отчество сотрудника - " + middleName);
        System.out.println("-----------------------------------------");
    }

    public static void task05() {
        String fullName = "ivanov ivan ivanovich";
        char[] fullNameChar = fullName.toCharArray();

        for (int i = 0; i < fullNameChar.length; i++) {
            if (i == 0) {
                fullNameChar[i] = Character.toUpperCase(fullNameChar[0]);
            }
            if (fullNameChar[i] == ' ') {
                fullNameChar[i + 1] = Character.toUpperCase(fullNameChar[i + 1]);
            }
        }

        System.out.print("Верное написание Ф.И.О сотрудника с заглавных букв - ");
        for (char c : fullNameChar) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println("-----------------------------------------");
    }

    public static void task06() {
        String str1 = "135";
        String str2 = "246";

        StringBuilder str = new StringBuilder(str1.substring(0, 1));
        str.append(str2.substring(0, 1));
        str.append(str1.substring(1, 2));
        str.append(str2.substring(1, 2));
        str.append(str1.substring(2, 3));
        str.append(str2.substring(2, 3));

        System.out.println(str);
        System.out.println("-----------------------------------------");
    }

    public static void task07() {
        String str = "aabccddefgghiijjkk";
        char[] strToChar = str.toCharArray();
        char[] newStr = new char[str.length()];

        for (int i = 0; i < strToChar.length - 1; i++) {
            for (int j = i + 1; j < strToChar.length; j++) {
                if (strToChar[i] == strToChar[j]) {
                    newStr[i] = strToChar[i];
                }
            }
        }

        for (char c : newStr) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println("-----------------------------------------");
    }
}