package day_0804;

public class Manager extends Employee {

    Manager(String name){
        super(name);
        this.position="관리자";
    }



    void work(){
        System.out.println(getname()+"은 회의를 주재합니다");
    }

    void showInfo(){
        System.out.println(getname()+" /"+" 직책:"+position);
        System.out.println("추가 역할: 팀관리");
    }


}
