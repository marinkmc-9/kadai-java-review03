package baseball;

public class Review03 {

    public static void main(String[] args) {

        BaseBallTeam name01 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);

        BaseBallTeam name02 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);

        BaseBallTeam name03 = new BaseBallTeam("阪神タイガース", 68, 71, 4);

        BaseBallTeam name04 = new BaseBallTeam("読売ジャイアンツ", 68, 72 ,3);

        BaseBallTeam name05 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);

        BaseBallTeam name06 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        //勝敗情報を表示
        name01.report();
        name02.report();
        name03.report();
        name04.report();
        name05.report();
        name06.report();

    }

}
