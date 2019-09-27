package com.model.vo;

import java.util.Arrays;

/*������ �ɼ��� �����ϴ� Ŭ����*/
public class Option {
	private boolean hot = true; //��/���̽�
	private int size = 0; //������(���ַ�, ����)
	private int cnt = 0; //����
	private boolean take = true; //take-in = true, take-out = false
	
	/*additional option*/
	private boolean caffeine; //ī����, ��ī����
	private int syrup[] = new int[3]; //�ٴҶ�, �������, ļ��� �÷�
	private int shot = 0; //�� �߰�
	private boolean milk = true; //���� = true, ���� ����
	private boolean cream = false; //���� ����
	
	public Option() { }
	
	public Option(boolean hot, int size, int cnt, boolean take, int[] syrup, int shot, boolean milk, boolean cream) {
		super();
		this.hot = hot;
		this.size = size;
		this.cnt = cnt;
		this.take = take;
		this.syrup = syrup;
		this.shot = shot;
		this.milk = milk;
		this.cream = cream;
	}
	
	/*getter & setter*/
	public boolean isCaffeine() {
		return caffeine;
	}
	
	public void setCaffeine(boolean caffeine) {
		this.caffeine = caffeine;
	}
	public boolean isHot() {
		return hot;
	}
	public void setHot(boolean hot) {
		this.hot = hot;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public boolean isTake() {
		return take;
	}
	public void setTake(boolean take) {
		this.take = take;
	}
	public int[] getSyrup() {
		return syrup;
	}
	public void setSyrup(int[] syrup) {
		this.syrup = syrup;
	}
	public int getShot() {
		return shot;
	}
	public void setShot(int shot) {
		this.shot = shot;
	}
	public boolean isMilk() {
		return milk;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	public boolean isCream() {
		return cream;
	}
	public void setCream(boolean cream) {
		this.cream = cream;
	}
	
	@Override
	public String toString() {
		return "Option [caffeine= " + caffeine + "hot=" + hot + ", size=" + size + ", cnt=" + cnt + ", take=" + take + ", syrup="
				+ Arrays.toString(syrup) + ", shot=" + shot + ", milk=" + milk + ", cream=" + cream;
	}
	
	
}
