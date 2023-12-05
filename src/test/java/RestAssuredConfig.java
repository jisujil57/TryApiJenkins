import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class RestAssuredConfig {
    @BeforeAll
    public static void setup() {
        // ������������� ������� URI ��� ���� ��������
        RestAssured.baseURI = "https://api.example.com";

        // ������������� ������� ���� (���� ����������)
        // RestAssured.basePath = "/api";

        // ��������� ����������, ��������, �����, ������ � �. �.
        // RestAssured.port = 8080;
        // RestAssured.proxy("proxy.example.com", 8888);

        // �������������� ���������, ��������, ������� � �����������
        // RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        // RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
