import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"})
public class MainTest {
    @BeforeClass
    public static void setUp(){
        Configuration.browser = "chrome";
    }
}
