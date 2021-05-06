package edu.xcdq.hashmap;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author WangPenghui
 * @date 2021/5/6 16:09
 */
public class TreeMapTest02 {
    public static void main(String[] args) {
        TreeMap<Integer , String> treeMap = new TreeMap<>();
        treeMap.put(1 , "二狗子1");
        treeMap.put(2 , "二狗子2");
        treeMap.put(3 , "二狗子3");
        treeMap.put(4 , "二狗子4");
        //treeMap.put(4 , "二狗子4");  // 自动去除
        System.out.println(treeMap);

        for (Map.Entry<Integer , String> m : treeMap.entrySet()) {
            System.out.println(m);
        }

        for (Integer key : treeMap.keySet()) {
            System.out.println(key + "=" + treeMap.get(key));
        }

        for (String value : treeMap.values() ) {
            System.out.println(value + "\t");
        }

        // 由于treeMap键有序，而特别拥有的方法
        System.out.println("firstkey" + treeMap.firstKey());
        System.out.println("firstEntry" + treeMap.firstEntry());
        System.out.println("lastkey" + treeMap.lastEntry());
        System.out.println("lastEntry" + treeMap.lastEntry());

    }
}
