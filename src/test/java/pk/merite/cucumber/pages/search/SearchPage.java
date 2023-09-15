package pk.merite.cucumber.pages.search;

import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import pk.merite.cucumber.pages.Page;

@Component
public class SearchPage extends Page {

    @Value("${page.search.url}")
    private String url;
    /*@Value("${page.search.txt-search.xpath}")
    private String txtSearchXpath;
    @Value("${page.search.btn-search.xpath}")
    private String btnSearchXpath;*/

    @Value("${page.search.nav-home.xpath}")
    private String navHomeXpath;

    @Value("${page.search.nav-about.xpath}")
    private String navAboutXpath;

    @Value("${page.search.nav-contact.xpath}")
    private String navContactXpath;

    @Value("${page.search.nav-accounts.xpath}")
    private String navAccountsXpath;

    public void load() {
        load(url);
        //just to stay on browser for 10 sec
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //visible(By.xpath(navAboutXpath));
    }

    /*public void enterSearchText(String text) {
        input(text, By.xpath(txtSearchXpath));
    }

    public void clickSearch() {
        click(By.xpath(btnSearchXpath));
    }*/


    public void clickNavHome() {
        click(By.xpath(navHomeXpath));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickNavAbout() {
        click(By.xpath(navAboutXpath));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickNavContact() {
        click(By.xpath(navContactXpath));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickNavAccounts() {
        click(By.xpath(navAccountsXpath));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
