import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main
{
    public class maze
    {
        private static int N = 8;
        private static int[][] arr =
                {
                        {0,0,0,0,0,0,0,1},
                        {0,1,1,0,1,1,0,1},
                        {0,0,0,1,0,0,0,1},
                        {0,1,0,0,1,1,0,0},
                        {0,1,1,1,0,0,1,1},
                        {0,1,0,0,0,1,0,1},
                        {0,0,0,1,0,0,0,1},
                        {0,1,1,1,0,1,0,0}
                };
        private static final int Pathway_color = 0;  //하얀색
        private static final int Wall_color = 1;     //파란색, 벽
        private static final int Blocked_color = 2;  //빨간색, 방문한 셀 표시(방문했지만 출구로 갈 수 없는 셀)
        private static final int Path_color = 3;     //녹색, 방문한 셀 표시(확실하게 판정이 안 된 경우 일단 녹색으로 칠함 )

        public static boolean findmazePath(int x, int y)
        {
            if(x<0 || y < 0 || x >=N || y >= N) return false; //미로의 범위 밖
            else if(arr[x][y] != Pathway_color) return false; //이미 방문했거나 벽인 경우
            else if(x == N-1 && y == N-1)
            {
                arr[x][y] = Path_color; //방문이 되었으니까 녹색 칠하고
                return true;
            }
            else
            {
                arr[x][y] = Path_color;
                if(findmazePath(x-1, y) ||  findmazePath(x, y+1) ||
                        findmazePath(x+1, y) || findmazePath(x,y-1))
                {  //순환 메소드로 true값이 있는 지 검사
                    return true;
                }
                arr[x][y] = Blocked_color;  //방문한 곳
                return false;
            }

        }
    }

    public static void main(String[] args) throws IOException
    {
        
    }



}

