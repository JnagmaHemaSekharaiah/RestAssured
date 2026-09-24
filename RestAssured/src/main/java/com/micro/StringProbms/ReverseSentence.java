package com.micro.StringProbms;

import java.util.ArrayList;
import java.util.List;

public class ReverseSentence
{
    public static void main(String[] args)
    {
        String str = "I love India";
        String temp ="";
        List<String> list =new ArrayList<>();

        for (int i = 0; i <str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                list.add(temp);
                temp ="";
            }
            else
            {
                temp =temp+str.charAt(i);
            }

        }

        list.add(temp);

        for (int i = list.size()-1; i > 0 ; i--)
        {
            System.out.print(list.get(i));
            System.out.print(" ");
        }

    }
}
