class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> generate(int numRows) {
        List<Integer> previousRow = new ArrayList<>();
        
        calculatePascalTriangle(numRows, 1, previousRow);
        
        return result;
    }
    
    private void calculatePascalTriangle(int totalRows, int rowNum, List<Integer> previousRow) {
        
        List<Integer> currentRow = new ArrayList<>();
        
        if(rowNum == 1) {
            currentRow.add(1);
        }
        else if(rowNum == 2) {
            currentRow.add(1);
            currentRow.add(1);
        }
        else {
            for(int i = 0; i < previousRow.size(); i++) {
                if(i == 0) {
                    currentRow.add(1);
                    currentRow.add(previousRow.get(i + 1) + 1);
                }
                else if(i == previousRow.size() - 1) {
                    currentRow.add(1);
                }
                else {
                    currentRow.add(previousRow.get(i) + previousRow.get(i + 1));
                }
            }
        }
        result.add(currentRow);
        rowNum ++;
        if(rowNum <= totalRows)
            calculatePascalTriangle(totalRows, rowNum, currentRow);
        
    }
}