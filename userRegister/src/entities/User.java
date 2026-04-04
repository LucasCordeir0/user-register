package entities;

public class User {
	
	private int id;
	private String name;
	private String cpf;
	
	
	//CONSTRUCTOR
	public User(int id, String name, String cpf) {
		setId(id);
		setName(name);
		setCpf(cpf);
	}

	//GETTERS E SETTERS
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if(id <= 0) {
			throw new IllegalArgumentException("ID is empty!");
		}
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name is empty!");
		}
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if(cpf == null || cpf.trim().isEmpty()) {
			throw new IllegalArgumentException("CPF is empty!");
		}
		this.cpf = cpf;
	}
	

	@Override
	public String toString() {
		return "\nID: " + id + ", NAME: " + name + ", CPF: " + cpf;
	}
	
	
}
