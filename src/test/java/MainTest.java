import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void Main_Test() {
        //arrange

        //act
        String actual = Main.GetMessage();
        //assert
        Assertions.assertEquals("Hello World!", actual);
    }

}