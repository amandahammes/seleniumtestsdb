package login;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {


    @Test
    public void deveriaEfetuarLoginContaGoogle(){

        //abrir navegador da web com o site escolhido
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("https://www.camicado.com.br");

        //clicar no botão de login
        browser.findElements(By.cssSelector("button > div"));

        //clicar no botão conta google
        browser.findElements(By.cssSelector("#container > div > div.nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb > div > svg > g > path:nth-child(1)"));

        //selecionar a conta google
        browser.findElement(By.xpath("/html/body/div/div[1]/div/div/main/div/div/div[1]/div[1]/div[1]/div[3]/div[2]"));

    }

}
