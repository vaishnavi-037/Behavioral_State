package tv.context;

import tv.state.State;
import tv.state.TVStopState;

public class TVContext {
    private State tvState;

    public TVContext() {
        this.tvState = new TVStopState();
    }

    public void setState(State state) {
        this.tvState = state;
    }

    public State getState() {
        return tvState;
    }

    public void pressPowerButton(){
        System.out.println("-------------------STARTING--------------------");
        tvState.doAction();
        tvState.pressPowerButton(this);
        tvState.doAction();
        System.out.println("---------------------ENDING------------------");
        System.out.println();
    }
}
