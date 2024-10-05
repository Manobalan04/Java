package week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TrainBooking {

  static int availTickets =3;
  static int upperAvailTickets =2;
  static int lowerAvailTickets =1;
  static int wlLimitTickets =3;
  
  static int pId =1;
  
  static List<Passenger> bkdDetails = new ArrayList<>();
  static List<Passenger> wlDetails = new ArrayList<>();
  
  static void allocateBerth(Passenger p) {
    
    switch(p.getPrefBerth().toUpperCase()) {
      
    case "UPPER":
      if(upperAvailTickets>0) {
        p.setAllocatedBerth("UPPER");
        upperAvailTickets--;
      }else if(lowerAvailTickets>0) {
        p.setAllocatedBerth("LOWER");
        lowerAvailTickets--;
        System.out.println("Regret. you're allocated to LowerBerth");
      }
      break;
    case "LOWER":
      if(lowerAvailTickets>0) {
        p.setAllocatedBerth("LOWER");
        lowerAvailTickets--;
      }
      else if(upperAvailTickets>0) {
        p.setAllocatedBerth("UPPER");
        upperAvailTickets--;
      }
      break;
    }
    
  }
  static void bookTicket(Passenger p) {
    if(availTickets>0) {
      allocateBerth(p);
      availTickets--;
      bkdDetails.add(p);
      System.out.println("You're Ticket booked successfully with pId: "+p.getId());
    }
    else if(wlLimitTickets>0) {
      wlDetails.add(p);
      wlLimitTickets--;
      p.setBkdWl(wlDetails.size());
      System.out.println("You're currently in WL");
    }
    else {
      System.out.println("regret");
    }
  }

  static void viewTicket(int id) {
	  if(bkdDetails.isEmpty()) {
		  System.out.println("none");
	  }
	  else {
		  bkdDetails.forEach(e->{
			  if(e.getId()==id) {
				  System.out.println("PId: "+e.getId());
				  System.out.println("Pname: "+e.getName());
				  System.out.println("Berth: "+e.getAllocatedBerth());
			  }
		  });
		}
	  }
  static void cancelTicket(int id) {
    List<Passenger> cancelingPerson = bkdDetails.stream().filter(p->p.getId()==id)
        .collect(Collectors.toList());
    if(!cancelingPerson.isEmpty()) {
      if(wlDetails.size()>0) {
          Passenger wLPerson = wlDetails.get(0);
          wLPerson.setAllocatedBerth(cancelingPerson.get(0).getAllocatedBerth());
          bkdDetails.add(wLPerson);
          wlDetails.remove(0);
          wlLimitTickets++;
      }
      else {
        availTickets++;
      }
      bkdDetails.removeIf(e->e.getId()==id);
      System.out.printf("Cancellation for pId %s cancelled successfully",id);
      System.out.println();
      }else {
    	  System.out.println("Id is not in booked details");
      }
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);
    String choice = "Y";
    System.out.println("Welcome to Train Reservation System");
    while(choice.equalsIgnoreCase("Y")) {
    	System.out.println("Total Available tickets: "+availTickets );
    	System.out.println("Enter\t 1.Book Ticket\t 2.View Ticket\t 3.Cancel Ticket\t 4.Current WL");
      
     int prefChoice=sc.nextInt();
      
     switch(prefChoice) {
     case 1:
        System.out.println("Pls enter your name");
        String name=sc.next();
        System.out.println("Pls enter your pref berth (UPPER/LOWER)");
        String PrefBerth=sc.next();
        while(true) {
        try {
			Seating ss=Seating.valueOf(PrefBerth.toUpperCase());
			 bookTicket(new Passenger(pId,name,PrefBerth));
		        pId++;
		       break;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("invalid Berth");
			break;
		}       
     }
        break;
        
      case 2:
    	System.out.println("pls enter your PId");
    	int viewId=sc.nextInt();
    	viewTicket(viewId);
    	break;
    	  
      case 3:
        System.out.println("Pls enter your PId");
        int cancelid =sc.nextInt();
        cancelTicket(cancelid);
        break;
      
      case 4:
    	System.out.println("pls enter your PId");
    	 int Wlid =sc.nextInt();
    	 viewWl(Wlid);
    }
      System.out.println("Do u want to continue Y/N");
      choice=sc.next();
  }
    System.out.println("Thanks for using Train Reservation System");
    sc.close();
  }
private static void viewWl(int Wlid) {
	// TODO Auto-generated method stub
	List<Passenger> isavail=wlDetails.stream().filter(e->e.getId()==Wlid).collect(Collectors.toList());
	if(!isavail.isEmpty()) {
		System.out.println("Booked Wl status: "+isavail.get(0).getBkdWl());
		System.out.println("current Wl Status: "+wlDetails.size());
	}
	else {
		System.out.println("you're not in the Wl");
	}
}
}