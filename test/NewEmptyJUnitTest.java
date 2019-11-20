
import org.junit.Test;
import static org.junit.Assert.*;

public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }

     @Test
     public void szorzás5x4() {
         int elvárt = 129140163;
         int bemenő1= 5;
         int bemenő2 = 4;
         int eredmény;

            eredmény = rft7.Rft7.szorzás(bemenő1,bemenő2);
            assertEquals(elvárt, eredmény);
     }
       @Test
     public void szorzásnagySzám() {
         int elvárt = 100000000;
         int bemenő1= 10000;
         int bemenő2 = 10000;
         int eredmény;

            eredmény = rft7.Rft7.szorzás(bemenő1,bemenő2);
            assertEquals(elvárt, eredmény);
     }
     
     @Test
     public void szorzásbetűvel() {
         int bemenő1 = -1;
         int bemenő2 = 0;
         int elvárt = 0;
         int eredmény;

            eredmény = rft7.Rft7.szorzás(bemenő1,bemenő2);
            assertEquals(elvárt, eredmény);
      
         
     }
     
}
