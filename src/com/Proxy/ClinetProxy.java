package com.Proxy;

public class ClinetProxy {

		public static void main(String[] args) {
			RealObject proxy = new RealObjectProxy();
			proxy.doSomething();
	}

}
