public class LinkedListCycle {
 private static class ListNode {
     int val;
     ListNode next;

     ListNode(int x) {
         val = x;
         next = null;
     }
 }
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}