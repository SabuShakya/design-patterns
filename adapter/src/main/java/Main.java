import external.MyFileReader;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/12
 */
public class Main {
    public static void main(String[] args) {
        DatabaseReader databaseReader = new MyDatabaseReader();
        String dataFromDb = (String) databaseReader.executeQuery();
        System.out.println("db::::::::::" + dataFromDb);

        DatabaseReader adapter = new FileReaderAdapter(new MyFileReader());
        Student[] dataFromAdapter = (Student[]) adapter.executeQuery();

        System.out.println("adapter:::::::");
        for (Student student : dataFromAdapter) {
            System.out.println("Student ::::::::" + student);
        }

    }
}
