package org.github;

public class GithubExample {
	private void add(int a,int b) {
		int c = a+b;
		System.out.println(c);

	}
	private void display() {
		System.out.println("welcome to github page");

	}

	public static void main(String[] args) {
		
		GithubExample g=new GithubExample();
		g.add(10, 20);
		g.display();

	}

}
