package tv.state;

import tv.context.TVContext;

public class TVStopState implements State{
    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }
    @Override
    public void pressPowerButton(TVContext context){
        System.out.println("Turning TV on");
        context.setState(new TVStartState());
    }
}
