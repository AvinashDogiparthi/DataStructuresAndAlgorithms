package I_BackTracking.G_UniquePaths_62;

class RecursiveSolution_TLE {
    public int uniquePaths(int m, int n) {
        return count(m,n);
    }

    public int count(int r, int c){

        if(r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1,c);
        int right = count(r,c-1);

        return left + right;
    }
}