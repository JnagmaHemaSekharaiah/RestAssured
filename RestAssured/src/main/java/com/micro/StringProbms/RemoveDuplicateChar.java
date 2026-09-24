package com.micro.StringProbms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar
{
    public static void main(String[] args)
    {
      String str = "banana";

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++)
        {
           set.add(str.charAt(i));
        }

        System.out.println(set);


    }
}
