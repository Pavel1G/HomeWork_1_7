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
    }

    public static void task03() {
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace('ё', 'е'));
    }
}