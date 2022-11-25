#pragma once
//동물병원
//동물의 이름, 동물의 종류, 동물 고유 코드
//뽀삐라는 개가 2마리 이상일 수 있으니
//동물 고유 코드 = 주민번호 같은거로 구분할 것.

struct Mystructs
{
	char name[100]; //호호, 저그, 프로토스
	char species[100]; //개 고양이 등
	char code[100];
	//고유코드
	//학번 같은 것
	//숫자로 해도 되잖아
	//

	//09학번을 int로 넣으면 앞에 0이 사라져서 문자열로 학번 출력

}typedef Animal;

//내가 만들고 싶은 거
struct Food
{
	int price;
	char name[100];
}typedef taco;

struct StudentScore
{
	int kor;
	int eng;
	int math;
}typedef StudentScore;

struct KBStudnet
{
	int cScore;
	int javaScore;
	char name[100];
}typedef KBStudent;