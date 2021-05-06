package edu.xcdq.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author WangPenghui
 * @date 2021/5/6 16:30
 */
public class Test01 {
    public static void main(String[] args) {
        String str[] = { "中文" , "计算机" , "ABC" , "123" , "qq@qq.com"};

        // 1 Arrays.asList() 把数组转换成list列表
        List<String> stringList = Arrays.asList(str);
        for (String string : stringList) {
            System.out.println(string + "\t");
        }

        System.out.println();

        // 2 new ArrayList<>(Arrays.asList(str))
        ArrayList<String> alist = new ArrayList<>(Arrays.asList(str));
        alist.remove(2);
        for (String string : alist) {
            System.out.println(string + "\t");
        }
    }
}
