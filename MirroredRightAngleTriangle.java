package star_patterns;

/*
   *
  **
 ***
****
 */
public class MirroredRightAngleTriangle 
{
	public static void main(String[] args) 
	{
		int space = 3;
		int star = 1;
		for(int i=0;i<=3;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			space--;
			star++;
			System.out.println();
		}
	}
}
