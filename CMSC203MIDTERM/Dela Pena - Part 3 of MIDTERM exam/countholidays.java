import java.util.*;

class countholidays
{
	public static void main (String[] args)
	{
		try (// your code goes here
		Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			
			while(t-->0){
			    int n =sc.nextInt();
			    HashSet<Integer> set = new HashSet<>();
			    set.add(6);
			    set.add(13);
			    set.add(20);
			    set.add(27);
			    set.add(7);
			    set.add(14);
			    set.add(21);
			    set.add(28);
			  
			    for(int i=0;i<n;i++){
			        int a =sc.nextInt();
			        set.add(a);
			    }
			    System.out.println(set.size());
			}
		}
	}
}
