package com.hex.math.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**数组
 * @Date 2020-2-18 21:41
 * @Author hex
 * @Desc
 */
public class MathTest1Array {
    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,5};
        List<Integer> arrayList = Arrays.asList(array);
        ArrayList list = new ArrayList(arrayList);
        list.add(0,111);
        for (Integer math: arrayList) {
            System.out.println(math.toString());
        }
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(0,1);

    }
}
