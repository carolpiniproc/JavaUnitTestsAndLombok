package chronos.logica;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    @Test
    void test(){
        fail("No code here"); // falha de algo nao alarmante, uma comparação que nao deu certo
    }

    @Test
    void testENP() throws Exception {
        throw new Exception("No code here"); // falha de algo nao alarmante, uma comparação que nao deu certo
    }

    @Test
    public void testHelloComValor(){
        HelloWorld hello = new HelloWorld();
        hello.setHello("Hello World");
        hello.setNum(123);

        assertEquals("Hello World", hello.getHello());
        assertEquals(123, hello.getNum());
    }

}
