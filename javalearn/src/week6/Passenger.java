package week6;

enum Seating{
	UPPER,
	LOWER
}
enum Status{
  BOOKED,
  WL
}
public class Passenger {
  private int id;
  private String name;
  private String prefBerth;
  private String allocatedBerth;
  private Status status;
  
  private int bkdWl;
  private int currentWl;
  
  //Constructor
  public Passenger(int id,String name,String prefBerth) {
	    this.id=id;
	    this.name=name;
	    this.prefBerth=prefBerth;
	  }
  
  //Creating getter and setter method for private variables also known as encapsulation
  public int getBkdWl() {
	return bkdWl;
  }
  public void setBkdWl(int bkdWl) {
	this.bkdWl = bkdWl;
  }
  public int getCurrentWl() {
	return currentWl;
  }
  public void setCurrentWl(int currentWl) {
	this.currentWl = currentWl;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getPrefBerth() {
    return prefBerth;
  }
  public void setPrefBerth(String prefBerth) {
    this.prefBerth = prefBerth;
  }
  public String getAllocatedBerth() {
    return allocatedBerth;
  }
  public void setAllocatedBerth(String allocatedBerth) {
    this.allocatedBerth = allocatedBerth;
  }
  public Status getStatus() {
    return status;
  }
  public void setStatus(Status status) {
    this.status = status;
  }

}
