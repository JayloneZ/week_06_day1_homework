class BusStop {
  private Person[] queue;

  public BusStop() {
    this.queue = new Person[5];
  }

  public int queueCount() {
    int count = 0;
    for( Person person : queue ) {
      if( person != null ) {
        count++;
      }

    }
    return count;
  }

  public void addPassengerToQueue(Person passenger) {
    int queueCount = queueCount();
    queue[queueCount] = passenger;
  }

  public void loadBus(Bus bus) {
    for ( int i = 0; i < this.queue.length; i++) {
      if (this.queue[i] != null) {
        bus.take(this.queue[i]);
        this.queue[i] = null;
      }
    }
  }
}
