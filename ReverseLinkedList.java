public class ReverseLinkedList {

    static class Node {

        int val;
        Node next;
        Node(int x) {
            val = x;
            next = null;
        }

    }

    static Node head = null;

    public static void main(String[] args) {
//      reverseList();
    }

    private static Node reverseList(Node node) {

        Node prev = null;
        Node curr = node;

        while (curr != null)
        {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }

        return prev;
    }
    
     public static void prettyPrint(ListNode node)
    {
        while (node != null)
        {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print("->");
            }
            node = node.next;
        }
    }

}
