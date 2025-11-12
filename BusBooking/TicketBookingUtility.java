import java.util.ArrayList;

public class TicketBookingUtility
 {

     ArrayList<TicketBooking>bookings=new ArrayList<>();
	 
	public void addBooking(String bookingId,String userId,String busId,String busName,String busFrom,String busTo,String bookingDate,String travelDate,int seatCount,double totalAmount)
		{
            TicketBooking booking=new TicketBooking(bookingId,userId,busId,busName,busFrom,busTo,bookingDate,travelDate,seatCount,totalAmount);
            bookings.add(booking);
            System.out.println("Booking added successfully! Booking ID: " + bookingId);
        }


    public void viewAllBookings() 
	{
        if (bookings.isEmpty()) 
		{
            System.out.println("no bookings found.");
            return;
        }
            for (TicketBooking t : bookings)
			{
                System.out.println("");
                System.out.println("BOOKING ID   : " + t.getBookingId());
                System.out.println("USER ID      : " + t.getUserId());
                System.out.println("BUS ID       : " + t.getBusId());
                System.out.println("BUS NAME     : " + t.getBusName());
                System.out.println("FROM         : " + t.getFromBus());
                System.out.println("TO           : " + t.getToBus());
                System.out.println("BOOKING DATE : " + t.getBookingDate());
                System.out.println("TRAVEL DATE  : " + t.getTravelDate());
                System.out.println("SEATS        : " + t.getSeatCount());
                System.out.println("TOTAL AMOUNT : " + t.getTotalAmount());
                System.out.println("------------------------------------------------");
            }
    }

  public void cancelBooking(String bookingId, BusUtility bu)
  {
      TicketBooking bookingToCancel=null;

        for (TicketBooking t:bookings) 
		{
            if (t.getBookingId().equals(bookingId))
			{
                bookingToCancel=t;
                break;
            }
        }

        if (bookingToCancel==null) 
		{
            System.out.println("booking ID not found!");
            return;
        }

        bu.increaseSeat(bookingToCancel.getBusId(),bookingToCancel.getSeatCount());

        bookings.remove(bookingToCancel);

        System.out.println("booking canceled! seats restored for bus ID: "+bookingToCancel.getBusId());
    }
 }
    
 
 
 