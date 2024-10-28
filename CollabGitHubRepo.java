import java.util.Scanner;
public class CollabGitHubRepo
{
	public static void main(String[] agrs)
	{
		System.out.println("Aahana");
		createSquareArr();
	}

	public static void createSquareArr()
	{
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();

		int[][] arr = new int[num][num];

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[0].length; j++) {
				int rand = (int)(Math.random() * 10) + 1;
				arr[i][j] = rand;
				System.out.print(arr[i][j] + "   ");
			}
				System.out.println();
		}

		System.out.println(arrTasks(arr));
	}

	public static int arrTasks(int[][] arr)
	{
		for (int j = 0; j < arr[0].length; j++)
			for (int i = 0; i < arr.length; i++)
				if (arr[i][j] % 2 == 0)
					return arr[i][j];
		return -1;
	}
}