package java_basics;

public class stringsegmentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"Apple","Apple","Pie","Peer"};
		String res="applepeer";
		
		for(int i=0;i<str.length;i++) {
			if(res.contains(str[i].toLowerCase())) {
				System.out.print(str[i]);
			}
		}

	}

}
