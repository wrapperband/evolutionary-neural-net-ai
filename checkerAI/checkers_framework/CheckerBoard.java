package checkers_framework;
	public final static int LEGALMOVE = 1;
	}
	private void initializeBoard() {
		board[2][1] = Checker.BLACK;

	public int getSquareContents(int row, int col){
	public int getBlackScore(){
		int score = 0;
	public int getWhiteScore(){
	public int move(Move m, int moveColor) {
	// This method has all the logic for determining whether the
	// move passed in the parameters is legal.  If the last
	// parameter is true, it actually updates the board.
		return ApplyMove(board, currow, curcol, sucrow, succol);
		switch (position[i][j]) {
						}
							return true;
				}


	// IsMoveLegal checks if the move entered is legal.
			// first see if any captures are possible
				case Checker.BLACK:
			}
					if ((end_i - start_i == -1)&&(end_j - start_j == -1||end_j - start_j == 1))
		}
					return ILLEGALMOVE;
	}
	// checkers that i and j are between 0 and 7 inclusive
		
				else {
			// check for new king

}
