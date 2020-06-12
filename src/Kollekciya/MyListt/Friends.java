package Kollekciya.MyListt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Friends {
    private String name;
    private int age;

    Friends(String n, int a){
        name = n;
        age = a;
    }
    @Override
    public String toString() {
        return "Imya: " + name + " age: " + age;
    }

    public static void main(String[] args) {
        List<Friends> friendsMyList = new ArrayList<Friends>();
        List<Friends> newFriend = new ArrayList<>();
        Friends oleh = new Friends("Oleh", 23);
        Friends tika = new Friends("Tymur", 14);
        Friends narket = new Friends("Stasik", 88);
        friendsMyList.add(0, oleh);
        friendsMyList.add(1,tika);
        friendsMyList.add(2,narket);
        friendsMyList.get(0);
        System.out.println(friendsMyList.iterator().next());
        System.out.println(friendsMyList.iterator().next());
        System.out.println(friendsMyList.iterator().next());
        System.out.println(friendsMyList.iterator().hasNext());
        System.out.println(friendsMyList.iterator().hasNext());
        System.out.println(friendsMyList.iterator().next());
        Iterator<Friends> fr = friendsMyList.iterator();
        newFriend.add(0,oleh);
        newFriend.add(1,narket);
        System.out.println();
        System.out.println(friendsMyList.containsAll(newFriend));

//        Friends theOleh = new Friends("Olezha", 23);
//        System.out.println(friendsMyList);
//
//        friendsMyList.set(0,theOleh);
//
//        System.out.println(friendsMyList.get(0));
//        System.out.println(friendsMyList.size());
//        friendsMyList.remove(2);
//
//        System.out.println(friendsMyList.size());
//        System.out.println(friendsMyList.isEmpty());
//        System.out.println(friendsMyList);
//
//        Friends timurishe = new Friends("Timurishe", 23);
//        System.out.println(friendsMyList.get(1));
//        System.out.println(friendsMyList.set(1,timurishe));
//        System.out.println(friendsMyList.get(1));
//        Friends kek = new Friends("Sultan", 25);
//        friendsMyList.add(2,kek);
//        System.out.println(friendsMyList.get(5));


    }
}
