/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.model;

import java.math.BigInteger;

/**
 *
 * @author Usuario
 */
public class arbol {

    public arbol() {
    }

    public BigInteger res(int m, int n) {
        System.out.println("n:" + n + "  m:" + m);
        BigInteger[] arr = new BigInteger[n + 1];
        arr[n] = new BigInteger("1");
        int j = n - 1;
        int i = 1;
        while (j >= 0) {
            i = 1;
            arr[j] = new BigInteger("0");
            while (i <= m) {
                if ((j + i) <= n) {
                    arr[j] = arr[j].add(arr[j + i]);
                    //    System.out.println(arr[j+i].toString());
                }
                i++;
            }
            j--;

        }
        return arr[0];
    }

}
