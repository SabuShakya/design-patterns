/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/08
 */
public class Human implements ProtoType {

    private String name;

    private String lastName;

    private int age;

    public Human() {
        System.out.println(" Human details ");
        System.out.println("------------------------------------------------");
        System.out.println("Name" + "\t" + "Last Name" + "\t" + "Age" + "\t");
    }

    public Human(String name, String lastName, int age) {
        this();
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        showHuman();
    }

    private void showHuman() {
        System.out.println(name + "\t" + lastName + "\t" + age);
    }

    @Override
    public ProtoType clone() {
        return new Human(name, lastName, age);
    }
}
