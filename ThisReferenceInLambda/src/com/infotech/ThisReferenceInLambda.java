package com.infotech;

public class ThisReferenceInLambda {
	public void process() {
		doPerate(30, n -> {
			System.out.println(30 + n);
			System.out.println(this);
		});

	}

	public static void main(String[] args) {

		int b = 90;
		ThisReferenceInLambda.doPerate(30, n -> {
			System.out.println(30 + n);
			// System.out.println(this);
		});
		new ThisReferenceInLambda().process();
	}

	private static void doPerate(int i, Operation o) {
		o.operate(i);
	}
}
