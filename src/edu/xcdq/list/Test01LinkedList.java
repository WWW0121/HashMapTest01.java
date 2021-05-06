package edu.xcdq.list;

import java.util.LinkedList;

/**
 * @author WangPenghui
 * @date 2021/5/6 10:20
 */
public class Test01LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // 1 add 添加
        list.add(123);
        list.add(346);
        System.out.println(list);
        // 2 修改值
        list.set(1,777);
        System.out.println(list);
        // 3 准备一个新列表
        LinkedList<Integer>list2 = new LinkedList<>();
        list2.add(666);
        list2.add(999);
        // 3 把新列表整体添加到原有的旧列表之上
        list.addAll(list2);
        System.out.println(list);

        // 4 增强方式 遍历列表
        for (Integer i : list2) {
            System.out.println(i + "\t");
        }
        System.out.println();

        for (int i = 0; i< list2.size(); i++) {
            System.out.println(list2.get(i) +"\t");
        }

        // 5 删除循环出的对象
        list2.remove(0);
        System.out.println(list2);
    }
}
