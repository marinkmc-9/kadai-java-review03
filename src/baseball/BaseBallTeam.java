package baseball;

public class BaseBallTeam {

    private String name; // 球団の名前
    private int win; // 勝利
    private int lose; // 敗戦
    private int draw; // 引き分け

    // 引数なしコンストラクタ
    public BaseBallTeam() {

    }

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;

    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    // 勝率
    public double getRate() {
        double rate = this.win / (double) (this.win + this.lose);
        return rate;
    }

    // ○○ の2022年の成績は △△勝 □□敗 ☆☆分、勝率は 0.▽▽▽▽▽▽です。と表示する
    public void report() {
        System.out.println(this.getName() + "の2022年の成績は" + this.getWin() + "勝" + this.getLose() + "敗" + this.getDraw()
                + "分、" + "勝率は" + this.getRate() + "です。");

    }
}
