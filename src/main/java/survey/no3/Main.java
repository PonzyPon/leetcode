package survey.no3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    static int friendPosition = 0;
    static Map<Integer, List<Integer>> bridges = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int islandCount = sc.nextInt();
        int takahashiPosition = sc.nextInt();
        friendPosition = sc.nextInt();
        String line = sc.nextLine(); // ここがnullになってしまって進まない...
        List<Integer> mangoTypes = new ArrayList<>(Arrays.asList(line.split(" "))).stream()
                .map(Integer::valueOf).collect(Collectors.toList());

        // create bridge data
        for (int i = 0; i < islandCount - 1; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            if (!bridges.containsKey(from)) {
                bridges.put(from, new ArrayList<>(islandCount - 1));
            }
            if (!bridges.containsKey(to)) {
                bridges.put(to, new ArrayList<>(islandCount - 1));
            }
            bridges.get(from).add(to);
            bridges.get(to).add(from);
        }

        List<Integer> route = getRoute(-1, takahashiPosition);

        Map<Integer, Integer> mangoCount = new HashMap<>();

        // count got mango
        for (int islandNum : route) {
            int mangoType = mangoTypes.get(islandNum - 1);
            if (!mangoCount.containsKey(mangoType)) {
                mangoCount.put(mangoType, 0);
            }
            mangoCount.put(mangoType, mangoCount.get(mangoType) + 1);
        }

        int maxCountMangoType = 0;
        int maxMangoCount = 0;
        for (Map.Entry<Integer, Integer> entry : mangoCount.entrySet()) {
            if (entry.getValue() > maxMangoCount) {
                maxCountMangoType = entry.getKey();
            }
        }
        System.out.println(maxCountMangoType);
    }

    /**
     * 
     * @param fromPosition    -1 should be given on initial state
     * @param currentPosition
     * @return
     */
    private static List<Integer> getRoute(int fromPosition, int toPosition) {
        // 友達を見つけた
        if (toPosition == friendPosition) {
            List<Integer> route = new ArrayList<>();
            route.add(toPosition);
            return route;
        }
        // 行き止まり
        List<Integer> destinations = bridges.get(toPosition);
        if (destinations.size() == 1 && fromPosition != -1) {
            return new ArrayList<>();
        }
        // 道は続く
        for (int destination : destinations) {
            if (fromPosition != destination) {
                List<Integer> route = getRoute(toPosition, destination);
                if (route.size() != 0) {
                    route.add(toPosition);
                    return route;
                }
            }
        }
        return new ArrayList<>();
    }

}
