package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            int x = array[i];
            arrayList.add(x);
        }
        int count = 0; int ccc = 0;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size(); i++){
            //System.out.println(arrayList.toString());
            for (int j = 0; j < arrayList.size(); j++){
                if(arrayList.get(i) == arrayList.get(j)){
                    count++;
                    ar.add(j);
                }
            }
            if(count >= 3){
                for(int k = 0; k < ar.size(); k++){
                    arrayList.set(ar.get(k), null);
                    ccc++;
                }
                for(int k = 0; k < arrayList.size(); k++){
                    if(arrayList.get(k) == null){
                        arrayList.remove(k);
                    }
                }
            }
            count = 0;
            ar.clear();
        }
        //System.out.println(arrayList.toString());
        System.out.println(ccc);
    }
}
