package hoemwork;

public class cat {
	private String name;
	private int dry;
	private int can;
	private int bag;
	private double weight;
	private double age;
	private int sum;
	private int kcal;
	
	public cat(String name, double weight, double age , int dry, int can, int bag) {
		super();
		if(dry>=0 && dry<2 && can>=0 && bag>=0 && weight>0) {
			this.name = name;
			this.dry = dry;
			this.can = can;
			this.bag = bag;
			this.weight = weight;
			this.age=age;
			sum=dry*1380+can*60+bag*45;
			kcal= (int)(age*(Math.round(70*Math.pow(weight,0.75))));
		}else{
			this.name = name;
			this.dry = dry;
			this.can = can;
			this.bag = bag;
			this.weight = weight;
			this.age=age;
			sum=(int)((dry*1380*0.9+can*60+bag*45));
			kcal= (int)(age*(Math.round(70*Math.pow(weight,0.75))));
			}
	}
	public cat(String name, double weight, double age) {
		this.name = name;
		this.weight = weight;
		this.age=age;
		kcal= (int)(age*(Math.round(70*Math.pow(weight,0.75))));
	}
	public cat(int dry, int can, int bag) {
		if(dry>=0 && dry<2 && can>=0 && bag>=0 ) {
			
			this.dry = dry;
			this.can = can;
			this.bag = bag;
			sum=dry*1380+can*60+bag*45;			
		}else{			
			this.dry = dry;
			this.can = can;
			this.bag = bag;
			sum=(int)((dry*1380*0.9+can*60+bag*45));
			}
	}
		
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDry() {
		return dry;
	}

	public void setDry(int dry) {
		this.dry = dry;
	}

	public String DS() {
		if(this.dry>=2) {
			return (int)(this.dry*1380*0.9)+"(9折)";
		}
		return ""+this.dry*1380;
	}
	
	public String getCan() {
		if(can>=24) {
			return can+"+"+(can/24);
		}		
		return ""+can;
	}

	public void setCan(int can) {
		this.can = can;
	}
	
	public int CS() {
		return this.can*60;
	}

	public String getBag() {
		if(bag>=12) {
			return bag+"+"+(bag/12);
		}
		return ""+bag;
	}

	public void setBag(int bag) {
		this.bag = bag;
	}

	public int BS() {
		return this.bag*45;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSum() {
		return sum;
	}

	public int getKCal() {
		return kcal;
	}
		
	public String getComm(){
		String comm="";
		if(age==2||(age==1.6 && this.weight>=3 && this.weight<=5)){
			comm= "能吃就是福!";
		}else if(age==1 && this.weight>=3 && this.weight<=5){
			comm= "是標準的健康好寶寶!";
		}else if((age==1||age==1.6)&& this.weight<3){
			comm= "有點太瘦了QQ加油!!";
		}else if(this.weight>5){
			comm= "有點太胖了>O<要注意一下唷!";
		}
		return comm;
	}
	
	public String output() {
		return
		"收到您的訂單!\t\t\t\t^ↀᴥↀ^"+
		"\n\t"+getName()+getComm()+
		"\n\t"+getName()+"每天需要的熱量："+getKCal()+
		"\n========================================================"+
		"\n品項\t單價\t數量\t小計"+
		"\n--------------------------------------------------------------------------------------------------"+
		"\n乾飼料\t$1380\t"+getDry()+"\t"+DS()+
		"\n點心罐\t$60\t"+getCan()+"\t"+CS()+
		"\n主食餐包\t$45\t"+getBag()+"\t"+BS()+
		"\n--------------------------------------------------------------------------------------------------"+
		"\n\t\t總金額\t"+getSum()+
		"\n========================================================"+
		"\n\t\t\t謝謝您的惠顧!\n\t\t\t主子開心大家都開心!";
	}
	
	public String onlyName() {
		return "好罐罐不買嗎?\t\t\t\t^ↀᴥↀ^"+
				"\n\t"+getName()+getComm()+
				"\n\t"+getName()+"每天需要的熱量："+getKCal();
	}
	
	public String onlyBuy() {
		return
		"收到您的訂單!\t\t\t\t^ↀᴥↀ^"+
		"\n不介紹一下您的貓貓嗎?"+
		"\n========================================================"+
		"\n品項\t單價\t數量\t小計"+
		"\n--------------------------------------------------------------------------------------------------"+
		"\n乾飼料\t$1380\t"+getDry()+"\t"+DS()+
		"\n點心罐\t$60\t"+getCan()+"\t"+CS()+
		"\n主食餐包\t$45\t"+getBag()+"\t"+BS()+
		"\n--------------------------------------------------------------------------------------------------"+
		"\n\t\t總金額\t"+getSum()+
		"\n========================================================"+
		"\n\t\t\t謝謝您的惠顧!\n\t\t\t主子開心大家都開心!";
	}
}
