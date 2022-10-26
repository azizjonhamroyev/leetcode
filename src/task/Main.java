package task;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = null;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int i;
//        while (i = fileInputStream.read() != -1) {
//            if (Character.isDigit((char) i)) {
//                list.add(i);
//            } else if ((char) i == '\n') {
//                map.put(list.remove(list.size() - 1), list);
//                list = new ArrayList<>();
//            }
//        }
        int[] arr = new int[16];

        for (int j = 0; j < arr.length; j++) arr[j] = scanner.nextInt();

        Map<Integer, ArrayList<Integer>> compare = new HashMap<>();

        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            int count = 0;
            ArrayList<Integer> values = entry.getValue();
            for (int k = 0; k < values.size(); k++) if (values.get(k) == arr[k]) count++;
            ArrayList<Integer> arrayList = compare.getOrDefault(entry.getKey(), new ArrayList<>());
            arrayList.add(count);
            compare.put(entry.getKey(), arrayList);
        }

        System.out.println("Result: " + getResult(map));

    }

    private static int getResult(Map<Integer, ArrayList<Integer>> map) {
        return 0;
    }
}
