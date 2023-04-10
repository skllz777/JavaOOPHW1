import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Создаем 4 экземпляра класса Person для работы с ними.
        // node1 - родитель для node2
        // node2 - родитель для node3 и node4
        Person node1 = new Person("First","Man");
        Person node2 = new Person("Second","Man", node1);
        Person node3 = new Person("Third","Man", node2);
        Person node4 = new Person("Fourth","Man", node2);



        System.out.println("Перечень людей: " + Person.getPersons());

        System.out.println("Дети человека 1: " + node1.getChildren());
        System.out.println("Дети человека 2: " + node2.getChildren());
        System.out.println("Дети человека 3: " + node3.getChildren());

        System.out.println();

        System.out.println("Родители человека 1: " + node1.getParent());
        System.out.println("Родители человека 2: " + node2.getParent());
        System.out.println("Родители человека 3: " + node3.getParent());
        System.out.println("Родители человека 4: " + node4.getParent());
    }
}