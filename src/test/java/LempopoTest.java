import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LempopoTest {

    @Test(priority = 1, description = "Limpopo testing 1")
    public void doConcat(){
        Assert.assertEquals("review","review");
    }
    @Test(priority = 2, description = "Limpopo testing 2")
    public void doReview(){
        Assert.assertEquals("epitome","epiphany");
    }

    @Step
    public static void checkSumStep(int num1, int num2, int expectedSum) {
        Assert.assertTrue(num1 + num2 == expectedSum, "Сумма слагаемых не соответствует ожидаемому значению");
    }

    @Test
    public void simpleTest2() {
        checkSumStep(3, 2, 5);
        checkSumStep(5, 4, 9);
        checkSumStep(5, 5, 11);
    }

    @Attachment
    public static byte[] getBytes(String resourceName) throws IOException {
        return Files.readAllBytes(Paths.get("src/main/resources", resourceName));
    }

    @Step("Проверка эквивалентности строки {str1} строке {str2}")
    public static void checkStringEqualsStep(String str1, String str2) throws IOException {
        Assert.assertTrue(str1.equals(str2), "Строки не эквивалентны");
        getBytes("picture.jpg");
        getBytes("text.txt");
    }

    @Test
    public void simpleTest4() throws IOException {
        String darkSouls = "Dark souls 3";
        checkStringEqualsStep(darkSouls, darkSouls);
    }
}
