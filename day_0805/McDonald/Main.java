package day_0805.McDonald;

public class Main {
    public static void main(String[] args) {
        Hamburger[] hamburgers=new Hamburger[3];
        hamburgers[0]=new Hamburger("햄버거");
        hamburgers[1]=new Shrimp("새우버거");
        hamburgers[2]=new Cheese("치즈버거");



        for(Hamburger hamburger : hamburgers){
            System.out.println("--------------");
            hamburger.cook();
            System.out.println("--------------");
        }
    }
}
