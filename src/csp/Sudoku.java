package csp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sudoku implements ConstraintSatisfactionProblem {
	
	public static final Value _1   = new Value("1");
	public static final Value _2   = new Value("2");
	public static final Value _3   = new Value("3");
	public static final Value _4   = new Value("4");
	public static final Value _5   = new Value("5");
	public static final Value _6   = new Value("6");
	public static final Value _7   = new Value("7");
	public static final Value _8   = new Value("8");
	public static final Value _9   = new Value("9");
	
	public static Domain allNumbers = new Domain();
	
	public static final Variable x1  = new Variable("x1", allNumbers);
	public static final Variable x2  = new Variable("x2", allNumbers);
	public static final Variable x3  = new Variable("x3", allNumbers);
	public static final Variable x4  = new Variable("x4", allNumbers);
	public static final Variable x5  = new Variable("x5", allNumbers);
	public static final Variable x6  = new Variable("x6", allNumbers);
	public static final Variable x7  = new Variable("x7", allNumbers);
	public static final Variable x8  = new Variable("x8", allNumbers);
	public static final Variable x9  = new Variable("x9", allNumbers);

	
	
	static{
		allNumbers.add(_1);
		allNumbers.add(_2);
		allNumbers.add(_3);
		allNumbers.add(_4);
		allNumbers.add(_5);
		allNumbers.add(_6);
		allNumbers.add(_7);
		allNumbers.add(_8);
		allNumbers.add(_9);
	}
	
    private List<Variable> vars = new ArrayList<Variable>();
    
    Sudoku() {
        vars.add(x1);
        vars.add(x2);
        vars.add(x3);
        vars.add(x4);
        vars.add(x5);
        vars.add(x6);
        vars.add(x7);
        vars.add(x8);
        vars.add(x9);
    }
    
    class SudokuArc extends Arc {

		public SudokuArc(Variable var1, Variable var2) {
			super(var1, var2);
		}

		@Override
		public boolean allowed(Value v1, Value v2) {
			// is allowed Arc logic is not implemented yet 
			return false;
		}
    	
    }
    
    public List<Arc> allArcs() {
        List<Arc> arcs = new LinkedList<Arc>();
        //Arcs not implemented yet
        return arcs;
        
    }

	public List<Variable> variables() {
		return vars;
	}



}
