package org.nisanth.patterns;
import java.util.*;
import java.lang.*;

import static java.lang.Math.log10;

public class CountOfDigitsOpti {
    public static void main(String[] args)
    {
        int N=77897650;
        int count=(int)(log10(N)+1);
        System.out.println(count);
    }
}
