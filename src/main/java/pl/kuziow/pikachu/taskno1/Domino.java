package pl.kuziow.pikachu.taskno1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Domino {


    //this method asks user for domino set and number of iterations

    public void dominoGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provie the domino set: ");
        String domino = sc.nextLine();
        System.out.println("How many iterations you want to check?");
        int iteration = sc.nextInt();

        System.out.println("Your domino set after " + iteration + " looks like this:");
        System.out.println(dominoFall(domino, iteration));
        System.out.println("However, if you would like to reverse your set " + iteration + " times, it would look like that: ");
        System.out.println(dominoBackwards(domino, iteration));


    }

    //this method simulates falling domino, it takes as parameters the initial domino set and number of iteriations to simulate
    public static String dominoFall(String domino, int iteration) {
        List<Character> bricks = domino
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList()); //splitting string to individual characters
        for (int j = 0; j < iteration; j++) { //we need to repeat this operation iteration number of times
            for (int i = 1; i < bricks.size(); i++) { //iterating throught the whole domino
                char nPrev = bricks.get(i - 1);
                char n0 = bricks.get(i);
                //we need to analise two bricks next to each other
                if (nPrev == '/' && n0 == '|') { // in this case'/|' the n0 bric is falling to the right
                    bricks.set(i, '/');
                } else if (nPrev == '|' && n0 == '\\') {  // in this case'|\' the nPrev bric is falling to the left
                    bricks.set(i - 1, '\\');
                }
            }
        }
        return bricks.toString(); //finally we are returning the fallen domino
    }


    //this method simulates setting backwards domino, it takes as parameters the initial domino set
    // and number of iteriations to simulate
    public static String dominoBackwards(String domino, int iteration) {
        List<Character> bricks = domino
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList()); //splitting string to individual characters
        for (int j = 0; j < iteration; j++) { //we need to repeat this operation iteration number of times
            for (int i = 1; i < bricks.size() - 1; i++) { //iterating throught the whole domino
                char nPrev = bricks.get(i - 1);
                char n0 = bricks.get(i);
                char nNext = bricks.get(i + 1);
                //we need to analise two  or three bricks next to each other, there are only three cases in which bricks
                //could be reversed //\\ , //| and |\\

                if (i + 2 < bricks.size()) { // we need to check it first to avoid out of bound exception
                    if (nPrev == '/' && n0 == '/' && nNext == '\\' & bricks.get(i + 2) == '\\') { //first scenario
                        bricks.set(i, '|');
                        bricks.set(i + 1, '|');
                    }
                } //in case of second and third scenario we do not need to worry about this exception
                else if (nPrev == '/' && n0 == '/' && nNext == '|') {
                    //second scenario
                    bricks.set(i, '|');
                } else if (nPrev == '|' && n0 == '\\' && nNext == '\\') {
                    //third scenario
                    bricks.set(i, '|');
                }
            }
        }
        return bricks.toString(); //finally we are returning the reversed domino
    }
}
