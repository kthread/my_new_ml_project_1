import java.util.*;

// Given a singly linked list, remove the nth node from the end of the list and return its head.

public class RemoveNthNode {

	  public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {
	    LinkedListNode right = head;
	    LinkedListNode left = head;

	    for (int i = 0; i < n; i++) {
	      right = right.next;
	    }

	    if (right == null) {
	      return head.next;
	    }

	    while (right.next != null) {
	      right = right.next;
	      left = left.next;
	    }

	    left.next = left.next.next;

	    return head;
	  }

}
