package cpsc2150.listDec.cpsc2150.listDec;

import java.util.List;

public interface IShuffleList<T> extends List<T> {
    /**
     *Randomly picks two positions in the list and swaps them
     * Repeats this swaps times
     * @param swaps
     */
    default void shuffle(int swaps) {}

    /**
     * Exchanges the values at positions i and j in the list
     * @param i
     * @param j
     */
    default void swap(int i, int j) {}
}
