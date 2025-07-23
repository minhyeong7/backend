package day_0723;

public class _02_For2 {
    public static void main(String[] args) {

        int count =0;
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5; j++){
                System.out.println(i+"번방"+j+"형님");
                count++;
            }
        }
        System.out.println(count);



        for (int i=2; i<=9; i++){
            for (int j=1; j<=9; j++){
                System.out.print(i+"X"+j+"="+i*j+" ");
                System.out.print("\t");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        for (int i=1; i<=9; i++){
            for (int j=2; j<=9; j++){
                System.out.print(j+"X"+i+"="+i*j+" ");
                System.out.print("\t");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------");


        for (int i=0; i<5; i++){
            for (int j=0; j<=i; j++){
                System.out.print("@");
            }
            System.out.println();
        }


        System.out.println();

//        for (int i = 5; i >0; i--) {
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        for (int i = 0; i <5; i++) {
            for (int k=0; k<5-i; k++){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.print("@");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i <5; i++) {
            for (int k=0; k<5-i; k++){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.print("@");
            }

            for (int j=0; j<i; j++){
                    System.out.print("@");
                }
            System.out.println();
        }


        System.out.println();

        for (int i = 0; i <5; i++) {
            for (int k=0; k<5-i; k++){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.print("@");
            }

            for (int j=0; j<i; j++){
                System.out.print("@");
            }
            System.out.println();
        }


    }
}
