public class LinkedListCycle {

    public static void main(String[] args){

    }
    public static boolean hasCycle(ListNode head){
        if(head == null) return false;
        
        ListNode slowNode = head;
        ListNode fastNode = head.next;

        while(slowNode != fastNode){
            //if fast node reaches end, then there is no cycle
            if(fastNode == null || fastNode.next == null) return false;

            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

        }
        return true;
    }

    public static class ListNode{
        int val; 
        ListNode next;
        ListNode(int x){
            this.val = x;
            next = null;
        }
    }
}
