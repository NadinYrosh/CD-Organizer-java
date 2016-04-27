import java.time.LocalDateTime;
import java.util.ArrayList;

public class CD {
  private static ArrayList<CD> instances = new ArrayList<CD>();
  private String mTitle;
  private int mId;
  private String mArtist;
  // private static ArrayList<Task> instances = new ArrayList<Task>();
    public CD (String title){
      mTitle = title;
      instances.add(this);
      mId = instances.size();
    }

    public String Get_Title(){
      return mTitle;
    }

    public static ArrayList all(){
      return instances;
    }

    public int getId(){
      return mId;
    }

    public static CD find(int id){
      try{
        return instances.get(id -1);
      }catch (IndexOutOfBoundsException e){
        return null;
      }
    }

    public static void clearCDArray(){
      instances.clear();
    }

    public void AddArtist(String artistName){
      mArtist = artistName;
    }

    public String getArtist(){
      return mArtist;
    }
}
