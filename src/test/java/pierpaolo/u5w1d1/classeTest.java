package pierpaolo.u5w1d1;

import org.junit.jupiter.api.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pierpaolo.u5w1d1.entities.Pizza;

import static org.junit.jupiter.api.Assertions.*;

public class classeTest {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d1Application.class);
    @BeforeAll
    public static void beforeAll() {
        System.out.println("BEFORE ALL");
    }
    @Test
    void margheritaTest(){
        Pizza marg = ctx.getBean("margherita",Pizza.class);
        assertEquals(8.97, marg.getPrezzo());
    }
    @Test
    public void testSum() {
        System.out.println("TEST 1");
        int result = 4;
        assertEquals(4, result);
    }

}
