
public class Conway {
    private boolean[][] grid;

    public void Life(int rows, int cols) {
        grid = new boolean[rows][cols];
    }

    public void setCell(int row, int col, boolean value) {
        grid[row][col] = value;
    }

    public boolean getCell(int row, int col) {
        if (row < 0 || row >= grid.length) return false;
        if (col < 0 || col >= grid[0].length) return false;
        return grid[row][col];
    }

    public int countNeighbors(int row, int col) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;

                if (getCell(row + i, col + j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public void update() {
        boolean[][] next = new boolean[grid.length][grid[0].length];

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                int neighbors = countNeighbors(row, col);

                if (grid[row][col]) {
                    next[row][col] = (neighbors == 2 || neighbors == 3);
                } else {
                    next[row][col] = (neighbors == 3);
                }
            }
        }
        grid = next;
    }

    public void print() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] ? "O" : ".");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        Life life = new Life(10, 10);

        life.setCell(1, 2, true);
        life.setCell(2, 3, true);
        life.setCell(3, 1, true);
        life.setCell(3, 2, true);
        life.setCell(3, 3, true);

        for (int i = 0; i < 100; i++) {
            life.print();
            life.update();
            Thread.sleep(500);
        }
    }
}














































//import java.awt.Color;
//import java.awt.Graphics;
//
// public class Cell{
//	 private final int x;
//	 private final int y;
//	 private final int size;
//	 private int state;
// 
// 
//
// public Cell(int x, int y, int size) {
//	    this.x = x;
//	    this.y = y;
//	    this.size = size;
//	    this.state = 0;
//	    
//	    final Color[] COLORS = {Color.WHITE, Color.BLACK};
//
//	    public void draw(Graphics g) {
//	        g.setColor(COLORS[state]);
//	        g.fillRect(x + 1, y + 1, size - 1, size - 1);
//	        g.setColor(Color.LIGHT_GRAY);
//	        g.drawRect(x, y, size, size);
//	    
// 
//	        public boolean isOff() {
//	            return state == 0;
//	        }
//
//	        public boolean isOn() {
//	            return state == 1;
//	        }
//
//	        public void turnOff() {
//	            state = 0;
//	        }
//
//	        public void turnOn() {
//	            state = 1;
//	        }
//
// }
// }
// }
// }


























//		import java.awt.Color;
//		import java.awt.Graphics;
//
//		public class Cell {
//			
//			public static final Color[] COLORS = {Color.WHITE, Color.BLACK}];
//			
//			private final int x;
//			private final int y;
//			private final int size;
//			private int state;
//
//
//			public Cell(int x, int y, int size) {
//				this.x = x;
//				this.y = y;
//				this.size  = size;
//				this.state = 0;
//			}
//			
//			public void draw(Graphics g) {
//				g.setColor(COLORS[state]);
//				g.fillRect(x + 1,  y + 1,  size -1, size -1);
//				g.setColor(Color.LIGHT_GRAY);
//				g.drawRect(x,  y,  size, size);
//			}
//			
//			public boolean isOff() {
//				return state == 0;
//			}
//			
//			public boolean isOn() {
//				return state == 1;
//			}
//			
//			public void turnOff() {
//				state = 0;
//			}
//			
//			public boolean turnOn() {
//				state = 1;
//			}
//			
//			
//			
//		}
//		// TODO Auto-generated method stub


