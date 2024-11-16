package com.george.bridge;

public class XiaoMi implements Brand {

	// 款式
	private String style;

	@Override
	public void open() {
		System.out.println(this.style + " 小米手机开机");
	}

	@Override
	public void close() {
		System.out.println(this.style + " 小米手机关机 ");
	}

	@Override
	public void call() {
		System.out.println(this.style + " 小米手机打电话");
	}

	@Override
	public void setStype(String stype) {
		this.style = stype;
	}

}
