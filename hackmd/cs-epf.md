![](https://i.imgur.com/bGVeJ46.png)
# 109學年度電腦學習歷程

## 動機
>因為自己想精進自己的程式邏輯能力，並同時想準備APCS考試，因此到高中生程式解題系統 (zerojudge.tw)上找適合自己的題目練習。

[Tab] 1.c9 

## 題目來源
>高中生程式解題系統 (zerojudge.tw)
## 題目
### 1. a225
#### - 題目：
 >https://zerojudge.tw/ShowProblem?problemid=a225
 >![](https://i.imgur.com/ZzevXSZ.png)

#### - 問題：
本來想要直接用內建的函示進行排序，但這題有兩種條件，因此內建的函示無法解決，所以自己才寫了個函式來排序。
 
#### - 作法：
 ```java=
* package a__;

import java.util.Scanner;

public class a225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		//呼叫Scanner類別(輸入)
		while(sc.hasNext()) {
			//EOF輸入
			int n=sc.nextInt(),arr1[]=new int[n];
			//輸入長度 宣告陣列
			for(int i=0;i<n;i++)
				//依序讀取內容
				arr1[i]=sc.nextInt();
			sort(arr1);
			//呼叫排序函式
			for(int i=0;i<n-1;i++)
				System.out.print(arr1[i]+" ");
			System.out.println(arr1[n-1]);
			//輸出
		}
	}
	
	static void sort(int arr1[]) {//排序
		//以氣泡排序為原型 改變比較原則
		for(int i=0;i<arr1.length;i++) 
			for(int j=0;j<i;j++) 
				if(arr1[i]%10<arr1[j]%10||
						(arr1[i]%10==arr1[j]%10&&arr1[i]>arr1[j])) {
					//個位數字比較 與 如過個位數字相同比較十位數字(整個數字)
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
	}

}

```
 
	 
#### - 結果：
>![](https://i.imgur.com/6yM9OKm.png)
#### - 參考資料：


### 3. a224
#### - 題目：
>https://zerojudge.tw/ShowProblem?problemid=a224
>![](https://i.imgur.com/NYRAYWX.jpg)


#### - 問題：
一開始在測試資料時，

#### - 作法：
 ```java=
package a__;

import java.util.ArrayList;
import java.util.Scanner;

public class a224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol1();
	}
	
	static void sol1() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String ln1=sc.nextLine();
			//毒入字串
			ln1=ln1.toLowerCase();
			//將字母全部轉乘小寫
			if(ln1.equals(""))
				//若字串為空字串則是回文(題目說的?
				System.out.println("yes !");
			else if(check(ln1))
				//若check函式回傳值為true則為回文
				System.out.println("yes !");
			else System.out.println("no...");
		}
	}
	
	static boolean check(String ln1) {//檢查是否為回文
		ArrayList<Character> arr1=new ArrayList<>();
		for(int i=0;i<ln1.length();i++)
			arr1.add(ln1.charAt(i));
		//建立一個儲存字串字元的List
		boolean tf[]=new boolean[(int)'z'+1];
		//宣告一個儲存各個字母數量的陣列 全部皆為false
		for(char i='a';i<='z';i++) {
			while(arr1.indexOf(i)!=-1) {
				//tf[0]=true;
				arr1.remove(arr1.indexOf(i));
				//移除字母
				tf[i]=!tf[i];
				//如果出現偶數次變還會是原本的false
				//反之則是true
				//速度應該會比計算出現幾次再判斷危機偶數快
				//之後判斷機偶數的題目也須會這樣做
			}
		}
		
		int ch=0;
		for(boolean b:tf) 
			if(b) {
				if(ch<2)
					//若ch已經大於等於2
					//則不用再執行迴圈 小優化
					ch++;
				else break;
			}
		if(ch>1)
			//若奇數的字母數大於2
			//則回傳false (不是回文
			return false;
		return true;
	}

}

```
	 
#### - 結果：
>![](https://i.imgur.com/tSis9iu.jpg)


#### - 參考資料：
 
### 3. a225
#### - 題目：
>

#### - 問題：

#### - 作法：
 ```java={
 
```
	 
#### - 結果：
>![](https://i.imgur.com/6yM9OKm.png)
#### - 參考資料：
  
 ```java=

```