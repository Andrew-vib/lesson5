package lesson5;

abstract public class Animal {
    String name;
    int run;
    int swim;
    int jump;

    public Animal (String name, int run, int swim, int jump){
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    void setRun (int run){
        this.run = run;
    }

     public boolean getRun (){
        boolean maxRun = true;
        return maxRun;
    }

    void setJump (int jump){
        this.jump = jump;
    }

    public boolean getJump (){
        boolean maxJump = true;
        return maxJump;
    }
    void setSwim (int swim){
        this.swim = swim;
    }

    public boolean getSwim (){
        boolean maxSwim = true;
        return maxSwim;
    }

}
