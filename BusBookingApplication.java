import java.util.Scanner;
import java.util.InputMismatchException;

public class BusBookingApplication
{
    public static void main(String[] args) 
	{
		BusUtility bu=new BusUtility();
		CustomerUtility cu=new CustomerUtility();
		TicketBookingUtility tu=new TicketBookingUtility();
		BusOperatorUtility bou=new BusOperatorUtility();
		AdminUtility au=new AdminUtility();
		
       
        Scanner a=new Scanner(System.in);
		boolean proceed=true;
     

        do 
		{
			System.out.println("");
            System.out.println("*************************");	
            System.out.println("*                       *");			
            System.out.println("* BUS BOOKING SYSTEM !. *");
			System.out.println("*                       *");
			System.out.println("*************************");
			System.out.println("");
			System.out.println("");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^ SHOULD BE REGISTER AND LOGIN ! FIRST !...^");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("");
			System.out.println("============================");
            System.out.println("=> 1.ADMIN UTILITY         !");
            System.out.println("=> 2.BUS OPERATOR UTILITY  !");
			System.out.println("=> 3.CUSTOMER UTILITY      !");
            System.out.println("=> 4.EXIT                  !");
			System.out.println("============================");
			System.out.println("");
            System.out.print("ENTER YOUR CHOICE ");
            int ch=a.nextInt();
            			
			switch(ch)
			{
			    case 1:
			        System.out.println("");
                    System.out.println("!--OPENING ADMIN UTILITY----!");
                    System.out.println("");
                    System.out.println("! 1. REGISTER & LOGIN       !");
			        System.out.println("! 2. ADD OPERATORS          !");
			        System.out.println("! 3. VIEW OPERATORS         !");
			        System.out.println("! 4. REMOVE OPERATORS       !");
			        System.out.println("! 5. ADD CUSTOMER DETAILS   !");
			        System.out.println("! 6. REMOVE CUSTOMER        !");
			        System.out.println("! 7. VIEW ALL BUSES         !");
			        System.out.println("! 8. VIEW ALL CUSTOMER      !");
                    System.out.println("!---------------------------!");
			        System.out.println("");
			        System.out.print("ENTER YOUR CHOICE :");
					int buschoice=a.nextInt();
			        a.nextLine();
					
			switch(buschoice)
			{
			    case 1:
				    try
					{
				    System.out.println("");
				    System.out.println("ADMIN REGISTER !");
				    System.out.println("");
				    System.out.print("enter admin id           :");
				    String adminid1=a.next();
				    System.out.print("enter admin name         :");
				    String adminname1=a.next();
				    System.out.print("enter admin password     :");
				    String adminpassword1=a.next();
				    System.out.print("enter admin phone number :");
				    String adminnum1=a.next();
				   
					if (adminid1.isEmpty() || adminname1.isEmpty() || adminpassword1.isEmpty() || adminnum1.isEmpty()) 
					{
                    throw new IllegalArgumentException("admins empty!");
                    }
					
					au.adminss.add(new Admins(adminid1,adminname1,adminpassword1,adminnum1));
				  
				    System.out.println("");	
                    System.out.println("ADMIN LOGIN   !");
                    System.out.println("");		
                    System.out.print("enter admin id             : ");
                    String adminid=a.next();
				    System.out.print("enter admin name           :");
				    String adminname=a.next();
                    System.out.print("enter admin password       :");
                    String adminpassword=a.next();
				    System.out.print("enter admin phone number   :");
				    String adminnum=a.next();
				    System.out.println(""); 
				    au.adminLogin(adminid,adminname,adminpassword,adminnum);
				    System.out.println("");
					}
                    catch(IllegalArgumentException e)
					{
					System.out.println("wrong input !"+e.getMessage());
					}					
                    break;
					
                case 2:
				    try
					{
				    System.out.println("");	
	                System.out.println("BUS OPERATORS ADDED !");	
	                System.out.println("");	
                    System.out.print("enter operator id            : ");
                    String operatorid1=a.next();
					System.out.print("enter operator name          :");
					String operatorname1=a.next();
                    System.out.print("enter operator password      : ");
                    String operatorpassword1=a.next();
					System.out.print("enter operator phone number  :");
                    String operatornum1=a.next();
	                System.out.println("");	
					if (operatorid1.isEmpty() || operatorname1.isEmpty() || operatorpassword1.isEmpty() || operatornum1.isEmpty()) 
					{
                        throw new IllegalArgumentException("operators empty !");
                    }
                    bou.busoperator.add(new BusOperator(operatorid1,operatorname1,operatorpassword1,operatornum1));
					bou.registerOperator();
                    System.out.println(""); 
					}
                    catch(IllegalArgumentException e)
					{
						System.out.println("wrong input !"+e.getMessage());
					}					
                    break;
                  
                case 3:
				    bou.viewOperators();
			        break;
				
                case 4:
				    try
					{
				    System.out.print("enter operator id to remove : ");
                    String operatorId=a.next();
                    bou.removeOperator(operatorId);
					}
                    catch(IllegalArgumentException e)
					{
						System.out.println("wrong input !"+e.getMessage());
					}					
                    break;
					
				case 5:
				    try
					{
                    System.out.println("");
                    System.out.println("CUSTOMER ADDED :");
					System.out.println("");
                    System.out.print("enter customer name               :");
                    String customerName=a.next();
					System.out.print("enter customer booked bus num     :");
					String bookedBusNo=a.next();
					System.out.print("enter customer age                :");
                    int age=a.nextInt();
					a.nextLine();
					System.out.print("enter customer booked seat num    :");
					int bookedSeatNo=a.nextInt();
					a.nextLine();
                    System.out.print("enter customer gender             :");
                    String gender=a.next();
                    System.out.print("enter customer phone number       :");
                    String phoneNumber=a.next();
					System.out.print("enter customer bus fare amount    :");
					double fareAmount=a.nextDouble();
					a.nextLine();
					System.out.print("enter customer booking date       :");
					String bookingDate=a.next();
                    System.out.println("");	
				
                    cu.customers.add(new Customer(customerName,bookedBusNo,age,bookedSeatNo,gender,phoneNumber,fareAmount,bookingDate));
                    System.out.println("");
					}
					catch(InputMismatchException e)
					{
						System.out.println("invalid input enter correct data type : "+e.getMessage());
					}
					break;

                case 6:
                    System.out.println("enter customer name remove :");
                    String customerName1=a.next();
                    cu.removeCustomer(customerName1);
                    break;					
					
                case 7:					
			        bu.viewAllBuses();
					break;
				
                case 8:
            		cu.viewAllCustomers();
                    break;
			}
			break;
			
								
			case 2:
			    boolean found=true;
			    while(found)
			    {
			        System.out.println("");
			        System.out.println("---OPENING BUS OPERATOR UTILITY-- !");
                    System.out.println("");
			        System.out.println(": 1. LOGIN              : ");
			        System.out.println(": 2. ADD BUS            : ");
			        System.out.println(": 3. UPDATE BUS         : ");
			        System.out.println(": 4. REMOVE BUS         : ");
			        System.out.println(": 5. VIEW BUS           : ");
			        System.out.println(": 6. VIEW BOOKING       : ");
			        System.out.println(": 7. EXIT               : ");
			        System.out.println("......................... ");
			        System.out.println("");	
                    System.out.print("ENTER YOUR CHOICE : ");
                    int choice=a.nextInt();			
				
            switch(choice) 
		    {
                case 1:				
				    try
					{
				    System.out.println("BUS OPERATORS LOGIN !");
					System.out.println("");
					System.out.print("enter operator id           :");
					String operatorId=a.next();
					System.out.print("enter operator name         :");
					String operatorName=a.next();
					System.out.println("");
					bou.operatorLogin(operatorId,operatorName);
					System.out.println("");
					}
					catch(IllegalArgumentException e)
					{
						System.out.println("wrong input "+e.getMessage());
					}
                    break;
					
                case 2:
				    try
					{
				    System.out.println("BUS ADDED !");
                    System.out.println("");
                    System.out.print("enter bus number          :");
					String busnum=a.next();
					System.out.println("enter bus id            :");
					String busid=a.next();
                    System.out.print("enter total seat of bus   :");	
                    int totalseat=a.nextInt();	
                    a.nextLine();					
				    System.out.print("enter available of seat   :");
					int availableseat=a.nextInt();
					a.nextLine();
					System.out.print("enter from place          :");
					String fromplace=a.next();
					System.out.print("enter to place            :");
					String toplace=a.next();
					System.out.print("enter bus start time      :");
					String start=a.next();
					System.out.print("enter bus arrival time    :");
					String arrival=a.next();
					System.out.print("enter bus fare per seat   :");
					double busfare=a.nextDouble();
					a.nextLine();
					System.out.println("");
	                bu.buses.add(new Bus(busnum,totalseat,availableseat,fromplace,toplace,start,arrival,busfare));
					}
					catch(InputMismatchException e)
					{
						System.out.println("invalid input please enter correct data type !");
					}
                    break;
					
				case 3:
				    try
					{
				    System.out.println("");
                    System.out.println("UPDATE BUS DETAILS !");
                    System.out.println("");
                    System.out.print("enter bus number to update     : ");
                    String busNo=a.next();
                    System.out.print("enter new total seat count     : ");
                    int totalseats=a.nextInt();
					a.nextLine();
                    System.out.print("enter new available seat count : ");
                    int availableseats=a.nextInt();
					a.nextLine();
                    System.out.print("enter new start time           : ");
                    String starts=a.next();
                    System.out.print("enter new arrival time         : ");
                    String arrivals=a.next();
                    System.out.print("enter new fare per seat        : ");
                    double fare=a.nextDouble();
					a.nextLine();
					System.out.println("");

                    bu.updateBus(busNo,totalseats,availableseats,starts,arrivals,fare);
                    System.out.println("");
					}
					catch(InputMismatchException e)
					{
						System.out.println(""+e.getMessage());
					}
                    break;			
					
				case 4:
				    System.out.println("enter bus number :");
					String busnumber=a.next();
				    bu.removeBus(busnumber);
					System.out.println("");
                    break;	
					
                case 5:
				    bu.viewAllBuses();
				    System.out.println("");
                    break;
				
                case 6:
				   tu.viewAllBookings();
                   System.out.println("");
                   break;		   
					
                case 7:
				    found=false;
                    System.out.println("EXIT ...");
                    break;
					
                default:
                    System.out.println("INVALID CHOICE !");
            }
		}
		    break;
			
			    case 3:
			        System.out.println("");
			        System.out.println("~~~ OPENINGS CUSTOMER UTILITY !~~~");
			        System.out.println("");
			        System.out.println("~ 1.  SEARCH BUS        ~");
			        System.out.println("~ 2.  BOOK TICKET       ~");
			        System.out.println("~ 3.  CANCEL TICKET     ~");
			        System.out.println("~ 4.  VIEW BOOKING      ~");
			        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
			        System.out.println("");
			        System.out.print("ENTER YOUR CHOICE :");
			        int v=a.nextInt();
			        a.nextLine();
			        switch(v)
			            {
                            case 1:
				                System.out.println("enter a search bus number :");
				                String search=a.next();
			                    bu.searchBus(search);
			                    System.out.println(""); 
				                break;

                            case 2:
							    try
								{
			                    System.out.print("enter booking id       :");
				                String bookingId=a.nextLine();
				                System.out.print("enter user id          :");
				                String userId=a.nextLine();
				                System.out.print("enter bus id           :");
				                String busId=a.nextLine();
				                System.out.print("enter bus name         :");
				                String busName=a.nextLine();
				                System.out.print("enter from bus         :");
				                String busFrom=a.nextLine();
				                System.out.print("enter to bus           :");
				                String busTo=a.nextLine();
				                System.out.print("enter booking date     :");
				                String bookingDate=a.nextLine();
				                System.out.print("enter travelDate       :");
				                String travelDate=a.nextLine();
				                System.out.print("enter seat count       :");
				                int seatCount=a.nextInt();
				                a.nextLine();
				                System.out.print("enter pay total amount :");
				                double totalAmount=a.nextDouble();
				                a.nextLine();
			     
                                Bus selectedBus=bu.findBusById(busId);
                                if(selectedBus==null) 
				                    {
                                        System.out.println("Bus not found!");
                                        break;
                                    }
 
                                if(seatCount>selectedBus.getBusAvailableSeat())
				                    {
                                        System.out.println("seats not available!");
                                        break;
                                    }

                                    bu.reduceSeats(selectedBus.getBusNumber(),seatCount);

                                    tu.bookings.add(new TicketBooking(bookingId,userId,busId,busName,busFrom,busTo,bookingDate,travelDate,seatCount,totalAmount));
                                    System.out.println("Booking successful! Booking ID: "+bookingId);
								}
								catch(InputMismatchException e)
								{
									System.out.println(""+e.getMessage());
								}
                                break;

              
			                case 3:
                                System.out.print("enter booking ID to cancel: ");
                                String cancelId=a.next();
                                tu.cancelBooking(cancelId,bu);
                                break;
            
                            case 4:
			                    tu.viewAllBookings(); 
                                System.out.println("");
                                break;
			
                            default:
                                System.out.println("INVALID CHOICE !");			  
			            }
			                break;
			
			                case 4:
			                    System.out.println(" YOU EXIT THE BUS APPLICATION SYSTEM  :");
			                    proceed=false;
			                    break;
			  
            } 
        }
	    while(proceed);
   }  
  
}
