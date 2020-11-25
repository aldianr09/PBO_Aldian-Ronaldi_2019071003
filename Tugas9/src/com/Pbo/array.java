package com.Pbo;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,z = 0;
        int cari;
        int[] b;
        boolean found = false;

        System.out.print("Apakah ingin mencari data?");
        System.out.print("silakan masukan data : ");
        a  = s.nextInt();
        b = new int[a];

        for(int index =0; index <a; index++)
        {
            System.out.print("Input angka ke-"+ (index+1) + ": ");
            b[index] = s.nextInt();
        }

        System.out.print("Input data yang dicari: ");
        cari = s.nextInt();

        for(int index=0; index<a; index++)
        {
            if(b[index] == cari)
            {
                found = true;
                z=index+1;
                System.out.println("Data yang anda cari ditemukan di Index ke :"+ z);
            }
        }

        if(found == false)
        {
            System.out.println("Data yang ada cari tidak ditemukan");
        }
    }

}
