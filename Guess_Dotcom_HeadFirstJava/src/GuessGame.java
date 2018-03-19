public class GuessGame {
    Dotcom c1;
    Dotcom c2;
    Dotcom c3;

    public void startGame() {
        Dotcom[] Com;
        Com = new Dotcom[3];
        Com[0] = new Dotcom();
        Com[1] = new Dotcom();
        Com[2] = new Dotcom();
        GameHelper Helper = new GameHelper();
        String user_input;
        System.out.println("The game is started.");
        while (!(Com[0].get_hit() && Com[1].get_hit() && Com[2].get_hit())) {
            user_input = Helper.getUserInput("Enter a number");
            Com[0].check_hit(user_input);
            Com[1].check_hit(user_input);
            Com[2].check_hit(user_input);
        }
        System.out.println("The game is ended.");
    }
}
