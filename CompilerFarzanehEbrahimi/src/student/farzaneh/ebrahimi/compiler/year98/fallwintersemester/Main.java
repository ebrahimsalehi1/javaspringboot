package student.farzaneh.ebrahimi.compiler.year98.fallwintersemester;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		System.out.println("compiler project written by Farzaneh Ebrahimi");
		
		Map<Integer,String> mRules = new HashMap<Integer,String>();
		mRules.put(1, "A->iBtAC");
		mRules.put(2, "A->a");
		mRules.put(3, "C->eC");
		mRules.put(4, "C->@");
		mRules.put(5, "C->Cf");
		mRules.put(6, "B->b");
		mRules.put(7, "B->Dq");
		mRules.put(8, "D->Ar");
		mRules.put(9, "D->@");
		
		Map<Integer,Character> mterminal = new HashMap<Integer,Character>();
		mterminal.put(1, 'a');
		mterminal.put(2, 'b');
		mterminal.put(3, 'e');
		mterminal.put(4, 'f');
		mterminal.put(5, 'g');
		mterminal.put(6, 'i');
		mterminal.put(7, 'r');
		mterminal.put(8, 't');
		
		Map<Integer,Character> mnoneTerminal = new HashMap<Integer,Character>();
		mnoneTerminal.put(1, 'A');
		mnoneTerminal.put(2, 'B');
		mnoneTerminal.put(3, 'C');
		mnoneTerminal.put(4, 'D');
		
		MySimulator mySimulator = new MySimulator(
					mRules,
					mterminal,
					mnoneTerminal
				);
		mySimulator.realize();

	}

}
