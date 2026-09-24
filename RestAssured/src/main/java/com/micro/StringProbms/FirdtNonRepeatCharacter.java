package com.micro.StringProbms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirdtNonRepeatCharacter
{
    public static void main(String[] args)
    {
       String str ="yyaabbtkkl";

       LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++)
        {
            Character c = str.charAt(i);
            if(hashMap.containsKey(c))
            {
                hashMap.put(c, hashMap.get(c) + 1);
            }
            else
            {
                hashMap.put(c,1);
            }
        }

        for (Character s : hashMap.keySet())
        {
            if (hashMap.get(s)==1)
            {
                System.out.println(s);
                break;
            }

        }



    }
}
