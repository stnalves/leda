import java.util.Arrays;

public class MergeSortAsserts {

    public static void main(String[] args) {
        MergeSortAsserts t = new MergeSortAsserts();
        t.testSort();
        t.testOrdenadosCrescente();
        t.testOrdenadosDecrescente();
        t.testOrdenadosDistintos();
    }

    public void testOrdenadosCrescente() {
        MergeSort sorting = new MergeSort();
        int[] a;
        int[] b;
        int[] v;

        a = new int[]{1, 3, 5, 7};
        b = new int[]{2, 4, 6, 8};
        v = sorting.mergeOrdenadosCrescente(a, b);
        assert Arrays.equals(v, new int[]{1, 2, 3, 4, 5, 6, 7, 8});

        a = new int[]{1, 2, 3, 4};
        b = new int[]{5, 6, 7, 8};
        v = sorting.mergeOrdenadosCrescente(a, b);
        assert Arrays.equals(v, new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    
        a = new int[]{1, 2 ,3};
        b = new int[]{};
        v = sorting.mergeOrdenadosCrescente(a, b);
        assert Arrays.equals(v, new int[]{1, 2, 3});

        a = new int[]{};
        b = new int[]{4, 5};
        v = sorting.mergeOrdenadosCrescente(a, b);
        assert Arrays.equals(v, new int[]{4, 5});

        a = new int[]{1};
        b = new int[]{2};
        v = sorting.mergeOrdenadosCrescente(a, b);
        assert Arrays.equals(v, new int[]{1, 2});
        
        a = new int[]{2};
        b = new int[]{1};
        v = sorting.mergeOrdenadosCrescente(a, b);
        assert Arrays.equals(v, new int[]{1, 2});
        
        a = new int[]{1, 2, 3};
        b = new int[]{1, 2, 3};
        v = sorting.mergeOrdenadosCrescente(a, b);
        assert Arrays.equals(v, new int[]{1, 1, 2, 2, 3, 3});
    }
    
    public void testOrdenadosDecrescente() {
        MergeSort sorting = new MergeSort();
        int[] a;
        int[] b;
        int[] v;

        a = new int[]{7, 5 , 3, 1};
        b = new int[]{8, 6, 4, 2};
        v = sorting.mergeOrdenadosDecrescente(a, b);
        assert Arrays.equals(v, new int[]{1, 2, 3, 4, 5, 6, 7, 8});

        a = new int[]{4, 3, 2, 1};
        b = new int[]{8, 7, 6, 5};
        v = sorting.mergeOrdenadosDecrescente(a, b);
        assert Arrays.equals(v, new int[]{1, 2, 3, 4, 5, 6, 7, 8});

        a = new int[]{3, 2, 1};
        b = new int[]{};
        v = sorting.mergeOrdenadosDecrescente(a, b);
        assert Arrays.equals(v, new int[]{1, 2, 3});

        a = new int[]{};
        b = new int[]{5, 4};
        v = sorting.mergeOrdenadosDecrescente(a, b);
        assert Arrays.equals(v, new int[]{4, 5});

        a = new int[]{1};
        b = new int[]{2};
        v = sorting.mergeOrdenadosDecrescente(a, b);
        assert Arrays.equals(v, new int[]{1, 2});

        a = new int[]{2};
        b = new int[]{1};
        v = sorting.mergeOrdenadosDecrescente(a, b);
        assert Arrays.equals(v, new int[]{1, 2});

        a = new int[]{3, 2, 1};
        b = new int[]{3, 2, 1};
        v = sorting.mergeOrdenadosDecrescente(a, b);
        assert Arrays.equals(v, new int[]{1, 1, 2, 2, 3, 3});
    }

    public void testOrdenadosDistintos() {
        MergeSort sorting = new MergeSort();
        int[] a;
        int[] b;
        int[] v;
    
        a = new int[]{1, 3, 5, 7};
        b = new int[]{8, 6, 4, 2};
        v = sorting.mergeOrdenadosDistintos(a, b);
        assert Arrays.equals(v, new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        
        a = new int[]{1, 2, 3, 4};
        b = new int[]{8, 7, 6, 5};
        v = sorting.mergeOrdenadosDistintos(a, b);
        assert Arrays.equals(v, new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        
        a = new int[]{1, 2 ,3};
        b = new int[]{};
        v = sorting.mergeOrdenadosDistintos(a, b);
        assert Arrays.equals(v, new int[]{1, 2, 3});
        
        a = new int[]{};
        b = new int[]{5, 4};
        v = sorting.mergeOrdenadosDistintos(a, b);
        assert Arrays.equals(v, new int[]{4, 5});
        
        a = new int[]{1};
        b = new int[]{2};
        v = sorting.mergeOrdenadosDistintos(a, b);
        assert Arrays.equals(v, new int[]{1, 2});
        
        a = new int[]{2};
        b = new int[]{1};
        v = sorting.mergeOrdenadosDistintos(a, b);
        assert Arrays.equals(v, new int[]{1, 2});
        
        a = new int[]{1, 2, 3};
        b = new int[]{3, 2, 1};
        v = sorting.mergeOrdenadosDistintos(a, b);
        assert Arrays.equals(v, new int[]{1, 1, 2, 2, 3, 3});
    }

    public void testSort() {
        MergeSort sorting = new MergeSort();
        int[] v;

        v = new int[]{8, 1, 78, 45, 3, 2, 103};
        sorting.sort(v, 0, v.length - 1);
        assert Arrays.equals(v, new int[]{1, 2, 3, 8, 45, 78, 103});

        v = new int[]{2};
        sorting.sort(v, 0, v.length - 1);
        assert Arrays.equals(v, new int[]{2});

        v = new int[]{1, 2, 3, -4};
        sorting.sort(v, 0, v.length - 1);
        assert Arrays.equals(v, new int[]{-4, 1, 2, 3});

        v = new int[]{10, 2, 3, 4};
        sorting.sort(v, 0, v.length - 1);
        assert Arrays.equals(v, new int[]{2, 3, 4, 10});
    }
}
