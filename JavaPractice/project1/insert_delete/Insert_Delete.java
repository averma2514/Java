package insert_delete;

import java.util.LinkedList;
import java.util.Scanner;

class Insert {

    LinkedList<Integer> insert(LinkedList<Integer> list, int number, int position) {

        list.add(position, number);
        return list;
    }

}

class Delete {
    LinkedList<Integer> delete(LinkedList<Integer> list, int number) {

        if (list.contains(number)) {
            int index = list.indexOf(number);
            list.remove(index);
        } else {
            System.out.println("number not present in list");
        }
        return list;
    }
}

public class Insert_Delete {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Enter size of list : ");

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        System.out.println("Enter elements in list");
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("Enter  number of queries");
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            System.out.println("press 1 for insert");
            System.out.println("press 2 for delete");

            int queries = scanner.nextInt();
            if (queries > 0 && queries < 3) {
                if (queries == 1) {
                    System.out.print("Enter number to insert : ");
                    int number = scanner.nextInt();

                    System.out.print("Enter position delete : ");
                    int position = scanner.nextInt();

                    Insert in = new Insert();
                    in.insert(list, number, position);

                    System.out.println(list + " After insertion\n");

                }

                if (queries == 2) {
                    System.out.print("Enter number to delete : ");
                    int number = scanner.nextInt();

                    Delete dl = new Delete();

                    dl.delete(list, number);

                    System.out.println(list + " After deletion\n");

                }

            }else{System.out.println("------Invalid option------\n");}

        }
        scanner.close();
    }
}
