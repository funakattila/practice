package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.InputFieldPage;
import pages.TestData;

@Epic("Final exam practice")
@Feature("Test Input fields")
public class InputFieldTest extends BaseTest {

    @Test
    @Description("Összeadás valid adatokkal")
    @Order(1)
    public void TestSumTwoNumbers() {
        InputFieldPage inputFieldPage = new InputFieldPage(driver, wait);

        inputFieldPage.navigate();
        inputFieldPage.closePopUp();
        inputFieldPage.addNumbers(TestData.firstA, TestData.firstB);

        String expected = TestData.firstExpectedValue;
        String actual = inputFieldPage.value();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Description("Összeadás invalid adatokkal")
    @Order(2)
    public void TestSumTwoInvalidInputs() {
        InputFieldPage inputFieldPage = new InputFieldPage(driver, wait);

        inputFieldPage.navigate();
        inputFieldPage.closePopUp();
        inputFieldPage.addNumbers(TestData.secondA, TestData.secondB);

        String expected = TestData.secondExpectedValue;
        String actual = inputFieldPage.value();

        Assertions.assertEquals(expected, actual);
    }
}
