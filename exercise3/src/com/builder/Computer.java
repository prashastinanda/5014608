package com.builder;

public class Computer {
	private String CPU;
	private int RAM;
	private double storage;
	private String motherboard;

	private Computer(Builder b) {
		super();
		this.CPU = b.CPU;
		this.RAM = b.RAM;
		this.storage = b.storage;
		this.motherboard = b.motherboard;
	}

	public String getCPU() {
		return CPU;
	}

	public int getRAM() {
		return RAM;
	}

	public double getStorage() {
		return storage;
	}

	public String getMotherboard() {
		return motherboard;
	}

	static class Builder {

		private int RAM;
		private String CPU;
		private double storage;
		private String motherboard;

		public Builder() {
			super();
		}

		public void setCPU(String CPU) {
			this.CPU = CPU;
			// return this;
		}

		public void setRAM(int RAM) {
			this.RAM = RAM;
			// return this;
		}

		public void setStorage(double storage) {
			this.storage = storage;
			// return this;
		}

		public void setMotherboard(String motherboard) {
			this.motherboard = motherboard;
			// return this;
		}

		public Computer build(Builder b) {
			return new Computer(b);
		}

		public String toString() {
			return "Computer [" + "CPU = " + CPU + '\'' + "RAM = " + RAM + '\'' + "strorage = " + storage + '\''
					+ "Motherboard = " + motherboard + "]";
		}
	}
}
