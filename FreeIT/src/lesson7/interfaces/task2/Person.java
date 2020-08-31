package lesson7.interfaces.task2;

import lesson7.interfaces.task2.jackets.*;
import lesson7.interfaces.task2.pants.*;
import lesson7.interfaces.task2.shoes.*;

public class Person implements PersonInterface {

	private String name;
	private Jacket jacket;
	private Pants pants;
	private Shoes shoes;

	public Person() {
		super();
	}

	public Person(String name, Jacket jacket, Pants pants, Shoes shoes) {
		super();
		this.name = name;
		this.jacket = jacket;
		this.pants = pants;
		this.shoes = shoes;
	}

	@Override
	public void putOnAll() {
		System.out.println(name+":");
		jacket.putOnJacket();
		pants.putOnPants();
		shoes.putOnShoes();
		System.out.println();
	}

	@Override
	public void putOffAll() {
		System.out.println(name+":");
		jacket.putOffJacket();
		pants.putOffPants();
		shoes.putOffShoes();
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Jacket getJacket() {
		return jacket;
	}

	public void setJacket(Jacket jacket) {
		this.jacket = jacket;
	}

	public Pants getPants() {
		return pants;
	}

	public void setPants(Pants pants) {
		this.pants = pants;
	}

	public Shoes getShoes() {
		return shoes;
	}

	public void setShoes(Shoes shoes) {
		this.shoes = shoes;
	}

}
