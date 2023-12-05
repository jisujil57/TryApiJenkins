import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class RestAssuredConfig {
    @BeforeAll
    public static void setup() {
        // Устанавливаем базовый URI для всех запросов
        RestAssured.baseURI = "https://api.example.com";

        // Устанавливаем базовый путь (если необходимо)
        // RestAssured.basePath = "/api";

        // Настройка параметров, например, порта, прокси и т. д.
        // RestAssured.port = 8080;
        // RestAssured.proxy("proxy.example.com", 8888);

        // Дополнительные настройки, например, фильтры и логирование
        // RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        // RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
