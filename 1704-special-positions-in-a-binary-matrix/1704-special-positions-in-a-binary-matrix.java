class Solution {
    public int numSpecial(int[][] mat) {
      int row = mat.length;
      int col= mat[0].length;
      int [] rowcount = new int[row];
      int [] colcount = new int[col];
      for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            if(mat[i][j]==1){
                rowcount[i]++;
                colcount[j]++;
            }
        }
      }
    int count=0;
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            if(mat[i][j]==1&& rowcount[i]==1 && colcount[j]==1){
                count++;
            }

        }
        }

return count;
    }
        
    }
