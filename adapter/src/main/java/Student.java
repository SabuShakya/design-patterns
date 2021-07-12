import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/12
 */
@ToString
@Getter
@Setter
public class Student {

    private Long id;

    private String fName;

    private String lName;

    private String gender;

    private Integer age;
}
