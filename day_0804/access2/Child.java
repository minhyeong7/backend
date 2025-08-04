package day_0804.access2;

import day_0804.access1.Parent;

public class Child extends Parent {


    void accessTest(){
        super.accessProtected();

        Parent p1 = new Parent();
    }
}
