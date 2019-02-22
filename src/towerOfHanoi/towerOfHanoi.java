package towerOfHanoi;

/**
 * Write a recursive function that implements the Tower of Hanoi problem.
 * Draw a control flow graph for this function.
 */
class towerOfHanoi {

    /* Total Numbers of the disk that user decides to play the game */
    private int input;

    /**
     * Constructor
     */
    towerOfHanoi(int inp) {
        input = inp;
    }

    /**
     * Function that will generate the Tower Of Hanoi logic
     * @param input: Total disks that will be used to play the game
     * @param initialRod: The starting position of the disk
     * @param endRod: The ending position that the disk is moved to
     * @param extraRod: temporary position to help move the disk
     */
    void playTowerOfHanoi(int input, char initialRod, char endRod, char extraRod) {
        if (input == 1) {
            System.out.println("Move disk 1 from rod " +  initialRod + " to rod " + endRod);
            return;
        }
        playTowerOfHanoi(input-1, initialRod, extraRod, endRod);
        System.out.println("Move disk " + input + " from rod " +  initialRod + " to rod " + endRod);
        playTowerOfHanoi(input-1, extraRod, endRod, initialRod);
    }

    /**
     * Get/ the input from different class
     * @return the total number disks
     */
    public int getInput() {
        return input;
    }
}
