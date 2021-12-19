package tests.selenoid;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Tags.SELENOID;
import static io.qameta.allure.Allure.step;
import static screens.ScreenSelectors.*;

@Tag(SELENOID)
public class SelenoidAndroidSelenideTests extends SelenoidTestBase {

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
    @DisplayName("Check Settings About section in Wikipedia Android app")
    void checkAboutSectionTest() {
        step("Click menu button", () ->
                $(MobileBy.id(menuButton)).click());
        step("Click settings button", () ->
                $(MobileBy.id(settingsButton)).click());
        step("Check About section", () ->
                $$(MobileBy.id(title)).findBy(text("About")).shouldBe(visible));
    }

    @CsvSource({
            "Wikipedia language",
            "Show images",
            "Show link previews",
            "Send usage reports",
            "Send crash reports"
    })
    @ParameterizedTest()
    @DisplayName("Check Settings page in Wikipedia Android app")
    void checkSettingsPageTest(String sectionName) {
        step("Click menu button", () ->
                $(MobileBy.id(menuButton)).click());
        step("Click setting button", () ->
                $(MobileBy.id(settingsButton)).click());
        step("Check section text", () -> {
            String section = $(MobileBy.xpath("//*[@text='" + sectionName + "']")).getAttribute("text");
            Assertions.assertEquals(section, sectionName);
        });
    }
}