package csp;

import junit.framework.TestCase;

public class TestNQueens extends TestCase{
    
	public void testBacktrackSearch() {
        
        NQueens nQueens = new NQueens();

        BaseBacktrackAlg alg = new BaseBacktrackAlg(); 
        Assignment result = alg.execute(nQueens);
        assertTrue(result.isComplete());
        assertNotNull(alg.findInferences(nQueens, result));
        
        alg = new OptBacktrackAlg(); 
        result = alg.execute(nQueens);
        assertTrue(result.isComplete());
        assertNotNull(alg.findInferences(nQueens, result));

    }

}
