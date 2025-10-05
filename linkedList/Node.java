class Node {
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }

    public static Node CreateList(int[] arr)
    {

        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static void traverseLL(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static int countLL(Node head){
        Node temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 3, 4, 4, 5 };

        Node head = CreateList(arr);

        traverseLL(head);

        int count = countLL(head);
        System.out.println("\nNo of nodes: "+ count);
    }
}
