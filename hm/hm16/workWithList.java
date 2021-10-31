package hm.hm16;

import java.util.ArrayList;
import java.util.List;

class workWithList {

    static List<String> addToList() {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Tan");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Red");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Blue");
        return colors;
    }

    static void deleteItemsInList(List<String> a, String b) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).contains(b)) {
                a.remove(a.get(i));
                i--;
            }
        }
    }

    static List<Integer> createIntList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            list.add(i);
        }
        return list;
    }

    static void deleteEvenElements(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
                i--;
            }
        }
    }
}
