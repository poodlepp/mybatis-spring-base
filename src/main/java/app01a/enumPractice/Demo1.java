package app01a.enumPractice;

//定义一个简单的枚举
enum Demo2 {
    RED,GREEN,YELLOW
}

public class Demo1{
    Demo2 temp = Demo2.RED;
    // switch   enum
    public void test(Demo2 param){
        switch (param){
            case RED:{
                temp = Demo2.GREEN;
                break;
            }
            case GREEN:{
                temp = Demo2.YELLOW;
                break;
            }
            case YELLOW:{
                temp = Demo2.RED;
                break;
            }
        }
    }

    public static void main(String[] args) {

    }
}
