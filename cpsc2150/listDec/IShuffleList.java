package cpsc2150.listDec.cpsc2150.listDec;

import java.util.List;
import java.util.Random;

public interface IShuffleList<T> extends List<T> {
    /**
     *Randomly picks two positions in the list and swaps them
     * Repeats this swaps times
     * @param swaps
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
     * @param i
     * @param j
     */
    default void swap(int i, int j) {}
}
