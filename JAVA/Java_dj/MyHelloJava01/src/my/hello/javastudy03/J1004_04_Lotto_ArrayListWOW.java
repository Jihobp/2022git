package my.hello.javastudy03;

import java.util.*;

public class J1004_04_Lotto_ArrayListWOW {

	public static void main(String[] args) {
		// ArrayList 戚遂廃 稽暁 // 床延 処澗汽, 壕伸 号縦引 坪球号縦戚 暗税 業旭陥.
		// 企重 壕伸 什展析稽 坪球促左奄
		Scanner s = new Scanner(System.in);
		System.out.println("杖原蟹 詞闇亜推?");
		int count = s.nextInt() / 1000; // 5000脊径馬檎 count =5

		if (count > 5 || count < 1) {
			System.out.println("榎衝戚 設公鞠醸柔艦陥.");
			return;
		}
		for (int i = 0; i < count; i++) {
			ArrayList<Integer> lotto = new ArrayList<Integer>();
			for (int j = 0; j < 6; j++) {	//掩戚亜 6生稽 走舛.
				int num = (int) (Math.random() * 45) + 1;
				boolean isDuplicate = false;	//Q> 訊 坦製拭 false研 隔嬢匝殴?? true亜鞠檎 陥獣 ++馬檎辞 薦切軒 杏製?? 
				for(int k=0; k<j; k++) { //k腰仙拭 num葵生 ぉ砧壱
					if(lotto.get(k)==num) {
						isDuplicate=true;	//true : 掻差戚鞠檎しし
						j--;				//戚耕 隔聖凶原陥 搾嘘研 背辞, 馬蟹梢 隔聖企原陥 ぇ\搾嘘喫.益掘辞 益撹 馬蟹梢 皐爽檎喫.  
						break;
					}
				}
				if(!isDuplicate) //false 亜鞠檎 true亜鞠檎辞 叔楳. 
					lotto.add(num); //lotto拭 num聖 隔澗陥.
			}
			//System.out.print(lotto.toString());
			int bns= (int)(Math.random()*45)+1;
			for(int j=0; j<lotto.size();j++) {
				if(bns==lotto.get(j))	//// 左格什 腰硲亜 旭生檎 違帖艦猿 陥獣嗣壱, j研 -1稽 郊菓陥. for 庚戚 j++鞠檎辞 0採斗 陥獣獣拙.
				{
					bns = (int)(Math.random()*45)+1;
					j=-1;	//焼森 坦製採斗 陥獣 端滴 背醤背辞 j拭 -1葵 隔嬢辞 坦製生稽 宜焼姶. 0腰仙採斗鞠惟 しさし
				}
			}
			Collections.sort(lotto); 	//舛慶 
			System.out.print(lotto.toString());
			System.out.println(" 左格什 " +bns);
			lotto.clear();				//稽暁 照拭 赤澗 葵聖 穿採 肢薦(=remove)
			//凧壱稽 lotto.clear(); 照背亀喫. 
			//訊劃檎 是楕拭 ArrayList研 歯稽 識情馬奄 凶庚.
			
			//lotto.remove(i), i腰仙研 焼森 走趨獄顕 しさし
			//lotto.get(i) > lotto[i]腰仙研 亜閃神澗汽 arraylist虞辞 get(i); 切郊 壕伸引 妊薄戚 陥研屍
		}


//	https://velog.io/@xyunkyung/JAVA-ArrayList%EB%A1%9C-lotto-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A8-%EC%9E%91%EC%84%B1%ED%95%98%EA%B8%B0
//		for(int i =1; i<=45; i++)
//		{ list.add(i);}
//		int [] lotto = new int[6];
//		
//		沓棋聖 紫遂背辞 郊稽擦澗 識持還,
//		剰澗 軒什闘 拭 沓棋生稽 潤 希背爽壱, 暗奄辞 n腰属 get 馬壱 走趨捜. >> 箭企 掻差戚 鞠走省惟. 
//		置借葵 0, 置奇葵 44
	}
}
