public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public class List{
        Node head;
        public class Node{
            int value;
            Node next;
        }

    public void revert(){
        if (head != null && head.next != null){
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }
    private void revert(Node currentNode, Node previousNode){
        if(currentNode.next == null){
            head = currentNode;
        } else{
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
    }
}}