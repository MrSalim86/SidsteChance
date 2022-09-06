public class Liste {

    Node head = null;
    Node tail = null;


    String printFromHead(Node n) {

        StringBuilder stringBuilder = new StringBuilder();

        while (n != null) {

            stringBuilder.append(n.data + " ");



            n = n.next;
        }

        return stringBuilder.toString().trim();
    }
}
