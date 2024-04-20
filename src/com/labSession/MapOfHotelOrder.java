package com.labSession;
import java.util.*;
class Menu{
	int mid;
	String mname;
	int mprice;
	public Menu(int mid, String mname, int mprice) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mprice = mprice;
	}
	@Override
	public String toString() {
		return "Menu [mid=" + mid + ", mname=" + mname + ", mprice=" + mprice + "]";
	}
	
}
class Order{
	int oid;
	int oquantity;
	Menu menu;
	public Order(int oid, int oquantity, Menu menu) {
		super();
		this.oid = oid;
		this.oquantity = oquantity;
		this.menu = menu;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oquantity=" + oquantity + ", menu=" + menu + "]";
	}
	
}
public class MapOfHotelOrder {

	public static void main(String[] args) {
		
		ArrayList<Order>list=new ArrayList<>();
		
		list.add(new Order(101,2,new Menu(1,"Panner",240)));
		list.add(new Order(102,2,new Menu(2,"Mixveg",180)));
		list.add(new Order(103,1,new Menu(3,"Panner",240)));
		list.add(new Order(104,2,new Menu(4,"Rice",130)));
		list.add(new Order(105,1,new Menu(5,"Rice",130)));
		list.add(new Order(106,1,new Menu(6,"Mixveg",180)));
		list.add(new Order(107,1,new Menu(2,"Panner",240)));
		list.add(new Order(108,2,new Menu(2,"Mixveg",180)));
		
		
		HashMap<String,Integer>map=new HashMap<>();
		
		for(Order o:list)
		{
			int total=0;
			if(map.containsKey(o.menu.mname))
			{
				total=map.get(o.menu.mname);
				total=total+(o.menu.mprice)*o.oquantity;
			}
			else
			{
				total=total+(o.menu.mprice)*o.oquantity;
			}
			map.put(o.menu.mname,total);
		}
		
		
		
		for(Map.Entry<String,Integer>m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
