#include<stdio.h>
#include<stdlib.h>//疑旋 壕伸遂
int main()
{
	//10牒促軒 壕伸 刃失
	int* dynamic_arr = (int*)malloc(10 * sizeof(int));
	dynamic_arr[0] = 1;
	dynamic_arr[1] = 3;
	dynamic_arr[2] = 5;
	
	for (int i = 0; i < 3; i++)
		printf("%d\n", dynamic_arr[i]);
	int size;
	printf("壕伸 紫戚綜 旋奄");
	scanf_s("%d", &size);
	int* dynamic_arr2 = (int*)malloc(size * sizeof(int));
	for (int i = 0; i < size; i++)
		dynamic_arr2[i] = i + 10;//税耕x
	for (int i = 0; i < size; i++)
		printf("%d\n", dynamic_arr2[i]);

	//sizeof 壕伸税 滴奄 仙爽澗暗.
	//壕伸照拭 痕呪税 滴奄研 壕伸稽 公舛廃陥??????  ししししししししししししししししししししししししししししししししししししし
	// い 痕呪胡煽 壕伸精 益陥製 五乞軒拭 臣虞亜澗汽 疑獣拭 stack拭 臣虞亜檎 授辞亜 言妬戚 娃陥. //
	// int a[5]={1,2,3,4,5} poooooooooooooooooooooooo
	// int a[n]={1,2,3,4,5} xxxxxxxxxxxxxxxxxxxxxxxxxxxx 益係奄凶庚拭 malloc戚櫛 calloc 潤爽檎 ok
	
	//匂昔斗澗 c拭幻 赤舘し.疑旋拝雁 慎蝕照拭 赤澗 heap 慎蝕凶庚拭 c#, java拭辞亀 床戚奄 凶庚拭 壕酔澗依.
	// 
	//int main() //b虞澗 壕伸生 び滴奄 
	//{
	//	int a;
	//	scanf_s("%d", &a);
	//	int* b = (int*)malloc(sizeof(int) * a);
	//	b[a]; //神嫌亜 照蟹惟 吉陥. 
	//}
		
	// 床壱 粛精 敗呪澗 c情嬢 ~馬壱獣遁推 帖檎 敗呪 達焼辞 差細/. 紫寓戚 幻級嬢轄暗檎 伯希督析, 姥薄鞠嬢責製 差細./
	// 
	//malloc - > 五乞軒 段奄鉢亜 照喫 //trash 葵.
	//calloc - > 0生稽 段奄鉢 背捜. //0生稽 辰崇
	//10牒促軒 収切 壕伸聖 幻級醸澗汽, 
	//照拭 葵戚 0生稽 段奄鉢 鞠嬢 赤陥.
	int* mynumbers = (int*)calloc(10, sizeof(4));
	for (int i = 0; i < 10; i++)
		printf("%d\n", mynumbers[i]);

	//疑旋 五乞軒澗 覗稽益掘袴亜 呪疑生稽 拝雁廃 依戚虞 陥 処陥檎 free稽 蒸蕉操醤 敗. 
	//戚暗 照蒸蕉檎 五乞軒 刊呪(memory leak) 庚薦 持沿.
	//聡 五乞軒亜 涯搾亜 喫.
	//幻鉦 覗稽益轡戚 戚企稽 魁貝陥檎 瓜戚 free研 旋聖 琶炊 蒸陥.
	//悦汽 戚 及拭亀 覗稽益轡戚 域紗 鞠壱, 戚杏 希戚雌 照彰陥檎
	//free研 背醤 廃陥.
	free(mynumbers);
	free(dynamic_arr);
	free(dynamic_arr2);


	//	1. 壕伸聖 幻球澗 汽, 壕伸税 滴奄研 紫遂切亜 舛廃陥.
	//	2. 壕伸税 滴奄幻鏑 収切研 脊径廃陥.
	int n;
	scanf_s("%d", &n);
	int* jpnum = (int*)malloc(sizeof(int)*n);
	for (int i = 0; i < n; i++) //0採斗 n-1猿走 鋼差  i=1; i<=n
	{
		scanf_s("%d", &jpnum[i]); //jpnum税 i腰属葵聖 脊径閤澗陥.
	}
	for (int i = 0; i < n; i++) 
	{
		printf("%d", jpnum[i]); //jpnum税 i腰属葵聖 窒径閤澗陥.
	}

	//	3. 益 掻拭辞 亜舌 笛 収切税
	//	昔畿什研 達焼浬陥.
	int max = jpnum[0];
	int min = jpnum[0];
	int maxindex = 0;
	int minindex = 0;

	for (int i=1; i < n; i++)
	{
		if (max < jpnum[i])
		{
			max = jpnum[i];
			maxindex = i; //護腰??昔走 達壱粛生檎 +1
		}
		if (min > jpnum[i])
		{ 
			min = jpnum[i];
			minindex = i;
		}
	}

	printf("\nmax=%d min=%d", max, min);
	printf("\nmaxindex=%d minindex=%d", maxindex, minindex);
	

	//	4. 1~2腰聖 搭背 幻窮 壕伸聖
	//	古鯵痕呪稽 馬食 亜舌 拙精 収切税
	//	昔畿什研 軒渡背層陥. (敗呪税 舛税 貢 硲窒)
	
	
	return 0;
}