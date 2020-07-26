package com.pratmodi.builderpattern;


public final class Student {
	private int id; 
    private String name; 
    private String address;
    
    public Student(Builder builder) {
    	this.id = builder.id;
    	this.name= builder.name;
    	this.address = builder.address;
    }
    
    public static class Builder{
    	private int id;
    	private String name;
    	private String address;
    	
    	public static Builder newInstance() {
    		return new Builder();
    	}
    	
    	private Builder() {}

		public int getId() {
			return id;
		}

		public Builder setId(int id) {
			this.id = id;
			return this;
		}

		public String getName() {
			return name;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public String getAddress() {
			return address;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
    	
    	public Student build() {
    		return new Student(this);
    	}

		@Override
		public String toString() {
			return "Builder [id=" + id + ", name=" + name + ", address=" + address + "]";
		}
    	
    	
    }
    
	public int getId() {
		return id;
	}
	public Student  setId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Student  setName(String name) {
		this.name = name;
		return this;
	}
	public String getAddress() {
		return address;
	}
	public Student setAddress(String address) {
		this.address = address;
		return this;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	} 
    
	public String initiate() {
		return "This is the return from initiate method.";
	}
    
}
