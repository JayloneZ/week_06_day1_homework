import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BusTest {

  Bus bus;
  Person person;

  @Before
  public void before() {
    this.bus = new Bus();
    this.person = new Person();
  }

  @Test
  public void busStartsEmpty() {
    assertEquals(0, bus.count());
  }

  // @Test
  // public void canTakePassengers() {
  //   bus.take(person);
  //   assertEquals(1, bus.count)
  // }

}
