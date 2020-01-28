package CTSdemo;
import java.util.ArrayList;
import java.util.Scanner;

public class ListArray {

	public static void main(String[]args)
	{
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Subhashini");
		list1.add("Suvarna");
		list1.add("Navya");
		ArrayList<String> list2=new ArrayList<>();
		list2.add("Anjali");
		list1.addAll(list2);
		System.out.println(list1);
		list1.clone();
		System.out.println(list1);
		//list1.clear();
		System.out.println(list1);
		System.out.println(list1.contains("Suvarna"));
		System.out.println(list1.contains("varna"));
		System.out.println(list1.indexOf("Suvarna")>0);
		System.out.println(list1.indexOf("varna")>0);
		list1.ensureCapacity(10);
		list1.add("Kavya");
		list1.add("Geeta");
		list1.add("Geeta");
		System.out.println(list1);
		int lastIndex=list1.lastIndexOf(" Geeta");
		System.out.println(lastIndex);
	}
}
