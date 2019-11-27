package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class emp_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age;
		int n=s.nextInt();
		Map<Integer,employee1>map=new HashMap<Integer,employee1>();
		employee1[] emp=new employee1[n];
		for(int i=0;i<n;i++)
		{
			String name = s.next();
			age=s.nextInt();
			emp[i]=new employee1();
			emp[i].setAge(age);
			emp[i].setName(name);
			map.put(1,emp[i]);
		}
		for(Entry<Integer,employee1>en:map.entrySet())
		{
			int key=en.getKey();
			employee1 e=en.getValue();
			System.out.println(key+e.getName()+e.getName());
			}
		s.close();
	}

	
		
	

	
	}


