/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCM;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class Counter implements Serializable{
    private static int n=1;

    public static int getN() {
        return n++;
    }

    public static void setN(int n) {
        Counter.n = n;
    }
    
    
}
