package Kollekciya;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {

    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();
        set1.add("Oleg");
        set1.add("Tymur");

        System.out.println(set1);

        Set<Sport> set2 = new TreeSet<>();
        set2.add(new Sport("Football", 11));
        set2.add(new Sport("basketball", 5));
        set2.add(new Sport("volleyball", 6));
        System.out.println(set2);

        Sport sport1 = new Sport("Football", 11);
        Sport sport2 = new Sport("basketball", 5);
        System.out.println(sport1.compareTo(sport2));

        PlayersAmountComparator comparator = new PlayersAmountComparator();
        int result = comparator.compare(sport1, sport2);
        System.out.println(result);

        Set<Sport> set3 = new TreeSet<>(new Comparator<Sport>() {
            public int compare(Sport sport1, Sport sport2) {
                if (sport1.playersAmount > sport2.playersAmount) {
                    return 1;
                }
                if (sport2.playersAmount > sport1.playersAmount) {
                    return -1;
                }
                return 0;
            }
        });
        set3.add(new Sport("Football", 11));
        set3.add(new Sport("basketball", 5));
        set3.add(new Sport("volleyball", 6));
        System.out.println(set3);
    }
}

class Sport implements Comparable<Sport> {
    String name;
    int playersAmount;

    Sport(String name, int pa) {
        this.name = name;
        playersAmount = pa;
    }

    public String toString() {
        return "Sport: " + name + " " + playersAmount;
    }

    @Override
    public int compareTo(Sport o) {
        return name.compareTo(o.name);
//        if (playersAmount > o.playersAmount) {
//            return 1;
//        }
//        if (playersAmount < o.playersAmount) {
//            return -1;
//        }
//        return 0;
    }
}

class PlayersAmountComparator implements Comparator<Sport> {

    @Override
    public int compare(Sport sport1, Sport sport2) {
        if (sport1.playersAmount > sport2.playersAmount) {
            return 1;
        }
        if (sport2.playersAmount > sport1.playersAmount) {
            return -1;
        }
        return 0;
    }
}
