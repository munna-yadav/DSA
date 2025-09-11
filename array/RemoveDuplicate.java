import java.util.*;

class RemoveDuplicate{
    public static void main(String []args){
        int []arr = {1,3,2,3,5,2};

        Set<Integer> set = new HashSet<>();

        for(int e: arr){
            set.add(e);
        }

        int k = set.size();

        int j = 0;

       for(int e:set){
        arr[j++] = e;
       }

       for(int i = 0 ; i < k; i++){
        System.out.print(arr[i]+" \t");
       }

       int []newArray = new int[k];
       int i = 0;


       // inserting and traversing using iterator
       System.out.println();
       Iterator<Integer> iterator = set.iterator();
       while(iterator.hasNext()){
        newArray[i] = iterator.next();
        i++;
       }
       for(int e:newArray){
        System.out.println(e);
       }

    }
}