package lesson5;

public class Dog extends Animal {

    private double dog_jump;

    public Dog(String name, int run, int swim, int jump, double dog_jump){
        super(name, run, swim, jump);
        this.dog_jump = dog_jump;

    }
    @Override
    void setRun (int run){
        this.run = run;
    }
    @Override
    public boolean getRun (){
        boolean maxRun = true;
        if (run > 2){
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
        if (swim > 10){
            maxSwim = false;
        }
        return maxSwim;
    }

    void setJump (double dog_jump){
        this.dog_jump = dog_jump;
    }
    @Override
    public boolean getJump (){
        boolean maxJump = true;
        if (dog_jump > 0.5){
            maxJump = false;
        }
        return maxJump;
    }
}
