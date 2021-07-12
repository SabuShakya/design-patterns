package external;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/12
 */
public class MyFileReader implements FileReader {
    @Override
    public String[] readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        String[] lines = new String[1];
        try {
            File file = new File(classLoader.getResource("student.txt").getFile());
            java.io.FileReader fileReader = new java.io.FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int i = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (i > 0) {
                    String[] temp = new String[i + 1];
                    for (int j = 0; j < lines.length; j++) {
                        temp[j] = lines[j];
                    }
                    i++;
                    temp[i - 1] = line;
                    lines = temp;
                } else {
                    lines[i++] = line;
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return lines;
    }
}
