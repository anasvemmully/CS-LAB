//Write a program to find the tracce and transpose of a matrix

public class pg11{
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        int i,j,trace =0 ;
        
        for(i=0 ; i<matrix.length ; i++){
            System.out.println();
            for(j=0;j<matrix[0].length ; j++){
                System.out.print( matrix[j][i] + " ");
                if(i==j){
                    trace = matrix[i][i]  +trace;
                }
            }
        }
        System.out.println("\ntrace : "+trace);
    }
}