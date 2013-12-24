
public class combination {
	public static void main(String[] args)
	{
		char[] Arr = {'a','b','c','d','e'};
		String a = "";
		combination(a,Arr,0);
	}
	public static void combination(String a, char[] Arr, int index)
	{
		String tmp = a;
		for(int i=index;i<Arr.length;i++)
		{
			a+=Arr[i];
			System.out.println(a);
			combination(a,Arr,i+1);
			a=tmp;
		}
	}
}
