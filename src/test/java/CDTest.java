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

  @Test
  public void get_Title_correctlyReturnTheTitle(){
    CD myCD = new CD("BackStreet Boys");
    assertEquals("BackStreet Boys", myCD.Get_Title());
  }

  @Test
  public void all_returnAllInstanceOfCD_true(){
    CD firstCD = new CD("BackStreet Boys");
    CD secondCD = new CD("Azzurro");
    assertTrue(CD.all().contains(firstCD));
    assertTrue(CD.all().contains(secondCD));
  }

  @Test
  public void newId_cdInstantiatesWithId_true(){
    CD myCD = new CD("BackStreet Boys");
    assertEquals(CD.all().size(), myCD.getId());
  }

  @Test
  public void find_returnsCDWithDesiredID_secondCD() {
    CD firstCD = new CD("BackStreet Boys");
    CD secondCD = new CD("Azzurro");
    assertEquals(CD.find(secondCD.getId()), secondCD);
  }

  @Test
  public void find_returnsNullWhenNoCDFound_null() {
    assertTrue(CD.find(999) == null);
  }

  @Test
  public void clear_emptiesAllCDFromArrayList_0(){
    CD myCD = new CD("BackStreet Boys");
    CD.clearCDArray();
    assertEquals(CD.all().size(), 0);
  }

  // @Test
  // public void task_instantiatesCorrectly_true() {
  //   Task myTask = new Task("Mow the lawn");
  //   assertEquals(true, myTask instanceof Task);
  // }
}
