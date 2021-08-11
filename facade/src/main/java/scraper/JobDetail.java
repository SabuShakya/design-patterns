package scraper;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/13
 */
@Getter
@Setter
@ToString
public class JobDetail {

    private String companyImageUrl;

    private String title;

    private String company;

    private String companyAddress;

    private List<String> keySkills;

    private String deadline;

    private Integer views;

}
