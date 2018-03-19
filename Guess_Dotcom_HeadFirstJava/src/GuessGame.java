public class GuessGame {
    int guess_num = 0;
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
            if (Com[0].check_hit(user_input))
                    guess_num++;
            if (Com[1].check_hit(user_input))
                    guess_num++;
            if (Com[2].check_hit(user_input))
                    guess_num++;
            System.out.println(guess_num+" of 3 com have been hit.");
        }
        System.out.println("The game is ended.");
    }
}
