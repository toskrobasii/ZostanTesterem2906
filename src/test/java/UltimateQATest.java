import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

// enkapsulacja (hermetyzacja) w Javie - public / private / protected etc.
// Inżynieria oprogramowania, architektura, wzorce programistyczne
// dziedziczenie w programowaniu obiektowym 'extends'
public class UltimateQATest extends PageSetup {

    // definicja metod w programowaniu obiektowym i zwracanie wartości funkcji
    @Test
    public void testOne() {
        // szukanie elementów na stronie: atrybuty (id, className, Name), selektorach css, xpath, linkText, partialLinkText, tag
        WebElement button = driver.findElementById("idExample");
        button.click();

        WebElement text = driver.findElementByClassName("entry-title");
        String textSuccess = text.getText();
        Assertions.assertEquals("Button success", textSuccess);
    }


    // sposoby oczekiwania na elementy w Selenium:
    // implicit wait, explicit wait, fluent wait (jako explicit o zwiększonej częstotliwości odpytywania strony), Java Thread.sleep
    @Test
    public void testTwo() throws InterruptedException {
        WebElement nameInput = driver.findElementById("et_pb_contact_name_0");
        nameInput.sendKeys("Tester");

        Thread.sleep(2000);

        WebElement emailInput = driver.findElementById("et_pb_contact_email_0");
        emailInput.sendKeys("tester@test.pl");

        WebElement button = driver.findElementByName("et_builder_submit_button");
        button.click();
    }

    @Test
    public void testThree() {
//        WebElement blueField = driver.findElementByClassName("et_pb_module et_pb_cta_0 et_pb_promo  et_pb_text_align_center et_pb_bg_layout_dark");

        // składnia xpath (podobnie jak katalogi i folderze na dysku twardym)
        // Postać ogólna:     //*[contains(@class, 'nazwaClassName')]
        //                    //*[contains(@class, 'nazwaClassName')]/    -schodzimy niżej w hierarchii

        WebElement blueField = driver.findElementByXPath("//*[contains(@class, 'et_pb_row et_pb_row_2')]//*[contains(@class, 'et_pb_cta_0')]");
        Assertions.assertEquals("rgba(46, 163, 242, 1)", blueField.getCssValue("background-color"));

    }

}
