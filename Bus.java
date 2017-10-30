class Bus{
  private Person[] passengers;

  public Bus() {
    this.passengers = new Person[5];
  }

  private int count() {
    int count = 0;
    for( Person person : passengers ) {
      count++;
    }
    return count;
  }


}
