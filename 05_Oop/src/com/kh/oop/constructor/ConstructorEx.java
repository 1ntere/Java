package com.kh.oop.constructor;

public class ConstructorEx {
	/*
	持失切
	
	痕呪研 据馬澗 葵生稽 段奄鉢研 遭楳拝 呪 赤製
	
	段奄葵 = 0; 生稽 鞠嬢 赤聖 凶 段奄葵拭 1聖 隔嬢爽檎
	段奄葵戚 1稽 段奄鉢喫
	
	1. 鋼発葵戚 蒸製(return 紫遂 x, void稽 識情馬走亀 省製)
	2. 梓端(適掘什)研 段奄鉢馬澗 号狛戚 弦聖 井酔 乞砧 紫遂 亜管
		識情 森薦
			1. 奄沙 持失切(段奄 持失切) - 焼巷訓 葵亀 琶呪亜 焼還
				public 適掘什戚硯() {
			
				}
			2. 琶呪 持失切 - 琶呪稽 閤焼醤馬澗 葵戚 糎仙
						- 琶呪稽 閤焼醤馬澗 葵精 琶球拭 旋微 葵幻 亜管
				public 適掘什戚硯(String しし, int けけ, char ぞぞ) {
					//食奄辞 痕呪誤引 琶球葵精 旭製
					this.琶球葵1 = しし;
					this.琶球葵2 = けけ;
					this.琶球葵3 = ぞぞ;
				}
			3. 葵聖 走舛廃 持失切
				琶球蟹 持失切拭辞 葵聖 走舛背層 持失切
	*/
	
	//琶球 痕呪誤 舛税
	public String name;//搾嬢赤製 (null)
	public String phone;//搾嬢赤製 (null)
	public int idNo;//搾嬢赤製 (0)
	public int money;//搾嬢赤製 (0)
	
	/*1. 奄沙 持失切, 2. 琶呪 持失切, 3. 葵聖 走舛廃 持失切*/
	
	//1. 奄沙 持失切 : 琶呪稽 焼巷依亀 隔走 省精 持失切
	public ConstructorEx() {
		
	}
	
	//2. 琶呪 持失切 : 胤硲 照拭 古鯵痕呪亜 琶呪稽 級嬢亜醤 馬澗 持失切
	//古鯵痕呪 : 憙 古 (掻古) 某 鯵 (晦析) 棣 痕 (痕拝) 皃 呪 (収切)
	//古鯵痕呪税 戚硯精 掻推馬走亜 省製
	//古鯵痕呪税 切戟莫幻 掻推敗
	//                  ( 古   鯵   痕   呪 )
	//					琶呪 : 戚硯
	public ConstructorEx(String inputName) {
		this.name = inputName;
	}
	/* 神嫌 降持
	//					琶呪 : 輩球肉 腰硲	
	public ConstructorEx(String inputPhone) {
		this.phone = inputPhone;
	}
	*/
	//					琶呪 : 戚硯, 輩球肉 腰硲	
	public ConstructorEx(String inputName, String inputPhone) {
		this.name = inputName;
		this.phone = inputPhone;
	}
	//					琶呪 : 戚硯, 輩球肉 腰硲, 焼戚巨 腰硲
	public ConstructorEx(String inputName, String inputPhone, 
			int inputIdNo) {
		this.name = inputName;
		this.phone = inputPhone;
		this.idNo = inputIdNo;
	}
	//					琶呪 : 戚硯, 輩球肉 腰硲, 焼戚巨 腰硲
	public ConstructorEx(String inputName, int inputIdNo, 
			String inputPhone) {
		this.name = inputName;
		this.phone = inputPhone;
		this.idNo = inputIdNo;
	}
	//					琶呪 : 戚硯, 輩球肉 腰硲, 焼戚巨 腰硲
	public ConstructorEx(int inputIdNo, String inputName,
			String inputPhone) {
		this.name = inputName;
		this.phone = inputPhone;
		this.idNo = inputIdNo;
	}
	/* 神嫌 降持
	//					琶呪 : 戚硯, 輩球肉 腰硲, 焼戚巨 腰硲
	public ConstructorEx(String inputPhone, String inputName, 
			int inputIdNo) {
		this.phone = inputPhone;
		this.name = inputName;
		this.idNo = inputIdNo;
	}
	*/
	//					琶呪 : 戚硯, 輩球肉 腰硲, 焼戚巨 腰硲, 儀
	public ConstructorEx(String inputName, String inputPhone,
			int inputIdNo, int inputMoney) {
		this.name = inputName;
		this.phone = inputPhone;
		this.idNo = inputIdNo;
		this.money = inputMoney;
	}
	
	//3. 葵聖 走舛廃 持失切
	/*
	葵聖 走舛廃 持失切澗 段奄税 葵幻 走舛背爽奄 凶庚拭
	古鯵痕呪研 琶呪稽 隔嬢爽走 省焼亀 鞠走幻
	段奄 持失切人 持沿歯亜 業旭焼辞 察娃 匝戚 蟹奄 凶庚拭(神嫌亜 蟹奄 凶庚拭)
	薄仙澗 績税稽 古鯵痕呪研 隔嬢捜
	左搭精 段奄 持失切坦軍 public ConstructorEx() {} 紫遂拝 呪 赤製
	=> 馬走幻 弦戚 紫遂馬走澗 省製
	*/
	
	public ConstructorEx(int a) {
		//奄沙生稽 葵聖 走舛背辞 穿含馬澗 持失切
		//持失拝 凶採斗 葵聖 走舛背爽壱 蓄板 葵聖 痕井拝 呪 赤亀系 背捜
		name = "戚硯聖 脊径背爽室推.";
		//name精 String戚奄 凶庚拭 庚切伸聖 隔嬢醤 敗
		phone = "腰硲研 脊径背爽室推.";
		//phone精 String戚奄 凶庚拭 庚切伸聖 隔嬢醤 敗
		idNo = 1;
		//idNO澗 int戚奄 凶庚拭 収切葵聖 隔嬢醤 敗
		money = 0;
		//money澗 int戚奄 凶庚拭 収切葵聖 隔嬢醤 敗
	}
	
	public static void main(String[] args) {

	}
}
