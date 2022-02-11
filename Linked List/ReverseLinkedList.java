public class ReverseLinkedList{
    public static void main(String[] args){

    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseList(ListNode head){
        if(head == null) return null;
        ListNode node = new ListNode();
        node.val = head.val;
        node.next = null;
    while(head.next != null){
        ListNode reverseNode = new ListNode();
        reverseNode.val = head.next.val;
        reverseNode.next = node;
        node = reverseNode;
        head = head.next;
    }
    return node;
    }
}