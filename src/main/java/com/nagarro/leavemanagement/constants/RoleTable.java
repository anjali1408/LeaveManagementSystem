package main.java.com.nagarro.leavemanagement.constants;

public enum RoleTable {
	TABLENAME("role"), ID("id"), NAME("name");
	private String value;

	private RoleTable(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
