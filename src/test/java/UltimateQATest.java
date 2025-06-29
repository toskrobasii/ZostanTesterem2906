import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

//enkapsulacja (hermetyzacja) w Javie - public / private / protected etc.
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

}
