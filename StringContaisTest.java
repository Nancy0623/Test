package com.test;
/*
 * 实现两个数组合并
 * */

import java.util.Arrays;
 
public class StringContaisTest {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] A = {"a","dc","e","56","df"};
		String[] B = {"tom","Nancy"};
		
		int Alength = A.length;
		int Blength = B.length;
		
		A = Arrays.copyOf(A, Alength+Blength); //把数组A扩容
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//src从第srcPos个元素开始，复制到dest，dest以第destPos个元素开始，复制长度为length的src的数据
		System.arraycopy(B, 0, A, Alength, Blength);
		//把合并后的数组A转换字符串给输出
		System.out.println(Arrays.toString(A));
	}
 
}
