import java.util.ArrayList;

public class CustomerUtility 
{

    ArrayList<Customer> customers=new ArrayList<>();

 
    public void addCustomer(Customer customer) 
	{
        customers.add(customer);
        System.out.println("customer added successfully! name: " + customer.getCustomerName());
    }

  
    public boolean removeCustomer(String customerName1)
	{
        for (Customer c :customers)
			{
               if (c.getCustomerName().equals(customerName1)) 
			    {
                    customers.remove(c);
                    System.out.println("customer removed successfully! name: " + customerName1);
                    return true;
                }
            }
                System.out.println("customer not found!");
                return false;
    }

  
    public void viewAllCustomers()
	{
        if (customers.isEmpty()) 
		{
            System.out.println("no customers found.");
            return;
        }
          
		  for (Customer c : customers) 
		    {
                System.out.println("");
                System.out.println("NAME        : " + c.getCustomerName());
                System.out.println("BUS NO      : " + c.getBookedBusNo());
                System.out.println("SEAT BOOKED : " + c.getBookedSeatNum());
                System.out.println("AGE         : " + c.getCustomerAge());
                System.out.println("GENDER      : " + c.getCustomerGender());
                System.out.println("PHONE       : " + c.getCustomerPhoneNo());
                System.out.println("FARE        : " + c.getCustomerFare());
                System.out.println("BOOKING DATE: " + c.getCustomerBookingDate());
                System.out.println("-------------------------------------------");
            }
      }


 
    public void  searchCustomerBus(String busNo) 
	{
        boolean found=false;
        for (Customer c:customers) 
		{
            if (c.getBookedBusNo().equalsIgnoreCase(busNo)) 
			{
                System.out.println("");
                System.out.println("NAME          : " + c.getCustomerName());
                System.out.println("PHONE NUMBER  : " + c.getCustomerPhoneNo());
                System.out.println("BOOKED BUS NO : " + c.getBookedBusNo());
                System.out.println("----------------------------");
                found=true;
            }
        }
		
        if(!found) 
		{
			System.out.println("bus not found: " +busNo);
		}  
    }
	
}

public void addBooking(String bookingId, String userId, String busId, String busName, 
                       String busFrom, String busTo, String bookingDate, String travelDate,
                       int seatCount, double totalAmount) {
    TicketBooking booking = new TicketBooking(bookingId, userId, busId, busName, busFrom, busTo,
                                              bookingDate, travelDate, seatCount, totalAmount);
    bookings.add(booking);
    System.out.println("Booking added successfully! Booking ID: " + bookingId);
}
