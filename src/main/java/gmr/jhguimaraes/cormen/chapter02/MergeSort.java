package gmr.jhguimaraes.cormen.chapter02;

public class MergeSort {

    public static void  sort(int[] A, int p, int r){
        if(p < r){
            int q = (p + r) / 2;

            sort(A, p, q);
            sort(A, q + 1, r);
            Merge.merge(A, p, q, r);
        }
    }
}
