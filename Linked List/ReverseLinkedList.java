public class ReverseLinkedList{
    public static void main(String[] args){

    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; 
        }
    }

    public static ListNode reverseList(ListNode head){
        if(head == null) return null;

        ListNode temp = head;
        ListNode ansNode = new ListNode();
        ansNode.val = head.val;
        ansNode.next = null;
    
        while(temp.next != null){
            ListNode node = new ListNode();
            node.val = temp.next.val;
            node.next = ansNode;
            ansNode = node;
            temp = temp.next;
        }
        return ansNode;
    }
}