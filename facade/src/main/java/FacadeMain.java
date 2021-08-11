import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import scraper.JobScrapperFacade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/13
 */
public class FacadeMain {

    public static void main(String[] args) throws NoSuchFieldException {
        JobScrapperFacade jobScrapperFacade = new JobScrapperFacade();
        Object jobs = jobScrapperFacade.scrapJobs("merojobs", "https://merojob.com/search/?q=", "Java");
        System.out.printf("Scrapped:::::::: ",jobs.toString());
    }
}
