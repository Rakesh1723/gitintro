import java.util.*;
class Fac 
{
	public static void main(String[] args) 
	{
		int n=5;
		 ArrayList<Integer> ar=new ArrayList<>();
       ar.add(1);
	   int size=1;
       for(int i=2;i<=n;i++)
       { int c=0;
          for(int j=0;j<size;j++)
          { int v=ar.get(j)*i+c;
            ar.set(j,v%10);
            c=v/10;      
          }
          while(c!=0)
          { ar.add(c%10);
            c=c/10;
			size++;
          }     
       }
       Collections.reverse(ar);
       System.out.println(ar);
	}
}
