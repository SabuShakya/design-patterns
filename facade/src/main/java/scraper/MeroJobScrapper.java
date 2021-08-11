package scraper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021-08-11
 */
public class MeroJobScrapper implements Scraper{
    @Override
    public Object scrape(Document document) {
        Elements elements = document.select("div.card ");

        List<JobDetail> jobDetails = new ArrayList<>();

        for (Element element : elements) {
            Elements jobTitle = element.select("h1.text-primary").select("a");
            Elements image = element.select("img.border");
            Elements companyName = element.select("h3");
            Elements companyAddress = element.select("span.text-muted > span");
            Elements keySkills = elements.select("div.media").get(1).select("div.media-body > span").get(1).select("span > span");
            Elements deadline =  elements.select("div.card-footer > p.text-primary > span").get(1).select("span");
            Elements views = elements.select("div.card-footer > div.dropdown");

            JobDetail jobDetail = new JobDetail();
            jobDetail.setTitle(jobTitle.text());
            jobDetail.setCompanyImageUrl("https://merojob.com" + image.attr("src"));
            jobDetail.setCompany(companyName.text());
            jobDetail.setCompanyAddress(companyAddress.text());

            List<String> skills = new ArrayList<>();
            for (Element skill : keySkills) {
                skills.add(skill.text());
            }

            jobDetail.setKeySkills(skills);
            jobDetail.setDeadline(deadline.text());
//            jobDetail.setViews(views.text());
            System.out.println(jobDetail);

        }
        return jobDetails;
    }
}
