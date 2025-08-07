package day_0806;

import java.util.Scanner;

class Menu{
    String name;
    int price;

    Menu(String name, int price){
        this.name=name;
        this.price=price;

    }

    void order(){
        System.out.print(this.name+"("+this.price+")");
    }
}

class Chicken extends Menu{
    Chicken(String name,int price){
        super(name,price);
    }

    @Override
    void order(){
        super.order();
        System.out.println("을 주문합니다 "+"양념소스를 선택하였습니다");
    }
}


class Pizza extends Menu{
    Pizza(String name,int price){
        super(name,price);
    }

    @Override
    void order(){
        super.order();
        System.out.println("를 주문합니다 "+"도우는 얇은 걸로 선택되었습니다");;
    }
}



class Jokbal extends Menu{
    Jokbal(String name , int price){
        super(name,price);
    }

    @Override
    void order(){
        super.order();
        System.out.println("을 주문합니다 "+"매운족발로 선택되었습니다");
    }
}



public class DeliveryApp {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        Menu[] menus=new Menu[3];

        menus[0]=new Chicken("치킨",17000);
        menus[1]=new Pizza("피자",15000);
        menus[2]=new Jokbal("족발",13000);



        while(true){

            for(Menu menu : menus ){

                System.out.println("===메뉴를 선택하세요===");
                System.out.println("1.치킨");
                System.out.println("2.피자");
                System.out.println("3.족발");
                System.out.println("0.종료");
                System.out.print("선택:");
                int num=sc.nextInt();
                switch (num){
                    case 0:
                        System.out.println("주문이 종료되었습니다 감사합니다!");
                        return ;
                    case 1:
                        menus[0].order();
                        break;
                    case 2:
                        menus[1].order();
                        break;
                    case 3:
                        menus[2].order();
                        break;

                }
            }




        }




    }
}
