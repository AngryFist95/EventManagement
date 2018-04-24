
public class EventClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cl1 = new Customer("Basit Khan");
		
		Options op1 = new Options("Air Hall",200);
		
		Add_Ons a1 = new Add_Ons("Sound",100);
		
		Options opl1[] = new Options[1];
		opl1[0] = op1;
		
		Add_Ons adl1[] = new Add_Ons[1];
		adl1[0] = a1;
		
		Services s1 = new Services("Hall Booking",1000,10,opl1,adl1);
		
		s1.bookService(op1, adl1);
		s1.printBill();
	}

}
