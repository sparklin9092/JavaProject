package my_case;

public class Case_1 {

	/**
	 * 某個interface，
	 * 有一個抽象方法intToString，
	 * 需要傳入int資料型態，
	 * 返回String資料型態。
	 */
	public interface MyPrint {
		String intToString(int i);
	}

	public static void main(String[] args) {
		// 實作一
	    MyPrint mp1 = (int i) -> { return i+"_mp1"; };
	    System.out.println("實作一 : " + mp1.intToString(123));
	    // 輸出結果：123_mp1
	    
	    // 實作二
	    // 優化實作一，省略參數類型int
	    MyPrint mp2 = (i) -> { return i+"_mp2"; };
	    System.out.println("實作二 : " + mp2.intToString(123));
	    
	    // 實作三
	    // 優化實作二，只有一個參數時，可以省略小括號()
	    MyPrint mp3 = i -> { return i+"_mp3"; };
	    System.out.println("實作三 : " + mp3.intToString(123));
	    
	    // 實作四
	    // 優化實作三，只有一行處理過程時，可以省略大括號{} & return
	    MyPrint mp4 = i -> i+"_mp4";
	    System.out.println("實作四 : " + mp4.intToString(123));
	}
}
