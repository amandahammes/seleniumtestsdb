package teste;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
    @Test
    public void helloTest(){
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("https://www.camicado.com.br");
        browser.quit();

    }

}
