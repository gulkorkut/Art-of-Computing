package lab;

import java.io.*;
import java.util.*;

public class Solution {
     
    
    public static void main(String[] args) {
        String name="John";
        String surname= "King";
        float y=20.0f;
        float p=1.0f;
        double cyc=(3.14*3*3*4);
        
        System.out.println("Name and surname = "+ name + " "+surname);
        System.out.println("y = " +y);
        y=y+1;
        System.out.println("y++ = " +(y));
        y=y-1;
        System.out.println("y-- = " +(y));
        y=y/5;
        System.out.println("y/=5 = " +(y));
        y-=7;
        System.out.println("y-=7 = " +(y));
        p=(5 * 3 - ( 12-2 ) % 3 * 4 + 16 / 4 );
        System.out.println("5 * 3 - ( 12-2 ) % 3 * 4 + 16 / 4 = "+ p);
        
         System.out.println("Volume of cylinder: "+ cyc);
        
        
        
        
    }
}