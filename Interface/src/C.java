
public class C implements B 
{
	public void disp1()
	{
		System.out.println("disp1");
	}

	public void disp2()
	{
		System.out.println("disp2");
	}
	

		public static void main(String args[])
		{  
			C c = new C();
			c.disp1();
			c.disp2();
			
		}
	}
