public class ReverseLinkedList {
  //Definition for singly-linked list.
  public static class ListNode {
      int val;ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    private ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) return head; // Base case
        System.out.println("head: " + head.val);
        // Recurse down to find the new head, which is the last node in the original list
        ListNode newHead = reverseListRecursive(head.next);

        // This is where the reversal happens: head.next still points to the tail of the reversed list,
        // so setting head.next.next = head effectively moves head to the tail
        head.next.next = head;

        // This prevents a cycle by terminating the list
        head.next = null;

        // Return the new head of the reversed list to the caller
        return newHead;
    }
    public ListNode reverseList(ListNode head) {
        // if(head == null) return null;
        // ListNode prev = null;
        // ListNode curr = null;
        // while(head.next != null) {
        //     curr = head;
        //     head = head.next;
        //     curr.next = prev;
        //     prev = curr;
        // }
        // head.next = curr;
        return reverseListRecursive(head);
    }
}