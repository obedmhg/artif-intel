package csp;

import junit.framework.TestCase;

public class TestSudoku extends TestCase{
    
	public void testBacktrackSearch() {
        
        Sudoku sudoku = new Sudoku();

        BaseBacktrackAlg alg = new BaseBacktrackAlg(); 
        Assignment result = alg.execute(sudoku);
        assertTrue(result.isComplete());
        assertNotNull(alg.findInferences(sudoku, result));
        
        alg = new OptBacktrackAlg(); 
        result = alg.execute(sudoku);
        assertTrue(result.isComplete());
        assertNotNull(alg.findInferences(sudoku, result));

    }

}
