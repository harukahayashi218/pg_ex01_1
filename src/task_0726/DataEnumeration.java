package task_0726;

//1から100までの数字羅列クラス（必要に応じて変換処理）
public class DataEnumeration {

	//処理開始、結果表示
	public static void main(String[] args) {

		try {
			for(int targetNum=1; targetNum < 101; targetNum++) {
				System.out.print(createOutputData(targetNum));
			}
			System.out.println("\n完了しました。");
		}
		catch(Exception e) {
			System.out.println("エラーが発生しました。");
		}
		finally {
			System.out.println("処理を終了します。");
		}
	}

	//表示データ作成、変換処理要否判定
	public static String createOutputData(int targetNum) {

		String multipleOf3 = "△";
		String multipleOf4 = "□";
		String commonMultiple = "◆";

		int remOfDivBy3 = targetNum % 3;
		int remOfDivBy4 = targetNum % 4;

		if (remOfDivBy3 == 0 & remOfDivBy4 == 0) {
			return commonMultiple;
		}
		else if (remOfDivBy3 == 0 & !(remOfDivBy4 == 0)) {
			return multipleOf3;
		}
		else if (!(remOfDivBy3 == 0) & remOfDivBy4 == 0) {
			return multipleOf4;
		}
		else {
			return String.valueOf(targetNum);
		}
	}
}

