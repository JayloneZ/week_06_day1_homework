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
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void canTakePassengers() {
    bus.take(person);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void busIsFull() {
    for (int i = 0; i < 5; i++) {
      bus.take(person);
    }
    assertEquals(true, bus.isFull());
  }

  @Test
  public void wontAddPassengersIfFull() {
    for (int i = 0; i < 10; i++) {
      bus.take(person);
    }
    assertEquals(5, bus.passengerCount());
  }
}
