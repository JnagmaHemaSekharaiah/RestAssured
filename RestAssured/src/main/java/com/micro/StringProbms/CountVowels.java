package com.micro.StringProbms;

public class CountVowels
{

    public static void main(String[] args)
    {
    String str = "Java World";

    int vowels=0;
    char ch =' ';

        for (int i = 0; i < str.length(); i++)
        {
        if(str.charAt(i)=='a' || str.charAt(i) =='e'|| str.charAt(i) =='i'||
                str.charAt(i) =='o'||str.charAt(i) =='u')
        {
            vowels++;
        }

        }

        System.out.println(vowels);
    }
}
