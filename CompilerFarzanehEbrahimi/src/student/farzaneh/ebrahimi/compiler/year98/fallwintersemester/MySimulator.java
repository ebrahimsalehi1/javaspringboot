package student.farzaneh.ebrahimi.compiler.year98.fallwintersemester;

import java.util.Map;

public class MySimulator {
	
	Map<Integer,String> rules;
	Map<Integer,Character> terminal;
	Map<Integer,Character> noneTerminal;
	
	public MySimulator(Map<Integer, String> rules, Map<Integer, Character> terminal,
			Map<Integer, Character> noneTerminal) {
		super();
		
		this.rules = rules;
		this.terminal = terminal;
		this.noneTerminal = noneTerminal;
	}
	
	public void realize() {
		
	}

}
