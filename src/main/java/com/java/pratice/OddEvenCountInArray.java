package com.java.pratice;

public class OddEvenCountInArray {
    public static void main(String[] args) {
        int[] pavan={4,5,2,6,7,33,45,32,45,89,102,117,8,10,11,18};
        int evenCount=0,oddCount=0,evenSum=0,oddSum=0;
        for (int i=0;i<pavan.length;i++){
            if (pavan[i]%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
        System.out.println();
        for (int i=0;i<pavan.length;i++){
            if (pavan[i]%2==0){
                evenSum=evenSum+pavan[i];
            }
            else {
                oddSum=oddSum+pavan[i];
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);

        for (int i=0;i<pavan.length;i++){
            for (int j=i+1;j<pavan.length;j++){
                int temp=0;
                if (pavan[i]>pavan[j]){
                    temp=pavan[i];
                    pavan[i]=pavan[j];
                    pavan[j]=temp;
                }
            }
            System.out.print(" "+pavan[i]);
        }
    }
}
