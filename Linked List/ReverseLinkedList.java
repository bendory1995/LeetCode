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


    //O(n)Time with O(n) Space because it's not Inplace
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

    //we can do better by not creating new listnode
    public static ListNode reverseList2(ListNode head){
        ListNode prev = null;

        while(head != null){
            ListNode node = head.next;
            head.next = prev;
            prev = head;
            head = node;
        }
        return prev;
    }

    //Recursive Solution 
    public static ListNode reverseList3(ListNode head){
        return recurse(head, null);
    }
    public static ListNode recurse(ListNode head, ListNode newHead){
        if(head == null) return newHead;
        
        ListNode nextNode = head.next;
        head.next = newHead;
        newHead = head;
        head = nextNode;
        
        return recurse(head, newHead);
    }
}