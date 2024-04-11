package org.example;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        int[] height ={4,4,4,7,1,0};
        int a = trap(height);
        System.out.println( "Hello World!"+a);
    }

    public static int trap(int[] heights) {
        int[] a = new int[heights.length];
        int max = 0;
        for(int j =1;j< heights.length;j++){
            int i=0;
            int k=0;
            while(i<heights.length){
                for(i=0;k<j;k++){
                    if(heights[k]> a[0]){
                        a[0] = heights[k];
                        a[1] = k;
                    }
                }
                i++;
            }

        }

        return 0;
    }
}

