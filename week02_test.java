package Weektest;
import java.util.*;
public class week02_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		int n=scan.nextInt();
		//int key;int value;
		//char ch=scan.next().charAt(0);
		for(int i=0;i<n;i++){
			char ch=scan.next().charAt(0);
			int key=0;
			int value=0;
			if(ch=='a') {
				 key=scan.nextInt();
				 value=scan.nextInt();
				map.put(key,value);
			}
			else if(ch=='b') {
				key=scan.nextInt();
				System.out.print(map.get(key));
			}
			else if(ch=='d') {
				key=scan.nextInt();
				System.out.print(map.remove(key));
			}
			else if(ch=='c') {
				System.out.print(map.size());
			}
			else if(ch=='e') {
				//map=((TreeMap<Integer, Integer>) map.descendingKeySet());
				System.out.print(map.descendingMap().descendingKeySet());
			}
		}
		//map.get(map);
	}

}
