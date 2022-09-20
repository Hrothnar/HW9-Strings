import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        task1
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("fullName = " + fullName);

//        task2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчёта - " + fullName);

//        task3
        String firstName1 = "Семён";
        String middleName1 = "Иванов";
        String lastName1 = "Семёнович";
        String fullName1 = middleName1 + " " + firstName1 + " " + lastName1;
        fullName1.contains("ё");
        fullName1 = fullName1.replace('ё', 'е');
        String[] names = fullName1.split(" ");
        System.out.println(Arrays.toString(names));
    }
}