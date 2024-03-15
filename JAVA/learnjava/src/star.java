public class star {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=5-1;k>=i;k--) {
				System.out.print(" ");
			}
			for(int n=5+1;n>i;n--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1;i<=5; i++)
		{
			for (int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for (int n=0;n<=i-2;n++)
			{
				System.out.print(" ");
			}
			for (int m=5+1;m>=i+1;m--)
			{
				System.out.print("*");
			}
				System.out.println();
			}
	}
}
