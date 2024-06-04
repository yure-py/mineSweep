import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunitIsPresent {
    @Test
    public void run(){
        int a = 1 + 1;
        Assertions.assertEquals(2, a );
 
    }
}
