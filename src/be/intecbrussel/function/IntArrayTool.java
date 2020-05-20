package be.intecbrussel.function;

public class IntArrayTool {


//This method is to sort the integer Array from smaller to bigger and revers
    // according to the user command  in parameter howToSort:
    // from smaller to bigger type : sbt
    // from bigger to smaller type : bts

    public  int[] sort( int[] array, String howToSort ) {

        int[] array1;
        array1 = array;
        int indexNow = 0;
        int max = array1[indexNow];
        int index = 0;
        int i = 0;
        int tempIndex = 0;
        int arrayElement=0;

// This method is to sort the array from bigger to smaller and revers

        for (int v = 0; v < array1.length; v++) {
            for (int k = i; k < array1.length; k++) {
                arrayElement = array1[indexNow];  // this the element start to compare
                for (int j = indexNow; j < array1.length; j++) {
                    if( howToSort.equalsIgnoreCase("stb")) {
                        if (array1[j] < arrayElement) { // check if the element in [i] smaller then the current element
                            arrayElement = array1[j];  //  if its smaller then its now on arrayElement
                        }
                    }
                    if( howToSort.equalsIgnoreCase("bts")) {
                        if (array1[j] > arrayElement) {
                            arrayElement = array1[j];
                        }
                    }

                    // this For-Loop is to get the highest number of the smallest number and
                    // put it in varaible ( arrayElement)
                }
                if (array1[k] == arrayElement) {  //  here we have to check if the highest or smallest element is the
                    max = array1[k];                //  the same as in array element..
                    index = k;                      // if its correct ..we put the k number on index
                    break;
                }
            }

            i++;    // this is important to let the loop start from  the next element as new start the same as level as checking
            // loop for the highest and smallest number
            indexNow++; //  this is also important to let the loop start from the next element as new start of checking
            // of the highest of smallest number

            // System.out.println(" max is " + max);
            //System.out.println("array after move old number index   " + array1[tempIndex]);
            array1[index] = array1[tempIndex];
            // array after move to forward index  array1[index]
            array1[tempIndex] = max;
            // Array after move to backward index  array1[tempIndex]
            tempIndex++;

        }


        return array;

    }


}
