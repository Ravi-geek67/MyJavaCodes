package hundreadDasyCoding;

public class BinarySearch19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array should be sorted
		int a[]= {10,20,30,40,50,60,70,80,90};
		int key=30;
		int l=0;
		boolean flag=false;
		int h=a.length;
		while(l<=h) {
			int m=(l+h)/2;
				
			if(a[m]==key)	{
				flag=true;
				
				System.out.println("found");
				break;
			}
			if(a[m]<key) {
				l=m+1;
			}
			if(a[m]>key) {
				h=m-1;
			}
		
		}
		if(flag==false) {
			System.out.println("not found");
		}
		
		
		
		
			
			
		

	}

}
