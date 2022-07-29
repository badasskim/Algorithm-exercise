import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


    }

    public static int search(int[] arr,int n,int target) //순차탐색
    {
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == target)return i;
        }
        return-1;
    }

    public static int search(int[] arr, int begin, int end, int target)
    {  //순차탐색 명시화(리커션)
        if(begin > end) return -1;

        if(target == arr[begin]) return begin;
        else return search(arr, begin + 1, end, target);
    }

    public static int findMax(int[] arr, int begin, int end)
    {
        if(begin == end) return arr[begin];
        else return Math.max(arr[begin], findMax(arr, begin+1, end));
        //Math.max(int a, int b) => 두 파라미터 중 큰 값을 리턴
    }

    public static int findMax2(int[] arr, int begin, int end)
    {
        if(begin == end) return arr[begin];
        else
        {
            int middle = (begin + end) /2;
            int max1 = findMax2(arr, begin, middle);
            int max2 = findMax2(arr, middle+1, end);
            return findMax2(arr, max1, max2);
        }
    }

    public static int binarySearch(String[] arr,String target, int begin, int end)
    {
        if(begin == end) return -1;
        else
        {
            int middle = (begin + end) /2 ;
            int compResult = target.compareTo(arr[middle]);
            if(compResult == 0) return middle;
            else if(compResult < 0) return binarySearch(arr, target, begin, middle -1);
            else return binarySearch(arr, target, middle+1, end);
        }
    }

}

