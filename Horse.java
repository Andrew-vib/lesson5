package lesson5;

public class Horse extends Animal {

    public Horse(String name, int run, int swim, int jump){
        super(name, run, swim, jump);

    }
    @Override
    void setRun (int run){
        this.run = run;
    }
    @Override
    public boolean getRun (){
        boolean maxRun = true;
        if (run > 1300){
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
        if (swim > 100){
            maxSwim = false;
        }
        return maxSwim;
    }

    @Override
    void setJump (int jump){
        this.jump = jump;
    }
    @Override
    public boolean getJump (){
        boolean maxJump = true;
        if (jump > 1){
            maxJump = false;
        }
        return maxJump;
    }
}
