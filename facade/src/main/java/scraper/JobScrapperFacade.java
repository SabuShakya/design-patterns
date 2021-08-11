package scraper;

import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021-08-11
 */
public class JobScrapperFacade {

    public Object scrapJobs(String site, String website, String jobName) throws NoSuchFieldException {
        WebCaller webCaller = new WebCaller();
        try {
            Document document = webCaller.callWeb(website, jobName);
            if (site.equalsIgnoreCase("meroJobs")) {
                MeroJobScrapper meroJobScrapper = new MeroJobScrapper();
                Object scrapedJobs = meroJobScrapper.scrape(document);
                return scrapedJobs;
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new NoSuchFieldException("Invalid Website +" + website);
        }
        return null;
    }
}
