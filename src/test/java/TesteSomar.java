import org.junit.Test;
import static org.junit.Assert.*;
import com.example.somar6mais6;

public class TesteSomar {

    @Test
    public void Teste1() {
        somar6mais6 s = new somar6mais6();
        assertEquals(12, s.somar());
    }
   
}