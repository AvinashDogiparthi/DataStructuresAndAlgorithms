package A_Two_Pointers_Pattern.L_HappyNumber;

public class UsingSlowAndFastPointers {

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        } while(slow != fast);

        if(slow == 1){
            return true;
        } else {
            return false;
        }
    }

    public int square(int n){

        int sum = 0;

        while(n != 0){
            int remainder = n % 10;
            sum += remainder * remainder;
            n = n / 10;
        }

        return sum;
    }
}
