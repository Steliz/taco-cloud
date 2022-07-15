package tacocloud;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TacoCloudApplicationTests {

    @Value("${test}")
    int test;

    @Test
    void contextLoads() {
    }

    @SneakyThrows
    @Test
    void mainTest() {
        while (true) {
            System.out.println(test);
            Thread.sleep(1000);
        }
    }
}
