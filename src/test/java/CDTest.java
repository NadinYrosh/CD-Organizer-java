import java.time.LocalDateTime;

import org.junit.*;
import static org.junit.Assert.*;

public class CDTest {

  // @Rule
  // public ClearRule clearRule = new ClearRule();

  @Test
  public void CD_instantiatesCorrectly_True(){
    CD myCD = new CD("BackStreet Boys");
    assertEquals(true, myCD instanceof CD);
  }

  public void get_Title_correctlyReturnTheTitle(){
    CD myCD = new CD("BackStreet Boys");
    assertEquals("BackStreet Boys", myCD.Get_Title());
  }

  // @Test
  // public void task_instantiatesCorrectly_true() {
  //   Task myTask = new Task("Mow the lawn");
  //   assertEquals(true, myTask instanceof Task);
  // }
}
