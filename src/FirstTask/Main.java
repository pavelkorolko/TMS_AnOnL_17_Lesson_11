package FirstTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Сделал коллекцию основную CustomList. AuxList реализует Iterable для блока foreach.
        //Сперва в первом блоке работа над CustomList была.
        //Во втором блоке тоже самое, только вывод через foreach.

        //without Iterable interface(loop fori)
//        try {
//            CustomList<Integer> elements = new CustomList<>();
//
//            elements.add(10);
//            elements.add(19);
//            elements.add(20);
//
//            for (int i = 0; i < elements.length(); i++) {
//                System.out.print(elements.getByIndex(i) + " ");
//            }
//            //--------------------------------------------------
//            elements.remove(19);
//            //elements.remove(21);
//            System.out.println("\n----------------------------");
//            for (int i = 0; i < elements.length(); i++) {
//                System.out.print(elements.getByIndex(i) + " ");
//            }
//            //--------------------------------------------------
//            elements.clear();
//            for (int i = 0; i < elements.length(); i++) {
//                System.out.print(elements.getByIndex(i) + " ");
//            }
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        //with Iterable interface(foreach loop)
        try {
            AuxList<Integer> elements = new AuxList<>();

            elements.add(10);
            elements.add(19);
            elements.add(20);

            boolean exists = elements.isExists(20);
            String output = "";

            if (exists) {
                output = "exists";
            } else {
                output = "does not exist";
            }
            System.out.println("Element 20 " + output);

            for (Integer element :
                    elements) {
                System.out.print(element + " ");
            }
            //--------------------------------------------------
            elements.remove(19);
            //elements.remove(21);
            System.out.println("\n----------------------------");
            for (int i = 0; i < elements.length(); i++) {
                System.out.print(elements.getByIndex(i) + " ");
            }
            //--------------------------------------------------
            elements.clear();
            for (int i = 0; i < elements.length(); i++) {
                System.out.print(elements.getByIndex(i) + " ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}