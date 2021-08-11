package scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021-08-11
 */
public class WebCaller {

    Document callWeb(String website, String jobName) throws IOException {
        return Jsoup.connect(website + jobName).get();
    }
}
