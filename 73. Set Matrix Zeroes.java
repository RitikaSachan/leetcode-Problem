class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet <Integer> zerorow=new HashSet<>();
        HashSet <Integer> zerocol=new HashSet<>();
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    zerorow.add(i);
                    zerocol.add(j);
                }
            }
        }
        // for rows
        for(int i:zerorow){
            for(int j=0;j<col;j++){
                matrix[i][j]=0;
            }
        }
        // for cols
        for(int i:zerocol){
            for(int j=0;j<row;j++){
                matrix[j][i]=0;
            }
        }

    }
}
