import java.time.LocalDateTime;
import java.util.ArrayList;

public class CD {
  private static ArrayList<CD> instances = new ArrayList<CD>();
  private String mTitle;
  // private static ArrayList<Task> instances = new ArrayList<Task>();
    public CD (String title){
      mTitle = title;
      instances.add(this);
    }

    public String Get_Title(){
      return mTitle;
    }

    public static ArrayList all(){
      return instances;
    }
}
