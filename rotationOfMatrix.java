public class rotationOfMatrix {
    static void printMatrix(int [][] matrix, int r){
        for(int i=0; i<r; i++){
            for(int j=0; j<r; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void reverseArray(int [] Arr){
        int i=0; int j=Arr.length-1;
        while(i<j){
            int temp = Arr[i];
            Arr[i]=Arr[j];
            Arr[j]=temp;
            i++;
            j--;
        }
    }
    static void transposeInPlace(int [][] matrix, int r){
        for(int i=0; i<r; i++){
            for(int j=i+1; j<r; j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void rotate90(int [][] matrix, int r){
        transposeInPlace(matrix, r);
        for(int i=0; i<r; i++){
            int p=0; int q = r-1;
            while(p<q){
                int temp = matrix[i][p];
                matrix[i][p]=matrix[i][q];
                matrix[i][q]=temp;
                p++;
                q--;
            }
        }
    }
    static void rotate180(int [][] matrix, int r){
       int p=0; int q=r-1;
       while(p<q){
           int [] temp = matrix[p];
           matrix[p]=matrix[q];
           matrix[q]=temp;
           p++;
           q--;

       }
       for(int i=0; i<r; i++){
           reverseArray(matrix[i]);
       }
    }
    static void rotate270(int [][] matrix, int r){
        transposeInPlace(matrix, r);
        int i=0; int j=r-1;
        while(i<j){
            for(int p=0; p<r; p++){
                int temp = matrix[i][p];
                matrix[i][p]= matrix[j][p];
                matrix[j][p]=temp;

            }
            i++;
            j--;
        }
    }
    public static void main(String [] args){
        int [][] A ={{1,2,3},{4,5,6},{7,8,9}};
        rotate270(A,3);
        printMatrix(A,3);

    }

}



