package restaurant;

import org.springframework.stereotype.Component;

@Component
public class BILL {
	final int listPrices[]= {100, 150, 50, 100,50,50, 200,200, 100, 150};
	final String listItems[]= {"Full meal", "veg biriyani", "veg Rice", "veg Palav","veg Manchuria", "gobi Nudles", "chicken Biriyani", "chicken", "chicken Curry", "chicken Manchuria"};
	Order order;
	int bill;
	int count=0;
	static int TotalBill=0;
	
	void generateBill(Customer c) {
		this.order=c.order;
		
		System.out.println("Bill: ");
		System.out.println("----------------------------------------");
		System.out.println("Item                 Quant         Bill");
		System.out.println("-----------------------------------------");

		for(int i = 0; i<order.noOfItems;i++) {
			count =order.items[i][1];
			bill = listPrices[order.items[i][0]-1];
			System.out.println(listItems[order.items[i][0]-1] + "          " + count + "            " + count*bill);
			BILL.TotalBill+=bill*count;
		}
		System.out.println("------------------------------------");

		
		System.out.println("Total Bill                       " + BILL.TotalBill);
	}
}
