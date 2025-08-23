package Z_RandomProblems.FruitInBasketII_904;

class Solution {

    public static void main(String[] args) {
        int placedValue = numOfUnplacedFruits(new int[]{4, 2, 7},new int[]{3, 4, 5});
        System.out.println(placedValue);
    }
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {

        int unplaced = 0;

        for(int fruit : fruits){

            boolean placed = false;

            for(int i = 0;i<baskets.length;i++){

                if(baskets[i] >= fruit){
                    baskets[i] = -1;
                    placed = true;
                    break;
                }
            }

            if(!placed){
                unplaced++;
            }
        }

        return unplaced;
    }
}