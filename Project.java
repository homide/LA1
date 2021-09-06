import java.util.*;

public class Project{

    //This is a basic code for finding a position in the given array

    private static int positionFind(int x, int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    private static void main(String args[]) {
        int[] arr = {0,1,2,3,4,5};
        int x = 4;
        System.out.println(positionFind(x,arr));
    }
}