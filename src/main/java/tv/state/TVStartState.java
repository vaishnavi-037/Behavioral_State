package tv.state;

import tv.context.TVContext;

public class TVStartState implements State{
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
    @Override
    public void pressPowerButton(TVContext context){
        System.out.println("Turning TV off");
        context.setState(new TVStopState());
    }
}
