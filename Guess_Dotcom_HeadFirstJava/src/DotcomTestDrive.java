public class DotcomTestDrive {
    public static void main (String[] args){
        Dotcom com1 = new Dotcom();
        System.out.println(com1.get_locate());
        System.out.println(com1.get_hit());
        GameHelper Helper = new GameHelper();
        String user_input = Helper.getUserInput("Enter a number");
        while(true){
            user_input = Helper.getUserInput("Enter a number");
            if(com1.check_hit(user_input))
                break;
        }
        System.out.println("The game is ended.");
    }
}
