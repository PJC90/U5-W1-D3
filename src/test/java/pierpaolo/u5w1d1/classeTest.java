package pierpaolo.u5w1d1;

import org.junit.jupiter.api.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pierpaolo.u5w1d1.entities.*;

import static org.junit.jupiter.api.Assertions.*;

public class classeTest {
    private static AnnotationConfigApplicationContext ctx ;
    @BeforeAll
    public static void beforeAll() {
        System.out.println("BEFORE ALL");
        ctx = new AnnotationConfigApplicationContext(U5w1d1Application.class);
    }
    @Test
    public void testSum() {
        System.out.println("TEST 1 sum");
        int result = 4;
        assertEquals(4, result);
    }
    @Test
    void margheritaTest(){
        System.out.println("TEST 2 margherita");
        Pizza marg = ctx.getBean("margherita",Pizza.class);
        assertEquals(8.97, marg.getPrezzo());
    }

    @Test
    void margheritaTest2(){
        System.out.println("TEST 3 margherita");
        Prodotto marg = (Prodotto) ctx.getBean("margherita");
        assertEquals(8.97, marg.getPrezzo());
    }
    @Test
    void pomodorotest(){
        System.out.println("TEST 4 pomodoro");
        Topping t = ctx.getBean("pomodoro", Topping.class);
        assertEquals(0.99,t.getPrezzo());
    }
    @Test
    void margheritaIsNotXl(){
        System.out.println("TEST 5 is not xl");
        Pizza m = ctx.getBean("margherita", Pizza.class);
        assertFalse(m.isXl());
    }
    @Test
    void margheritaIsXl(){
        System.out.println("TEST 6 is xl");
        Pizza m = ctx.getBean("margheritaXl", Pizza.class);
        assertTrue(m.isXl());
    }
    @Test
    void costoCopertoAppProperties(){
        System.out.println("TEST 7 application properties");
        Tavolo t = ctx.getBean("tavolo_1", Tavolo.class);
        assertEquals(2.00,t.getCostoCoperto());
    }

//    @Test
//    void ordineTest(){
//        Ordine o = ctx.getBean(Ordine.class);
//        assertEquals(5, o.getTotale());
//    }

}
