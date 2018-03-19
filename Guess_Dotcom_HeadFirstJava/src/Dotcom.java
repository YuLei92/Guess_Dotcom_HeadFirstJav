public class Dotcom {
    private int locate_number = (int) (Math.random()*10);
    private boolean hit_label = false;

    public int get_locate(){
        return locate_number;
    }
    public boolean get_hit(){
        return hit_label;
    }
    public boolean check_hit(String user_inputs){
        int input_num = Integer.parseInt(user_inputs);
        if (input_num == locate_number && !hit_label) {
            hit_label = true;
            System.out.println("Your guess is true.");
            return true;
        }else{
            return  false;
        }
    }
}
