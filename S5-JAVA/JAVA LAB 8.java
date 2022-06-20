// merge two arrays

import java.util.Arrays;

public class pg8 {
    public static void main(String args[]){ 
        int i,j;
        int[] firstArray = {23,45,12,78,4,90,1};        
        int[] secondArray = {77,11,45,88,32,56,3}; 

        int first = firstArray.length;
        int second = secondArray.length;
        int[] result = new int[first + second]; 

        for( i=0; i <first ; i++){
            result[i] = firstArray[i];
        }  
        for( i=first ,j= 0 ;j <second ; i++,j++){
            result[i] = secondArray[j];
        }  
        System.out.println(Arrays.toString(result)); 
    }
}
