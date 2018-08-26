package app01a.enumPractice;

interface Demo5 {
    //可以直接在内部定义或者新建一个类实现本接口
    enum Dessert implements Demo5{
        FRUIT,CAKE,GELATO
    }
    //可以定义多个。。。
}

/**
 * 枚举分类；多态
 */
public class Demo4{
    private static void testEnumInterface(){
        Demo5.Dessert.values();//...
    }
}