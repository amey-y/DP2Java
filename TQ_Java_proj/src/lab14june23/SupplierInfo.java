package lab14june23;

import java.util.*;

public class SupplierInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of Suppliers you want to add: ");
		int sNum = sc.nextInt();

		ArrayList<Supplier> s = new ArrayList<>();

		for (int i = 0; i < sNum; i++) {
			System.out.println("Enter supplier ID: ");
			int sId = sc.nextInt();

			System.out.println("Enter supplier name: ");
			String sName = sc.next();

			System.out.println("Enter Item ID: ");
			int iId = sc.nextInt();

			System.out.println("Enter Item Name: ");
			String iName = sc.next();

			System.out.println("Enter Item Price: ");
			int iPrice = sc.nextInt();

			s.add(new Supplier());
			s.get(i).setsId(sId);
			s.get(i).setsName(sName);
			s.get(i).setI(new Item());
			s.get(i).getI().setiId(iId);
			s.get(i).getI().setiName(iName);
			s.get(i).getI().setiPrice(iPrice);

		}

		Iterator<Supplier> itr = s.iterator();
		while (itr.hasNext()) {
			Supplier sd = itr.next();
			if (sd.getI().getiPrice() > 100) {
				System.out.println(sd.getsName());
			}

		}

	}

}
