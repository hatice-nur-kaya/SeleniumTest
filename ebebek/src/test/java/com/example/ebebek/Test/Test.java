package com.example.ebebek.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\haticenur\\Desktop\\ebebek\\ebebek\\src\\drivers\\chromedriver.exe");
        WebDriver  driver =new ChromeDriver();
        driver.get("https://www.e-bebek.com/"); // Web sayfasi acilir.
        driver.manage().window().maximize();
        WebElement searchelement = driver.findElement(By.id("txtSearchBox"));
        searchelement.click();
        searchelement.sendKeys("Biberon"); //Search kısmına biberon yazdırdık
        searchelement.sendKeys( Keys.RETURN);
        WebElement first_img = driver.findElement(By.className("css=.col-6:nth-child(1) .is-initialized > .ng-star-inserted")); //ilk ürün seçme
        first_img.click();
        // WebElement first_img = driver.findElement(By.cssSelector("https://cdn05.e-bebek.com/mnresize/300/300/media/p/hosgeldin-bebek-biberon-seti_5060420232462_01.jpg"));
        // first_img.click();
        // // String cssSelectorForImage = "#__next >https://cdn05.e-bebek.com/mnresize/300/300/media/p/hosgeldin-bebek-biberon-seti_5060420232462_01.jpg > svg";
        // // driver.findElement(By.cssSelector(cssSelectorForImage)).click();
        // WebElement firstproduct = driver.findElement(By.cssSelector("a[title=\"Hoşgeldin Bebek Biberon Seti\"]"));
        // firstproduct.click();
        //driver.findElement(By.cssSelector("a[title=\"Hoşgeldin Bebek Biberon Seti\"]"))
        WebElement addToCart =driver.findElement(By.id("addToCartBtn")); //Sepete Ekle
        addToCart.click();
        WebElement btnShowCart =driver.findElement(By.id("btnShowCart")); //Sepeti görüntüle
        btnShowCart.click();
    }
}
