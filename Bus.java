class Bus{
  private Person[] passengers;

  public Bus() {
    this.passengers = new Person[5];
  }

  public int passengerCount() {
    int count = 0;
    for( Person person : passengers ) {
      if( person != null) {
        count++;
      }
    }
    return count;
  }

  public void take(Person person) {
    int passengerCount = passengerCount();
    passengers[passengerCount] = person;
  }
}
