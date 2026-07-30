class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh  = 0;
        int min= 0;

        for(int i = 0; i< row ; i++){
            for(int j = 0 ; j<col ;j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i , j});
                }else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
            if(fresh == 0) return 0;
            int[][] direction = {{-1,0}, {1,0}, {0,-1}, {0,1}};
            while(!queue.isEmpty() && fresh > 0){
                int size = queue.size();
                for(int i = 0 ; i<size ; i++){
                    int[] cell = queue.poll();
                    for(int[] dir : direction){
                        int nr = cell[0] + dir[0];
                        int nc = cell[1] + dir[1];
                        if(nr >= 0 && nr < row && nc >= 0 && nc < col && grid[nr][nc] == 1){
                            grid[nr][nc] = 2;
                            fresh--;
                            queue.offer(new int[]{nr , nc});
                        } 
                    }
                }
                min++;
            }
            return fresh == 0 ? min : -1;
        }
    }