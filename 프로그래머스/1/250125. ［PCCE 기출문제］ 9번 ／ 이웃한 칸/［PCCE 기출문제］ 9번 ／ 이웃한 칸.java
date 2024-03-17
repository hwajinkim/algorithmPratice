class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        String board_color = board[h][w];
        
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        for(int i=0; i<dh.length; i++){
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            
            if((h_check >= 0 && h_check < n) && 
               (w_check >= 0 && w_check < n)){
                
                System.out.println(board_color+","+board[h_check][w_check]);
                
                if(board_color.equals(board[h_check][w_check])){
                    count++;
                }
            }
        }
        return count;
    }
}