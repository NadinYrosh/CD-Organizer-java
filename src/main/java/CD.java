import java.time.LocalDateTime;
import java.util.ArrayList;

public class CD {
  private String mTitle;
  // private static ArrayList<Task> instances = new ArrayList<Task>();
    public CD (String title){
      mTitle = title;
    }

    public String Get_Title(){
      return mTitle;
    }
}
