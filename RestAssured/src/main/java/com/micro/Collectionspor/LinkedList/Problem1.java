package com.micro.Collectionspor.LinkedList;

import java.util.LinkedList;

public class Problem1
{
    public static void main(String[] args)
    {
        LinkedList<String> names = new LinkedList<>();
        names.add("Hema");
        names.add("Raju");
        names.add("Ravi");
        names.add("Shanthi");

        names.remove("Hema");

        System.out.println(names);

        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(5);

        nums.remove(Integer.valueOf(3));

        System.out.println(nums);

    }
}
