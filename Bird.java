package lesson5;

public class Bird extends Animal {

    private double bird_jump;

    public Bird(String name, int run, int swim, int jump, double bird_jump){
        super(name, run, swim, jump);
        this.bird_jump = bird_jump;

    }
    @Override
    void setRun (int run){
        this.run = run;
    }
    @Override
    public boolean getRun (){
        boolean maxRun = true;
        if (run > 5){
            maxRun = false;
        }
        return maxRun;
    }

    @Override
    void setSwim (int swim){
        this.swim = swim;
    }
    @Override
    public boolean getSwim (){
        boolean maxSwim = true;
        if (swim > 0){
            maxSwim = false;
        }
        return maxSwim;
    }


    void setJump (double bird_jump){
        this.bird_jump = bird_jump;
    }
    @Override
    public boolean getJump (){
        boolean maxJump = true;
        if (bird_jump > 0.2){
            maxJump = false;
        }
        return maxJump;
    }

}
