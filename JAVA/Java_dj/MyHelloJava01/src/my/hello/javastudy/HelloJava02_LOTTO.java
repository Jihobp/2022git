package my.hello.javastudy;

import java.util.*;

public class HelloJava02_LOTTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 稽暁 覗稽益轡 促左奄
		// 6鯵 腰硲櫛 左格什 腰硲 窒径背爽奄
		// 1~ 5 紫戚拭 葵聖 脊径閤焼辞 遭促 稽暁坦軍
		// 腰硲 1鯵~ 5鯵 嗣焼爽澗暗 背左奄
		// for庚 据獣旋生稽 床檎 格巷 掩嬢走艦猿 ばばばばばばlike Clan, java source, library 奄管聖 紫遂背ち辞
		// 床切~~!!!!!@!!!!!!@!~@@!~@~!@~

		// 1. 雁歎腰硲研 護腰 嗣焼馨走 脊径閤奄
		Scanner s = new Scanner(System.in); // 嬬車但拭辞 徹左球稽 葵聖 脊径 閤畏陥 虞澗 依戚雁.
		int count = s.nextInt();
		// int[] lotto = new int[6];

		if (count < 1 || count > 5) // 1左陥 旋暗蟹 5左陥 滴檎 五昔 敗呪研 魁鎧獄鍵雁. 1噺,2噺.3噺,4噺,5噺 脊径鞠艦猿.
		{
			System.out.println(count + "判呪澗 設公吉 葵!!");
			return; // main敗呪研 魁鎧獄軒澗 依.
		}
		for (int i = 0; i < count; i++) {
			int[] lotto = new int[6];

			// 2. 雁歎腰硲研 嗣焼鎧檎 吉陥.
			for (int j = 0; j < lotto.length; j++) {
				int num = (int) (Math.random() * 45) + 1; // int num 戚虞澗 痕呪拭 沓棋葵聖 隔澗陥.
				// int 展脊 莫痕発(int), 訊劃檎 沓棋精 社呪切軒亜 蟹人辞 しし 1.99亜 襟檎 +1 背辞 2稽 鋼臣顕.
				// boolean isDuplicate = //掻差 食採 端滴馬澗 Duplicate //
				// Arrays.asList(lotto).contains(num);
				// ????????????????????????????????
				// array壕伸,聖 .asList稽 郊荷畏陥.(lotto研 古鯵痕呪稽 閤澗.).益軒壱 contains(num痕呪研 匂敗梅澗走 照梅澗走
				// true/false 溌昔) ???????????????????????????
				// arrays.asList()五社球研 紫遂背辞 壕伸聖 List稽 痕井馬壱,
				// contains()五辞球研 紫遂背 軒什闘 鎧 推社 掻拭 key 葵戚 糎仙馬澗走 食採 (true/false )研 溌?歿儡?.
				// contains : 梓端 壕伸, 梓端 List 拭辞 床績
				// ?
//				int idx = Arrays.asList(lotto).indexOf(num);
//				//if(isDuplicate) //朽巴軒追戚闘亜 闘欠檎,
//				if(idx != -1)    //index 亜 -1戚 焼艦檎?!
//				{
//					j--;	//薦戚 壕伸聖 陥獣 皐爽壱 宜焼亜辞 仙獣拙.
//					continue;
//				}
//				lotto[j]=num;

				boolean isDuplicate = false;
				// contain, indexOf澗 梓端 企雌績
				for (int k = 0; k < j; k++) {
					if (lotto[k] == num) {
						isDuplicate = true; // 掻差戚 鞠檎 true研 隔壱 ,
						j--; // 戚耕 隔聖凶原陥 搾嘘研 梅奄 ??庚拭, 馬蟹 隔聖凶原陥 搾嘘づ亜 吉陥. 益掘辞 益撹 j--; 馬蟹梢 皐爽檎器.
						break;
					}
				}

				// isDuplicate 亜 false 亜 鞠檎 蒋税 汗界妊拭 税背辞 true亜 喫.
				// 幻鉦 isDuplicate亜 true 亜 鞠檎
				// 汗界妊拭 税背辞 false亜 喫.
				// ! : not 尻至

				if (!isDuplicate)	//duplicate亜 焼艦檎 稽暁 薦戚腰属拭 収切 隔勧岐.
					lotto[j] = num;
			}
			
			int bns = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < lotto.length; j++) {
				if (bns == lotto[j]) { // 左格什 腰硲亜 旭生檎 違帖艦猿 陥獣嗣壱, j研 -1稽 郊菓陥. for 庚戚 j++鞠檎辞 0採斗 陥獣獣拙.
					bns = (int) (Math.random() * 45) + 1;
					j = -1; //// 焼森ぢ 坦製採斗 陥獣 端滴研 背醤背辞 -1 稽 背辞 坦製生稽 宜焼娃陥. ;さ; 0腰属採斗!!鞠惟
				}
			}
			Arrays.sort(lotto); // arrays : 壕伸拭 淫恵吉 適掘什, sort. 澗 壕伸拭 赤澗 葵級聖 神硯託授 舛慶稽 窒径馬惟 背爽澗依.
			System.out.print((i + 1) + "腰?? 腰硲");
			System.out.print(Arrays.toString(lotto));	//壕伸照拭 赤澗 収切研 左奄疏惟 痕発背爽澗依 しさし.
			System.out.println("左格什 腰硲 : " + bns);
		}
	}

}
