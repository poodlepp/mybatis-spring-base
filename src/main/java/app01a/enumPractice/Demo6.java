package app01a.enumPractice;

import org.aspectj.weaver.patterns.HasMemberTypePattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

enum Demo7{
    SMALL,MIDDLE,LARGE
}

/**
 * 枚举集合的使用
 */
public class Demo6 {
    Map map = new HashMap<Enum,String>();

    Set set = new HashSet<Enum>();
}
