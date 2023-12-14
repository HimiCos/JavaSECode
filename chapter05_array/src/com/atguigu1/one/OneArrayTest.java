package com.atguigu1.one;

/**
 * 一维数组的基本使用
 *
 * @author 尚硅谷-宋红康
 * @create 12:08
 */
public class OneArrayTest {
	
	public static void main(String args[]) {
		//1. 数组的声明与初始化

		// 靜態初始化
		// 聲明
		double[] prices;
		// 初始化
		prices = new double[]{20.32, 43.21, 43.22};

		// 聲明並初始化
		// String[] foods = new String[]{"拌海蜇", "龍鬚菜", "熗冬笋", "玉蘭片"};

		// 動態初始化
		String[] foods = new String[4];

		// 其他正確寫法
		int arr[] = new int[4];
		int[] arr1 = {1, 2, 3, 4}; // 類型推斷


		//2. 数组元素的调用

		// 通過腳標的方式, 獲取數組的元素
		// 腳標的範圍從0開始, 到數組的長度-1結束
		System.out.println(prices[0]);
		System.out.println(prices[2]);

		foods[0] = "拌海蜇";
		foods[1] = "龍鬚菜";
		foods[2] = "熗冬笋";
		foods[3] = "玉蘭片";

		//3. 数组的长度
		System.out.println(prices.length); // 3
		System.out.println(foods.length); // 4


		// 4. 如何遍历数组
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i]);
		}


	}

}
