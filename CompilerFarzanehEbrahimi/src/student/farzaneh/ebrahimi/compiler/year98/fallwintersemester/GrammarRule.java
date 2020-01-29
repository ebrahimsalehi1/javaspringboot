package student.farzaneh.ebrahimi.compiler.year98.fallwintersemester;

public class GrammarRule {
	
	private int ruleId;
	private String ruleName;		
	
	public GrammarRule(int ruleId, String ruleName) {
		super();
		this.ruleId = ruleId;
		this.ruleName = ruleName;
	}
	
	public int getRuleId() {
		return ruleId;
	}
	
	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}
	
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	@Override
	public String toString() {
		return "Rules [ruleId=" + ruleId + ", ruleName=" + ruleName + "]";
	}
	
	
	
	

}
