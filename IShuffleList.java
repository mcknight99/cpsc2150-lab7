//Sam Pupke
//Armando Sallas
//Steven Spivack
package cpsc2150.listDec;

import java.util.List;
import java.util.Random;

/**
 * A generic shuffle interface which extends the List interface. A shuffle is a random permutation of the elements 
 * in a list with two main operations:
 * suffle, which randomly picks two positions in the list and swaps them, and swap, which exchanges the values
 * at two positions in a list. 
 * The positions are chosen at randomly for a set number of times defined by a user.
 * 
 * @defines self: the list to be shuffled
 * 
 * @constraints swaps > 0 AND i >= 0 AND j >= 0 AND i!= j AND myList != null
 * 
 * @initialization_ensures the list provided is not null and swaps indexes i and j are swapped swaps times
 */
public interface IShuffleList<T> extends List<T> {
    /**
     *Randomly picks two positions in the list and swaps them
     * Repeats this swaps times
     * 
     * @param swaps the number of times to swap
     * 
     * @pre myList != null && swaps > 0
     * 
     * @post myList = [myList contains same values but myList[rand1] and myList[rand2] are 
     *             changed swaps times]
     */
    default void shuffle(int swaps) {
        Random rand = new Random();
        for (int i = 0; i < swaps; i++) {
            int rand1 = rand.nextInt(size());
            int rand2 = rand.nextInt(size());
            swap(rand1, rand2);
        }
    }

    /**
     * Exchanges the values at positions i and j in the list
     * 
     * @param i index of one of the positions to swap
     *
     * @param j index of the other position to swap
     *
     * @pre myList[i] != null AND myList[j] != null
     *
     * @post myList[i] = [value that was at j] AND myList[j] = [value that was at i]
     */
    default void swap(int i, int j) {
        T n = set(i, get(j));
        T m = set(j, n);
    }
}
