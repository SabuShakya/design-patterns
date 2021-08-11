package scraper;


import org.jsoup.nodes.Document;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/13
 */
public interface Scraper {

    Object scrape(Document document);
}
