package day_0725;

public class Car {
   String brand;
   String color;
   String Carname;
   private String Username; // 개인정보
   int wheel;
   int price;
   static int register_car_count=0;


   Car(){
       System.out.println("아무 정보도 없는 기본 차 생성");
       register_car_count++;
   }


   Car(String brand, String color, String Carname, int wheel ,int price, String Username){
    this.brand=brand;
    this.color=color;
    this.Carname=Carname;
    this.wheel=wheel;
    this.price=price;
    this.Username=Username;
    System.out.println("커스텀된 차량 생성");
    register_car_count++;
   }


   void Carsound(){
       if(this.Carname == "말리부"){
           System.out.println("해당 차량이름:"+this.Carname);
           System.out.println("말리부.mp4");
       }else if(this.Carname == "쏘나타"){
           System.out.println("해당 차량이름:"+this.Carname);
           System.out.println("쏘나타.mp4");
       }else if(this.Carname == "아반떼"){
           System.out.println("해당 차량이름:"+this.Carname);
           System.out.println("아반떼.mp4");
       }else{
           System.out.println("등록되지 않은 차량");
       }

   }

   String getUsername(){
       return this.Username;
   }
   void setUsername(String name){
       if (this.Username== name){
           System.out.println("이전 사용자의 이름과 동일합니다");
       }else{
           this.Username=name;
           System.out.println("사용자의 이름이 변동되었습니다");
           System.out.println("변동된 이름:"+this.Username);
       }

   }







}
