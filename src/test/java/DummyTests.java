import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;

@Epic("Sample Tests")
@Feature("Dummy Feature")
public class DummyTests {

    @Test
    @Description("Test 1: This test prints a message to the console.")
    public void test1() {
        System.out.println("Test 1: This is a placeholder test. Replace it with real tests.");
    }

    @Test
    @Description("Test 2: This test prints another message to the console.")
    public void test2() {
        System.out.println("Test 2: This is another placeholder test.");
    }

    @Test
    @Description("Test 3: This test prints a third message to the console.")
    public void test3() {
        System.out.println("Test 3: Yet another placeholder test.");
    }

    @Test
    @Description("Test 4: This test prints a fourth message to the console.")
    public void test4() {
        System.out.println("Test 4: One more placeholder test.");
    }
}
