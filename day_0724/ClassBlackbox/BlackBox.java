package day_0724.ClassBlackbox;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;
    static int counter =0;
    static boolean conAutoReport = false;


  BlackBox(){
      System.out.println("기본 모델 출고");
      this.serialNumber = ++counter;
      System.out.println("시리얼 넘버 발급 완료: "+ this.serialNumber);
  }

  BlackBox(String modelName, String resolution, int price,String color){
      this.modelName = modelName;
      this.resolution  = resolution;
      this.price = price;
      this.color = color;
      this.serialNumber= ++counter;
  }



    void autoReport(){
        if (conAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고합니다");
        }else{
            System.out.println("자동신고 기능이 없구먼유");
        }
    }

    void insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다");
        System.out.println("용량은"+capacity+"GB 입니다.");

    }

    int getVideoFileCount(int type){
        if(type == 1){
            return 9;
        }else if(type == 2){
            return 1;
        }
        else return 10;
    }


    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다");
        if(showDateTime){
            System.out.println("여상의 날짜 정보가 표시됩니다.");
        }
        if (showSpeed){
            System.out.println("영상의 속도 표시됩니다.");
        }
        System.out.println("영상은 "+min+ "단위로 표시됩니다");
    }

    void record(){
        record(true,true,5);
    }

//    스태틱 메서드 안에서는 스태틱 필드만 쓸 수 있다
    static void  callServiceCenter(){
        System.out.println("서비스 센터(1234-0000) 으로 연락합니다");
        // modelName = "asd"; 사용 불가
        conAutoReport= true;
    }

    void appendModelName(String modelName){
//        this.modelName=this.modelName+modelName;
        System.out.println(this.modelName+modelName);
    }


//    게터 & 세터

    String getModelName(){
      return modelName;
    }
    void setModelName(String modelName){
      this.modelName=modelName;
    }




    String getResolution(){
      if(resolution == null || resolution.isEmpty()){
          return  "판매자에게 문의하세요";
      }
      return resolution;
    }
    void setResolution(String resolution){
      this.resolution= resolution;
    }

    int getPrice(){
      return price;
    }
    void setPrice(int price){
      if(price<100000){
          this.price=100000;
      }
      this.price=price;
    }

}
