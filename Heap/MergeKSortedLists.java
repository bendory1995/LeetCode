import java.util.*;
public class MergeKSortedLists{
    public static void main(String[] args){
        
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public static ListNode merge(ListNode[] lists){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(ListNode list: lists){
            while(list != null){
                pq.add(list.val);
                list = list.next;
            }
        }
        
        ListNode dummyNode = new ListNode(0);
        ListNode head = dummyNode;
        
        while(!pq.isEmpty()){
            head.next = new ListNode(pq.remove());
            head = head.next;
        }
        return dummyNode.next;
    }
}