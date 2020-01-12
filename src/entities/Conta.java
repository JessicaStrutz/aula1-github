package entities;

public class Conta {
	private long number = 0;
	private String holder;
	private double money = 0;
	
	public Conta()
	{
		
	}
	public Conta(long number, String holder, double money) {
		super();
		this.number = number;
		this.holder = holder;
		this.money = money;
	}
	public Conta(long number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getMoney() {
		return money;
	}
	public void AddMoney(double dMoney) {
		this.money += dMoney; 
	}
	public void RemoveMoney(double dMoney) {
		this.money -= dMoney + 5;
	}
	@Override
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + money;
	}
	
	
	
}
