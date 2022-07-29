import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main
{
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp = br.readLine();


    }

    public static int StringLength(String temp) // 문자열 길이계산
    {
        if(temp.equals("")) return 0;
        else return 1 + StringLength(temp.substring(1));
    }

    public static void printChars(String temp) //문자열의 프린트
    {
        if(temp.length() == 0) return;
        else
        {
            System.out.print(temp.charAt(0));
            printChars(temp.substring(1));
        }
    }

    public static void printCharReverse(String temp)
    {
        if(temp.length()==0) return;
        else
        {
            printCharReverse(temp.substring(1));
            System.out.print(temp.charAt(0));
        }
    }

    public static void printBinary(int n)
    {
        if(n < 2) System.out.print(n);
        else
        {
            printBinary(n/2);
            System.out.print(n%2);
        }
    }

    public static int sum(int n, int[] arr) // 배열의 합
    {
        if(n<=0) return 0;
        else return sum(n-1, arr) + arr[n-1];
    }

    public static void readFrom(int n, int[] arr, Scanner in)
    {
        if(n == 0) return;
        else
        {
            readFrom(n-1, arr, in);
            arr[n-1] = in.nextInt();
        }
    }


}