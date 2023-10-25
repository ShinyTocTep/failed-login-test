package FLT;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginTest {
    @Test
    void failedLoginTest() {

       Configuration.browser = "firefox";
        open("https://qa.guru/cms/system/login/");
        $("[name=email]").setValue("test@gmail.com");
        $("[name=password]").setValue("123").pressEnter();
        $(".btn-success").shouldHave(text("Неверный пароль"));
    }
}
