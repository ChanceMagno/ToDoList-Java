import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class ToDoTest {
  @Test
  public void ToDoItem_instantiatesCorrectly_true() {
    ToDo myTask = new ToDo("Mow the lawn");
    assertEquals(true, myTask instanceof ToDo);
  }

  @Test
  public void ToDoItem_createsDescription_String() {
    ToDo myTask = new ToDo("Mow the lawn");
    assertEquals("Mow the lawn", myTask.getDescription());
  }

  @Test
  public void isCompleted_isFalseAfterInstantiation_false() {
    ToDo myTask = new ToDo("Mow the lawn");
    assertEquals(false, myTask.isCompleted());
  }

  @Test
  public void getCreatedAt_instantiatesWithCurrentTime_today() {
    ToDo myTask = new ToDo("Mow the lawn");
    assertEquals(LocalDateTime.now().getDayOfWeek(), myTask.getCreatedAt().getDayOfWeek());
  }

  @Test
  public void all_returnsAllInstancesOfTask_true() {
    ToDo firstTask = new ToDo("Mow the lawn");
    ToDo secondTask = new ToDo("Buy groceries");
    assertEquals(true, ToDo.all().contains(firstTask));
    assertEquals(true, ToDo.all().contains(secondTask));
  }

  @Test
  public void clear_emptiesAllTaskFromArrayList_0() {
    ToDo myTask = new ToDo("Mow the lawn");
    ToDo.clear();
    assertEquals(0, ToDo.all().size());
  }

  @Test
  public void getId_todoInstantiatesWithAnID_1() {
    ToDo.clear();
    ToDo myTask = new ToDo("Mow the lawn");
    assertEquals(1, myTask.getId());
  }

  @Test
  public void find_returnsTaskWithSameId_secondTask() {
    ToDo firstTask = new ToDo("Mow the lawn");
    ToDo secondTask = new ToDo("Buy groceries");
    assertEquals(ToDo.find(secondTask.getId()), secondTask);
  }
}
