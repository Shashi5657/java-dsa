import java.util.*;

public class Main {

    public static void main(String[]args){
        int [] [] arr = new int [4][5];
        
        //set item
        arr[2][1] = 8;
        //get item
        System.out.println(arr[2][1]);
        System.out.println(arr[3][1]);
        
        //row count
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        
        //traversal
        
        for(int i = 0; i < arr.length; i++){// i --> rows
            for (int j = 0; j < arr[0].length; j++){//j--> columns
                
            }
    }
}