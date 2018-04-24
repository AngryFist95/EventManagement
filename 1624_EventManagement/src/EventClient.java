
public class EventClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("Basit Khan");
		
		Options op1 = new Options("Open Air Hall",2000);
		Options op2 = new Options("Non-Veg",5000);
		
		Add_Ons a1 = new Add_Ons("Music",1000);
		Add_Ons a2 = new Add_Ons("Soup",1000);
		
		Options opl1[] = new Options[1];
		opl1[0] = op1;
		Options opl2[] = new Options[2];
		opl1[0] = op2;
		
		Add_Ons adl1[] = new Add_Ons[1];
		adl1[0] = a1;
		Add_Ons adl2[] = new Add_Ons[2];
		adl1[0] = a2;
		
		Services s1 = new Services("Hall Booking",5000,10,opl1,adl1);
		Services s2 = new Services("Catering",15000,10,opl2,adl2);
		
		s1.bookService(op1, adl1);
		s1.printBill();
	}

}
