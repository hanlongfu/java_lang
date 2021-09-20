public class FlourPack {
    //bigCount + smallCount >= goal
    //only full bags are allowed
    //if both negative, return false
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean status = false;
        int totalWeight = (bigCount * 5) + smallCount;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            status = false;
        } else if (totalWeight < goal) {
            status = false;
        } else if (smallCount >= goal) {
            status = true;
        } else if (goal >= 5 && goal % 5 == 0 && goal <= bigCount * 5) {
            status = true;
        } else if ((goal - (bigCount * 5)) <= smallCount && (goal - (bigCount * 5)) > 0) {
            status = true;
        } else if ((goal / 5) <= bigCount && (goal % 5) <= smallCount) {
            status = true;
        }
        return status;
    }
}
