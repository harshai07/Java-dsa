package linkedLIst;

import org.w3c.dom.Node;
import java.util.*;
public class reveseList {
    public Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextNode = curr.next;  // store next
            curr.next = prev;           // reverse link
            prev = curr;                // move prev
            curr = nextNode;            // move curr
        }

        return prev;  // new head
    }
}
