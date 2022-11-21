package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent{
    WebElement myElement;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "banner-accept-button")
    private WebElement acceptCookies;

    @FindBy(id = "btnMyAccount")
    private WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(),'Giriş Yap')]")
    private WebElement loginButton2;

    @FindBy(id = "email") // keytorc.test1@gmail.com
    private WebElement emailInput;

    @FindBy(id = "pass") // 123456
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton3;

    @FindBy(xpath = "//span[contains(text(),'HESABIM')]") // -----------------------------
    public WebElement loginSuccess;

    @FindBy(id = "navbar-search-input")
    private WebElement searchInput; //samsung

    @FindBy(className = "search__button")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class='product-list__product-name']") // -----------------------
    public WebElement samsungProduct;

    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[4]/div[3]/nav[1]/ul[1]/li[2]/a[1]")
    private WebElement secondPage;

    @FindBy(xpath = "//div[@class='product-list product-list--list-page']1]")
    public WebElement secondPageList;

    @FindBy(xpath = "//h3[contains(text(),'Samsung Galaxy S21 FE 5g 128 Gb Akıllı Telefon Bey')]")
    public WebElement thirdProduct;

    @FindBy(id = "fav_Icon")
    private WebElement addToFav;

    @FindBy(xpath = "(//button[@type='button'])[12]")
    private WebElement closeFancybox;

    @FindBy(linkText = "Favori Ürünlerim")
    private WebElement myFavList;

    @FindBy(xpath = "//div[@class='basket-cart__product-name']") // -------------
    public WebElement addedProduct;

    @FindBy(className = "basket-cart__product-remove")
    private WebElement remove;

    @FindBy(xpath = "//p[contains(text(),'Favori ürünlerinizi takip edebilirsiniz.')]")
    public WebElement situation;



    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {

            case "acceptCookies":
                myElement = acceptCookies;
                break;

            case "loginButton":
                myElement = loginButton;
                break;

            case "loginButton2":
                myElement = loginButton2;
                break;

            case "loginButton3":
                myElement = loginButton3;
                break;

            case "searchButton":
                myElement = searchButton;
                break;

            case "secondPage":
                myElement = secondPage;
                break;

            case "thirdProduct":
                myElement = thirdProduct;
                break;

            case "addToFav":
                myElement = addToFav;
                break;

            case "closeFancybox":
                myElement = closeFancybox;
                break;

            case "myFavList":
                myElement = myFavList;
                break;

            case "remove":
                myElement = remove;
                break;

        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "emailInput":
                myElement = emailInput;
                break;

            case "passwordInput":
                myElement = passwordInput;
                break;

            case "searchInput":
                myElement = searchInput;
                break;


        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "samsungProduct":
                myElement = samsungProduct;
                break;
        }

        findElementAndVerifyContainsText(myElement, msg);
    }









}
