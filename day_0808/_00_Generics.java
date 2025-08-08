package day_0808;

public class _00_Generics {
    public static void main(String[] args) {
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A","B","C","D","E"};

        System.out.println("------------------------");

//        printStringArray(sArray);
//        printDoubleArray(dArray);
//        printIntArray(iArray);

            printAnyArray(iArray);

    }

    private static <T> void printAnyArray(T[] array){
        for (T t:array){
            System.out.print(t + " ");
        }
        System.out.println();
    }


    private static void printStringArray(String[] aaa){
        for (String s : aaa) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] bbb){
        for (Double d : bbb) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] ccc){
        for (Integer i : ccc) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
