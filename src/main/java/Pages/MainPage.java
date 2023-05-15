package Pages;

import Utility.Driver;
import Utility.Movement;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.Wait;

public class MainPage {

    Movement movement = new Movement();

    public void starTest() {
        movement.startDriver();
    }

    public void endTest() {
        movement.endDriver();
    }

    public final By logo = By.xpath("//img[@src='/assets/dist/images/vatanlogo.svg']");

    public void checkLogo() {
        movement.isElementExist(logo);
    }

    public final By cikmaButton = By.xpath("//a[@class='close-privacy-btn']");

    public void kapatma() {
        movement.clickFunction(cikmaButton);
    }

    public final By girisButton = By.id("type");

    public void giris() {
        movement.clickFunction(girisButton);
    }

    public final By GirisYapButton = By.xpath("//a[@href='/login?returnUrl=%2F&logtab=signin']");

    public void girisYapaTiklanir() {
        movement.clickFunction(GirisYapButton);
    }


    public final By email = By.id("email");


    public void emailBox(String Email) {
        movement.clickFunction(email);
        movement.sendKeysFunction(email, Email);
    }

    public final By passwordBox = By.id("pass");


    public void passwordTexting(String Password) {
        movement.sendKeysFunction(passwordBox, Password);
    }

    public final By girisButtonu = By.id("login-button");

    public void girisYapilir() {
        movement.clickFunction(girisButtonu);
    }


    public final By entiklandi = By.xpath("//img[@src='https://cdn.vatanbilgisayar.com/Upload/PRODUCT/apple/thumb/113144-1-3_small.jpg']");

    public void urunSecildi() {
        movement.isElementPresentWait(entiklandi);
        movement.clickFunction(entiklandi);
    }


    public final By sepeteekle = By.xpath("//button[@id='add-to-cart-button']");

    public void sepetEklendi() {
        movement.isElementPresentWait(sepeteekle);
        movement.clickFunction(sepeteekle);
    }

    public final By sepeTonay = By.xpath("//input[@class='btn btn-dark-blue goToBasket']");

    public void sepeteGidildi() {
        movement.isElementPresentWait(sepeTonay);
        movement.clickFunction(sepeTonay);
    }

    public final By urunSepet = By.xpath("//div[@class='basket-cart__table-row'][1]");

    public void sepetUrunKontrol() {
        movement.isElementExist(urunSepet);
    }

    public final By sepetBos = By.xpath("//h3[text() = 'SEPETİNİZDE ÜRÜN YOK!']");

    public void sepetBosKontrol() {
        movement.isElementExist(sepetBos);

    }

    public final By sepetiTemizle = By.xpath("//a[@class='basket-cart__footer-link']");


    public void sepetiTemizle() {
        movement.clickFunction(sepetiTemizle);


    }
}
