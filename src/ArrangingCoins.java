import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int number=scanner.nextInt();
        System.out.println(Count(number));
    }
    public static int Count(int number)
    {
        int count=0,rows=1;
        while (number>rows)
        {
            number-=rows;
            rows++;
            count++;
        }
        return count;
    }
}
