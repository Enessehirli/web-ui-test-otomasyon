package Steps;

import Pages.MainPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class MainSteps {
    MainPage mainPage = new MainPage();

    @Before
    public void initializeTest() {
        System.out.println("Test Başlatılıyor");
        mainPage.starTest();
    }

    @After
    public void tearDownTest() {
        System.out.println("Test Bitti");
        mainPage.endTest();
    }

    @Given("Logo kontrol edildi")
    public void test() {
        mainPage.checkLogo();
    }


    @And("Pop up kapatildi")
    public void cikmaButonunaTiklanir() {
        mainPage.kapatma();
    }

    @And("Giris yapa tiklandi")
    public void girisYapaTiklanir() {
        mainPage.giris();
    }

    @And("Giris yap secildi")
    public void girisYapilir() {
        mainPage.girisYapaTiklanir();
    }


    @And("Email girildi{string}")
    public void emailGirildi(String Email) {
        mainPage.emailBox(Email);
    }


    @And("Password girildi{string}")
    public void passwordGirildi(String Password) {
        mainPage.passwordTexting(Password);
    }


    @And("Giris buttonuna tiklandi")
    public void butonaTiklanir() {
        mainPage.girisYapilir();
    }

    @And("One çikan urune tiklandi")
    public void urunSecilir() {
        mainPage.urunSecildi();
    }


    @And("Sepete eklendi")
    public void urunEklenir() {
        mainPage.sepetEklendi();
    }

    @And("Sepete gidildi")
    public void sepeteGidilir() {
        mainPage.sepeteGidildi();
    }


    @And("Sepette bir urun oldugu kontrol edilir")
    public void sepetteBirUrunOlduguKontrolEdilir() {
        mainPage.sepetUrunKontrol();
    }

    @And("Sepetteki tum urunler silinir")
    public void sepettekiTumUrunlerSilinir() {
        mainPage.sepetiTemizle();
    }

    @And("Sepette urun kalmadigi gorulur")
    public void sepetteUrunKalmadigiGorulur() {
        mainPage.sepetBosKontrol();
    }
}

