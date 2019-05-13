package LinkedLists.Common;

/**
 * Given two headers, header1, header2,
 * print the common part of two ordered linked lists
 */
public class CommonPart {

    public void printCommonPart(Node header1, Node header2) {

        while (header1 != null && header2 != null) {

            if (header1.getData() < header2.getData()) {

                header1 = header1.getNext();
            } else if (header1.getData() > header2.getData()) {

                header2 = header2.getNext();
            } else {

                System.out.println(header1.getData());
                header1 = header1.getNext();
                header2 = header2.getNext();
            }
        }
        System.out.println();
    }
}
