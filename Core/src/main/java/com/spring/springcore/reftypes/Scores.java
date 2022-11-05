package com.spring.springcore.reftypes;

public class Scores {
	private Double maths;
	private Double physics;
	private Double chemistry;

	public Double getMaths() {
		return maths;
	}

	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + "]";
	}

	public void setMaths(Double maths) {
		this.maths = maths;
	}

	public Double getPhysics() {
		return physics;
	}

	public void setPhysics(Double physics) {
		this.physics = physics;
	}

	public Double getChemistry() {
		return chemistry;
	}

	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}
}
