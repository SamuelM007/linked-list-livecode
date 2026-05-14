public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node('w',null);
        Node othernode = new Node('x', null);
        Node coolNode = new Node('e',null);
        myNode.next = otherNode;
        otherNode.next = coolNode;

        // int numNodes = length(myNode);
        // int numNode = myNode.length();
        // System.out.println(numNode);

        Node newHead = removeAt(myNode,2);
        Node current = newHead;

        // Node current = myNode;

        // while(current != null){
        //     System.out.println(current.value);
        //     current = current.next;
        // }


        // System.out.println(myNode.value);
        // System.out.println(myNode.next.value);
        // System.out.println(myNode.next.next.value);
    }

    public static Node removeAt(Node head, int removeIdx){
        if(removeIdx < 0){
            throw new IllegalArgumentException("index cant be less than 0");
        }
        if(removeIdx == 0) return head.next;

        Node current = head;

        for(int i = 0; i < removeIdx -1; i++){
            if(current == null){
                throw new IndexOutOfBoundsException("index was to large");
            }
            current = current.next;
        }

        current.next = current.next.next;

        return head;
    }

    
}
