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
}
