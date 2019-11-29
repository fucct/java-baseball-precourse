import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {
    public static void main(String[] args) {
        while(true) {
            Batter computer = new Batter();
            Pitcher user;
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            user = new Pitcher(n);

            while (computer.game(user) != true) {
                n = s.nextInt();
                user = new Pitcher(n);
            }
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로시작하려면 1, 종료하려면 2를 입력하세요");
            int cont = s.nextInt();
            if (cont == 1) {
                continue;
            } else return;
        }


    }
}
