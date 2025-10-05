import java.util.*;

class RemoveDuplicate{
    static void solution(int []arr){
        Set<Integer> set = new HashSet<>();

        for(int ele:arr){
            set.add(ele);
        }
        int k = set.size();
        int j = 0;


        for(int e:set){
            arr[j++] = e;
        }

        for(int i = 0; i < k; i ++){
            System.out.print(arr[i] +"\t");
        }
    }
    public static void main(String []args){
        int []arr = {1,3,2,3,5,2};
        solution(arr);

    //     Set<Integer> set = new HashSet<>();

    //     for(int e: arr){
    //         set.add(e);
    //     }

    //    Iterator<Integer> iterator = set.iterator();
    //    while (iterator.hasNext()) {
    //     System.out.println(iterator.next());
    //    }

    }
}