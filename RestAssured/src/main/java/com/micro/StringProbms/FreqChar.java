package com.micro.StringProbms;

import java.util.HashMap;
import java.util.Map;

public class FreqChar
{

    public static void main(String args[])
    {
        String str = "Jangam Hema Sekharaiah";

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i <str.length() ; i++)
        {
            Character c = str.charAt(i);
            if (c ==' ')
            {
                continue;
            }
            if(map.containsKey(c))
            {
                map.put(c, map.get(c) + 1);
            }
           else
            {
                map.put(c,1);
            }

        }

        System.out.println(map);
    }

}
