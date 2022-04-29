class Main
{
    public static int LCSLength(String X, String Y)
    {
        int m = X.length(), n = Y.length();
 
        int[][] T = new int[m + 1][n + 1];
 
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    T[i][j] = T[i - 1][j - 1] + 1;
                }
                else {
                    T[i][j] = Integer.max(T[i - 1][j], T[i][j - 1]);
                }
            }
        }
 
        return T[m][n];
    }
 
    public static void main(String[] args)
    {
        String X = "XMJYAUZ", Y = "MZJAWXU";
 
        System.out.println("The length of the LCS is " + LCSLength(X, Y));
    }
}