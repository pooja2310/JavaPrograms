package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_SortedWithZeroFirst {
	public static void main(String[] args) {
	   //Input-	{0,0,0,9,7,4,4,3,1,1}
		int arr[]={0, 1, 4, 9, 0, 3, 4, 1, 0, 7};
		
		List<Integer> zeroList= new ArrayList<>();
		List<Integer> nonZeroList= new ArrayList<>();
		
		for(int num: arr){
			if(num==0)
			{
				zeroList.add(num);
			}else
				nonZeroList.add(num);
		}
		System.out.println(zeroList);
		System.out.println(nonZeroList);
		nonZeroList.sort(Collections.reverseOrder());
		System.out.println(nonZeroList);
		List<Integer> list = new ArrayList<>();
		list.addAll(zeroList);
		list.addAll(nonZeroList);
		System.out.println(list);
		//Output: [0, 0, 0, 9, 7, 4, 4, 3, 1, 1]
	}
}
