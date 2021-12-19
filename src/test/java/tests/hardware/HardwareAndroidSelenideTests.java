package tests.hardware;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Tags.HARDWARE;
import static io.qameta.allure.Allure.step;
import static screens.ScreenSelectors.*;


@Tag(HARDWARE)
public class HardwareAndroidSelenideTests extends HardwareTestBase {

    @Test
    @DisplayName("Successful search in Wikipedia Android app")
    void searchTest() {
        back();

        step("Type search", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id(search)).val("BrowserStack");
        });
        step("Verify content found", () ->
                $$(MobileBy.id(searchResult))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @DisplayName("First Screen")
    void checkFirstScreenTest() {
        step("First screen check", () -> {
            $(MobileBy.id(primaryTextView))
                    .shouldHave(Condition.text("The Free Encyclopedia …in over 300 languages"));
            $(MobileBy.id(onboardingSkipButton)).isEnabled();
            $(MobileBy.id(onboardingForwardButton)).click();
        });
    }

    @Test
    @DisplayName("Second Screen")
    void checkSecondScreenTest() {
        step("First screen go through", () -> {
            $(MobileBy.id(onboardingForwardButton)).click();
        });
        step("Second screen check", () -> {
            $(MobileBy.id(imageView)).isDisplayed();
            $(MobileBy.id(onboardingSkipButton)).isEnabled();
            $(MobileBy.id(primaryTextView))
                    .shouldHave(Condition.text("New ways to explore"));
            $(MobileBy.id(onboardingForwardButton)).click();
        });
    }

    @Test
    @DisplayName("Third Screen")
    void checkThirdScreenTest() {
        step("First screen go through", () -> {
            $(MobileBy.id(onboardingForwardButton)).click();
        });
        step("Second screen go through", () -> {
            $(MobileBy.id(onboardingForwardButton)).click();
        });
        step("Third screen check", () -> {
            $(MobileBy.id(imageView)).isDisplayed();
            $(MobileBy.id(onboardingSkipButton)).isEnabled();
            $(MobileBy.id(primaryTextView))
                    .shouldHave(Condition.text("Reading lists with sync"));
            $(MobileBy.id(imageView)).isDisplayed();
            $(MobileBy.id(onboardingForwardButton)).click();
        });
    }

    @Test
    @DisplayName("Fourth Screen")
    void checkFourthScreenTest() {
        step("First screen go through", () -> {
            $(MobileBy.id(onboardingForwardButton)).click();
        });
        step("Second screen go through", () -> {
            $(MobileBy.id(onboardingForwardButton)).click();
        });
        step("Third screen go through", () -> {
            $(MobileBy.id(onboardingForwardButton)).click();
        });
        step("Fourth screen check", () -> {
            $(MobileBy.id(imageView)).isDisplayed();
            $(MobileBy.id(primaryTextView))
                    .shouldHave(Condition.text("Send anonymous data"));
            $(MobileBy.id(switchView))
                    .shouldHave(Condition.text("Send usage data")).isEnabled();
            $(MobileBy.id(onboardingDoneButton))
                    .shouldHave(Condition.text("GET STARTED")).isEnabled();
        });
    }
}

