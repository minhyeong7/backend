package day_0804;

public class Employee {
    private String name;
    protected String position;


    Employee(String name){
        this.name=name;
        this.position="직원";
    }

    void work(){
        System.out.println(getname()+"은 업무를 수행합니다.");
    }

    void showInfo(){

        System.out.println(getname()+" /"+" 직책:"+position);
    }

    String getname(){
        return this.name;
    }

}
