
public class Services {
	public String name;
	public int price;
	public int tax;
	public int amount;
	
	Options op[];
	Add_Ons ad[];
	
	Options opt;
	Add_Ons add_on[];
	
	public Services(String n, int p, int t,Options o[],Add_Ons a[]) {
		name = n;
		price = p;
		tax = t;
		op = o;
		ad = a;
		amount = 0;
	}
	
	public void bookService(Options o, Add_Ons a[]){
		
		opt = o;
		add_on = a;
		amount= amount + price;
		amount= amount + o.price;
		
		for(int i=0; i<add_on.length; i++){
			amount = amount + add_on[i].price;
		}
	}
	
	public void printBill(){
		Debug.Log("\nName : "+name);
		Debug.Log("\nPrice : "+price);
		Debug.Log("\nOption : "+opt.name);
		Debug.Log("\nOption : "+opt.price);
		
		for(int i=0; i<add_on.length; i++){
			Debug.Log("\nAdon : "+add_on[i].name+" Price : "+add_on[i].price);
		}
		Debug.Log("\nTotal : "+amount);
	}
}
