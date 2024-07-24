import java.util.ArrayDeque;
import java.util.LinkedList;

/**
* Solve Josephus problem using different data structures
 * and different algorithms and compare running times.
 *
 * @author Dhanush Venkataramu
 *
 * I would use playWithLLAt out of
 * three methods (playWithAD, playWithLL, and playWithLLAt.
 * Because it has the least runtime ~2800ms, I would be able to
 * decide my position the fastest and get to that position before game starts.
 */
public class Josephus {

    /**
     * Uses ArrayDeque class as Queue/Deque to find the survivor's position.
     *
     * @param size Number of people in the circle that is bigger than 0
     * @param rotation Elimination order in the circle. The value has to be greater than 0
     * @return The position value of the survivor
     */
    public int playWithAD(int size, int rotation) {

        validate(size, rotation);
        ArrayDeque<String> myArray = new ArrayDeque<String>();

        for (int i = 1; i <= size; i++) {
            myArray.addLast(String.valueOf(i));
        }

        while (myArray.size() != 1) {
        int count = (rotation - 1) % myArray.size();
            while (count != 0) {
                myArray.addLast(myArray.removeFirst());
                count--;
            }
            myArray.removeFirst();
        }

        return Integer.valueOf(myArray.peek());
    }

    /**
     * Uses LinkedList class as Queue/Deque to find the survivor's position.
     *
     * @param size Number of people in the circle that is bigger than 0
     * @param rotation Elimination order in the circle. The value has to be greater than 0
     * @return The position value of the survivor
     */
    public int playWithLL(int size, int rotation) {

       validate(size, rotation);
       LinkedList<String> myList = new LinkedList<String>();

       for (int i = 1; i <= size; i++) {
            myList.addLast(String.valueOf(i));
       }

       while (myList.size() != 1) {
           int count = (rotation - 1) % myList.size();
           while (count != 0) {
               myList.addLast(myList.removeFirst());
               count--;
           }
           myList.removeFirst();
       }

       return Integer.valueOf(myList.peek());
    }

    /**
     * Uses LinkedList class to find the survivor's position.
     * 
     * @param size Number of people in the circle that is bigger than 0
     * @param rotation Elimination order in the circle. The value has to be greater than 0
     * @return The position value of the survivor
     */
    public int playWithLLAt(int size, int rotation) {

        validate(size, rotation);
        LinkedList<String> myList = new LinkedList<String>();

        for (int i = 1; i <= size; i++) {
            myList.addLast(String.valueOf(i));
        }

        int cursor = 0;
        while (myList.size() != 1) {
            cursor = (cursor + rotation - 1) % myList.size();
            myList.remove(cursor);
        }
        return Integer.valueOf(myList.peek());
    }
    /**
     * Private helper method to validate the size and rotation.
     * 
     * @param size specifies the size; number of people.
     * @param rotation specifies the rotation value for the game
     */
    private void validate(int size, int rotation) {
        if (size <= 0) {
            throw new RuntimeException("Illegal Size");
        }
        if (rotation <= 0) {
            throw new RuntimeException("Illegal rotation");
        }
    }

}
