import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

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


}
