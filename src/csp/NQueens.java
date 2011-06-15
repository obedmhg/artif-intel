package csp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import csp.MapColoring.DiffColorArc;

public class NQueens implements ConstraintSatisfactionProblem{

	public static final Value _1   = new Value("1");
	public static final Value _2   = new Value("2");
	public static final Value _3   = new Value("3");
	public static final Value _4   = new Value("4");
	
	public static Domain allNumbers = new Domain();
	
	public static final Variable x1  = new Variable("x1", allNumbers);
	public static final Variable x2  = new Variable("x2", allNumbers);
	public static final Variable x3  = new Variable("x3", allNumbers);
	public static final Variable x4  = new Variable("x4", allNumbers);
	
	static{
		allNumbers.add(_1);
		allNumbers.add(_2);
		allNumbers.add(_3);
		allNumbers.add(_4);
	}
	
    private List<Variable> vars = new ArrayList<Variable>();
    
    NQueens() {
        vars.add(x1);
        vars.add(x2);
        vars.add(x3);
        vars.add(x4);
    }
    
    class NQueenArc extends Arc {

        public NQueenArc(Variable var1, Variable var2) {
            super(var1, var2);
        }

        @Override
        public boolean allowed(Value var1, Value var2) {
            if(var1 == null || var2 == null){
            	return false;
            }
        	int x1 = Integer.parseInt(var1.toString());
            int x2 = Integer.parseInt(var2.toString());
            if(var1 == var2){
            	return false;
            }
            //X1 Allowed constraints
            if(first.getName().equals("x1") && second.getName().equals("x2")){
            	if(x1 == x2-1 || x1 == x2+1){
            		return false;
            	}
            }
            if(first.getName().equals("x1") && second.getName().equals("x3")){
            	if(x1 == x2-2 || x1 == x2+2){
            		return false;
            	}
            }
            if(first.getName().equals("x1") && second.getName().equals("x4")){
            	if(x1 == x2-3 || x1 == x2+3){
            		return false;
            	}
            }
            //X2 Allowed constraints
            if(first.getName().equals("x2") && second.getName().equals("x1") || 
            		first.getName().equals("x2") && second.getName().equals("x3")){
            	if(x1 == x2-1 || x1 == x2+1){
            		return false;
            	}
            }
            if(first.getName().equals("x2") && second.getName().equals("x4")){
            	if(x1 == x2-2 || x1 == x2+2){
            		return false;
            	}
            }
            //X3 Allowed constraints
            if(first.getName().equals("x3") && second.getName().equals("x2") ||
            		first.getName().equals("x3") && second.getName().equals("x4")){
            	if(x1 == x2-1 || x1 == x2+1){
            		return false;
            	}
            }
            if(first.getName().equals("x3") && second.getName().equals("x1")){
            	if(x1 == x2-2 || x1 == x2+2){
            		return false;
            	}
            }
            //X4 Allowed constraints
            if(first.getName().equals("x4") && second.getName().equals("x3")){
            	if(x1 == x2-1 || x1 == x2+1){
            		return false;
            	}
            }
            if(first.getName().equals("x4") && second.getName().equals("x2")){
            	if(x1 == x2-2 || x1 == x2+2){
            		return false;
            	}
            }
            if(first.getName().equals("x4") && second.getName().equals("x1")){
            	if(x1 == x2-3 || x1 == x2+3){
            		return false;
            	}
            }
        	return false;
        }
        
    }
    
    public List<Arc> allArcs() {
        List<Arc> arcs = new LinkedList<Arc>();
        arcs.add(new NQueenArc(x1, x2));
        arcs.add(new NQueenArc(x1, x3));
        arcs.add(new NQueenArc(x1, x4));
        arcs.add(new NQueenArc(x2, x1));
        arcs.add(new NQueenArc(x2, x3));
        arcs.add(new NQueenArc(x2, x4));
        arcs.add(new NQueenArc(x3, x1));
        arcs.add(new NQueenArc(x3, x2));
        arcs.add(new NQueenArc(x3, x4));
        arcs.add(new NQueenArc(x4, x1));
        arcs.add(new NQueenArc(x4, x2));
        arcs.add(new NQueenArc(x4, x3));
        return arcs;
        
    }

	@Override
	public List<Variable> variables() {
		return vars;
	}


	
}
