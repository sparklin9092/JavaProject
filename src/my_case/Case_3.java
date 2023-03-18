package my_case;

import java.util.Optional;

public class Case_3 {
	
	public static void print(String str) {
		System.out.println(str.toLowerCase());
	}

	public static void main(String[] args) {
		String tempStr = null;
		Optional.ofNullable(tempStr).ifPresent(s -> print(s)); // 不會輸出任何結果
		
		String tempStr2 = "JAVA";
		Optional.ofNullable(tempStr2).ifPresent(s -> print(s)); // 輸出 "java"
	}
}
