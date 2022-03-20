
public class RemoveLinkedListElements {
    public static void main(String[] args){

    }
    public static ListNode (ListNode head, int val){
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        
        ListNode curr = head;
        ListNode prev = dummyNode;
        
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummyNode.next;
    }
}
