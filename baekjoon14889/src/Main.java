import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] array = new int[N][N];

        for(int i =0;i <N; i++){

            st = new StringTokenizer(br.readLine());

            for(int j=0;j<N;j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i =0;i<N; i++){
            for(int j=i; j <N;j++){
                array[j][i] +=array[i][j];
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        for(int i =1;i<N;i++){
            for(int j =0;j<i;j++){
                if(i ==N)
            }
        }


    }
}