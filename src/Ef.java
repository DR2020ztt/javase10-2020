
public class Ef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,2,3,4,5,6};
		int l=0;
		int r=arr.length-1;
		System.out.println();
		
	}
	public static int method(int key,int l,int r)
	{
		int m=(l+r)/2;
		int[] arr={1,2,3,4,5,6};
		key=4;
		
		if(l>r)
		{
			return -1;
		}
		if(r>m)
		{
			return method(key,l+1,r);
		}
		if(l>m)
		{
			return method(key,l,r-1);
		}
		if(arr[m]==key)
		{
			return m;
		}
		return m;
		
	}

}
