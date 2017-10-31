import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BusStopTest {

  BusStop busStop;
  Bus bus;
  Person person;


  @Before
  public void before() {
    this.busStop = new BusStop();
    this.person = new Person();
    this.bus = new Bus();
  }

  @Test
  public void busStopTakesPeople() {
    busStop.addPassengerToQueue(person);
    assertEquals(1, busStop.queueCount());
  }

  @Test
  public void busStopIsEmpty() {
    busStop.addPassengerToQueue(person);
    busStop.loadBus(bus);
    assertEquals(0, busStop.queueCount());
  }

}
