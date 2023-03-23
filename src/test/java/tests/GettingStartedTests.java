package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

public class GettingStartedTests extends TestBase {

    @Test
    void gettingStartedTest() {
        String firstPageText = "The Free Encyclopedia";
        String secondPageText = "New ways to explore";
        String pageThree = "Reading lists with sync";
        String pageFour = "Send anonymous data";

        step("Check text on first page", () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(firstPageText));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Check " + secondPageText + " text and tap Continue", () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(secondPageText));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Check " + pageThree + " text and tap Continue", () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(pageThree));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Check " + pageFour + " text", () ->
                $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(pageFour)));
    }
}