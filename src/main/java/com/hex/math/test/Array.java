package com.hex.math.test;

/**
 * @Date 2020-2-20 18:16
 * @Author hex
 * @Desc 手写一个数组, 包括增删改查
 */
public class Array<T> {
    //定义数组
    int data[];
    //数组大小
    int size;

    //当前数组中元素个数
    int count;


    public Array(int capacity) {
        this.data = new int[capacity];
        this.size = capacity;
        count = 0;

    }

    //插入元素:头部插入，尾部插入;中间插入
    public boolean add(int index, int value) {
        if (index > count || index < 0 || count == size) {
            System.out.println("数组越界了");
            return false;
        }
        //头部插入，尾部插入,经观察,和中间插入有重复部分
       /* if (index == count) {
            data[index] = value;
            ++count;
            return true;
        }*/
        //中间插入,需要将index后的元素全部后移一位,从数组末端遍历比较合适,只需将数组count全部后移一位
        for (int i = count; i > index; --i) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        ++count;
        return true;
    }

    //根据索引获取元素
    public int get(int index) {
        if (index < 0 || index >= count) {
            return -1;
        }
        return data[index];
    }
    //删除操作
    public boolean delete(int index) {
        if (index < 0 || index >= count) return false;
        //删除只需将index后元素向前一位即可,并将最后一位置为0
        for (int i = index; i < count; i++) {
            data[i] = data[i + 1];
            System.out.println(i);
        }
        data[count] = 0;
        --count;
        return true;
    }

    public static void main(String[] args) {
        Array array = new Array(10);
        array.add(0, 1);
        array.add(1, 2);
        array.add(2, 3);
        array.add(3, 4);
        array.delete(2);
        System.out.println(array.count);
    }
}
