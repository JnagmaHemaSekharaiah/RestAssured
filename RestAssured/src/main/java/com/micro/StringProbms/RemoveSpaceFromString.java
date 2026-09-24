package com.micro.StringProbms;

public class RemoveSpaceFromString
{
    public static void main(String[] args)
    {
        String str = "Java is Powerful";


        for (int i = 0 ; i < str.length() ; i++)
        {
            if (str.charAt(i)==' ')
            {
                continue;
            }
            System.out.print(str.charAt(i));

        }


    }

}
