import external.FileReader;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/12
 */
public class FileReaderAdapter implements DatabaseReader {

    private final FileReader fileReader;

    public FileReaderAdapter(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    @Override
    public Object executeQuery() {
        String[] lines = fileReader.readFile();
        Student[] students = new Student[lines.length];
        int i = 0;

        for (String line : lines) {
            String[] studentData = line.split(",");
            Student student = new Student();
            student.setId(Long.valueOf(studentData[0]));
            student.setFName(studentData[1]);
            student.setLName(studentData[2]);
            student.setGender(studentData[3]);
            student.setAge(Integer.valueOf(studentData[4]));
            students[i++] = student;
        }

        return students;
    }
}
