package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.RadioButtonPage;
import pages.TestData;

public class RadioButtonTest extends BaseTest {

    @Test
    public void TestSingleCheckedButton() {
        RadioButtonPage radioButtonPage = new RadioButtonPage(driver, wait);

        radioButtonPage.navigate();
        radioButtonPage.firstCheckMaleBtn();
        radioButtonPage.firstCheckBtn();

        String expected = TestData.firstRadioBtnCheckValue;
        String actual = radioButtonPage.getFirstResult();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMultipleCheckedButton() {
        RadioButtonPage radioButtonPage = new RadioButtonPage(driver, wait);

        radioButtonPage.navigate();
        radioButtonPage.checkGender();
        radioButtonPage.checkAge();
        radioButtonPage.secondCheckButton();

        String expected = TestData.secondRadioBtnCheckValue;
        String actual = radioButtonPage.getSecondResult();

        Assertions.assertEquals(expected, actual);
    }

}
