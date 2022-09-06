public class Main
{
    public static void main(String[] args) {

        Node node1 = new Node("hej");
        Node node2 = new Node("med");
        Node node3 = new Node("dig");

        node1.next = node2;
        node2.next = node3;

        node3.previous = node2;
        node2.previous = node1;

        Node n = node1;

        printFromHead(n);


    }

    private static void printFromHead(Node n) {

        while (n != null) {

            System.out.println(n.data);

            n = n.next;
        }
    }
}
