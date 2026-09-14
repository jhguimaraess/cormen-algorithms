package gmr.jhguimaraes.cormen.chapter02;

public class Merge {

    /*
        subarranjos A[p ... q] e A[q+1 ... r]
        L[n1] = 9999 e R[n2] = 9999 são sentinelas
    */
    public static void merge(int[] A, int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - q;

        int i, j;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        for(i = 0; i < n1; i++){
            L[i] = A[p + i];
        }
        for(j = 0; j < n2; j++){
            R[j] = A[q + j + 1];
        }
        L[n1] = 9999;
        R[n2] = 9999;

        i = 0; j = 0;
        for(int k = p; k <= r; k++){
            if (L[i] <= R[j]){
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
        }
    }
}
