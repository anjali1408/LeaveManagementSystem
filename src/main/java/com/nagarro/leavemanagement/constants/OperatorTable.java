package main.java.com.nagarro.leavemanagement.constants;

public enum OperatorTable {
	TABLENAME("operator"), USERID("userid"), NAME("name"), PASSWORD("password"),ID("id");
	private String value;

	private OperatorTable(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
