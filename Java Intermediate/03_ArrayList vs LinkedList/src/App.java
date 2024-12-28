import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
/*
 * [12] [32] [21] [54] [67] [99] [77] ArrayList
 *  0    1	   2    3    4    5    6
 * 
 * [12]-> [32] ->[21] ->[88] ->[54]-> [67]-> [99] ->[77] LinkedList
 *     <-       <-    <-     <-    <-     <-     ->
 */

public class App {
	public static void main(String[] args) {
		List<Integer> arrayList=new ArrayList<>();
		List<Integer> linkedList=new LinkedList<>();
		testList("ArrayList",arrayList);
		testList("LinkedList",linkedList);
		
	}
	public static void testList(String name,List<Integer>list){
		for(int i=0;i<100000;i++){
			list.add(i);
		}
		long start=System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			list.add(i);
		}
		long end=System.currentTimeMillis();
		
		System.out.println("Time taken"+(end-start)+"ms");
		
		
	}
}
