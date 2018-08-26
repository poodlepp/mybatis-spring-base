package app01a.thread;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class PutIfAbsentDemo {
    public static void main(String[] args) {
        //ConcurrentHashMap 的 putIfAbsent 方法，是它独有的，线程安全
        //如果已经存在该键，则不存入新的值
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        String temp = map.putIfAbsent("a", "aaa");
        System.out.println(temp);
        System.out.println(map.get("a"));

        temp = map.putIfAbsent("a","bbb");
        System.out.println(temp);
        System.out.println(map.get("a"));
    }
}
