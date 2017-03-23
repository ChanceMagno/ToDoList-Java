import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDo {
  private String mDescription;
  private boolean mCompleted;
  private LocalDateTime mCreatedAt;
  private static List<ToDo> instances = new ArrayList<ToDo>();
  private int mId;

  public ToDo(String description) {
    mDescription = description;
    mCompleted = false;
    mCreatedAt = LocalDateTime.now();
    instances.add(this);
    mId = instances.size();
  }

  public String getDescription() {
    return mDescription;
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public LocalDateTime getCreatedAt() {
    return mCreatedAt;
  }

  public static List<ToDo> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static ToDo find(int id) {
    return instances.get(id - 1);
  }
}
