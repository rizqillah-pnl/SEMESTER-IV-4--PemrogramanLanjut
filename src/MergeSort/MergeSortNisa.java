package MergeSort;

public class MergeSortNisa {
    static void mergeSort(int array[], int startIdx, int endIdx) {
        if(startIdx == endIdx) { //endIdx
            return;
        }
        int length = endIdx - startIdx + 1;
        int mid = (startIdx + endIdx)/2; //(startIdx + endIdx)/2
        mergeSort(array, startIdx, mid); //startIdx
        mergeSort(array, mid + 1, endIdx); //mid
        int working[] = new int[length];
        for(int i = 0; i < length; i++) {
            working[i] = array[startIdx+i];
        }
        int m1 = 0;
        int m2 = mid-startIdx+1;
        for(int i = 0; i < length; i++) {
            if(m2 <= endIdx-startIdx) {
                if(m1 <= mid-startIdx) {
                    if(working[m1] > working[m2]) {
                    array[i+startIdx] = working[m2++];
                    } else {
                        array[i+startIdx] = working[m1++]; //working[m1++]
                    }
                } else {
                array[i+startIdx] = working[m2++]; //working[m2++]
                }
            } else {
                array[i+startIdx] = working[m1++]; //array[i+startIdx]
            }
        }
    }

    public static void main(String args[]) {
        int numArr[] = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numArr[i] = Integer.parseInt(args[i]);
        }
        mergeSort(numArr, 0, numArr.length - 1);
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
    }
}