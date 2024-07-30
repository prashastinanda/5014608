package com.builder;

public class BuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer.Builder b = new Computer.Builder();
		b.setRAM(32);
		b.setCPU("intel");
		b.setMotherboard("msi");
		b.setStorage(512);
		Computer c = new Computer.Builder().build(b);
		System.out.println(c.getCPU());
		System.out.println(c.getRAM());
		System.out.println(c.getMotherboard());
		System.out.println(c.getStorage());

		Computer.Builder b1 = new Computer.Builder();
		b1.setRAM(16);
		b1.setCPU("amd");
		b1.setMotherboard("gigabyte");
		b1.setStorage(256);
		Computer c1 = new Computer.Builder().build(b1);
		System.out.println(c1.getCPU());
		System.out.println(c1.getRAM());
		System.out.println(c1.getMotherboard());
		System.out.println(c1.getStorage());
	}

}
