public class RemoveDuplicatesSortedList {
    public static void main(String[] args){

    }

    public static ListNode deleteDuplicates(ListNode head){
        if(head == null) return head;
        
        ListNode dummyNode = new ListNode(-999);
        dummyNode.next = head;
        
        ListNode prev = dummyNode;
        ListNode curr = head;
        
        while(curr != null){
            if(prev.val == curr.val){
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummyNode.next;
    }
}
