import java.awt.*;
import java.util.Scanner;

public class TwoDArray {
    public static int[][] arr = {
            {0,0,0,0,0},
            {0,2,1,1,0},
            {0,1,0,1,0},
            {0,1,1,1,0},
            {0,0,0,0,0}};


    public static void main(String[] args){

        print();

        Scanner scan = new Scanner(System.in);


        int rowPos=1;
        int columnPos=1;

        while (true){
            String input = scan.nextLine();
            System.out.println(input);


            if (input.equals("d")){
                if (arr[rowPos][columnPos+1]!=0){
                    arr[rowPos][columnPos+1] = 2;
                    arr[rowPos][columnPos] = 1;
                    columnPos++;
                }
            }
            if (input.equals("a")){
                if (arr[rowPos][columnPos-1]!=0){
                    arr[rowPos][columnPos-1] = 2;
                    arr[rowPos][columnPos] = 1;
                    columnPos--;
                }
            }
            if (input.equals("s")){
                if (arr[rowPos+1][columnPos]!=0){
                    arr[rowPos+1][columnPos] = 2;
                    arr[rowPos][columnPos] = 1;
                    rowPos++;
                }
            }
            if (input.equals("w")){
                if (arr[rowPos-1][columnPos]!=0){
                    arr[rowPos-1][columnPos] = 2;
                    arr[rowPos][columnPos] = 1;
                    rowPos--;
                }
            }
            print();

        }
        /**
         * arr[row that 2 is in] [old position column + 1] = 2
         * arr [row that 2 is in] [old position column] = 1
         *
         *
         * */
//        arr[1][3]=2;
//        arr[1][2]=1;

    }

    public static void print(){
        for(int[] row : arr){
            for(int num : row){
                System.out.print(num);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
