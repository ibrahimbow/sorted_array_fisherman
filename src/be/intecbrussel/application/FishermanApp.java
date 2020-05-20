package be.intecbrussel.application;

import be.intecbrussel.function.IntArrayTool;

public class FishermanApp {

    public static void main(String[] args) {
        System.out.println("\n\n");
        int[] myArray = { 4,45,5,6,1,2,3,99,54,78,20,12,36,7,10,89,9,21,11,16};
        System.out.println("The old unsorted Array is:");
        for (int k :myArray) {
            System.out.format("%d,",k);
        }
        System.out.println("\n");
        System.out.println("The new sorted Array is:");
        IntArrayTool sort = new IntArrayTool();
        // from smaller to bigger type : sbt
        // from bigger to smaller type : bts
        sort.sort(myArray,"stb");
        for (int k :myArray) {
            System.out.print(k +",");
        }
    }
}

