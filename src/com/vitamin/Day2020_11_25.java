package com.vitamin;


import java.util.ArrayList;

public class Day2020_11_25 {

    public static void main(String[] args) {
	    String strBefore = "aaaaaacndhieuhfwia";
	    String strAfter = delDuplicateString(strBefore);
	    System.out.println(strAfter);

	    int[] arr = {1,2,2,2,2,3,4,5,1};
	    ArrayList<Integer> al = delDuplicateArray(arr);
	    for (int i = 0; i < al.size(); i++) {
	        System.out.println(al.get(i) + "\n");
        }

    }

    //字符串去重
    public static String delDuplicateString(String str) {
        if (0 == str.length()) {
            return str;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            //index of 返回指定字符在字符串中第一次出现处的索引
            if (i == str.indexOf(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    //数组去重
    public static ArrayList<Integer> delDuplicateArray(int[] arr) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if (0 == arr.length) {
            return al;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!al.contains(arr[i])) {
                al.add(arr[i]);
            }
        }

        return al;
    }

    //二分查找

    //比较两个二叉树是否相同

    //单例模式

    //海量数据排序问题

}
