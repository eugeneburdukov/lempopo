import org.testng.Assert;
import org.testng.annotations.Test;

public class LempopoTest {

    @Test(priority = 1, description = "Lempopo testing")
    public void doConcat(){
        Assert.assertEquals("review","review");
    }
}
