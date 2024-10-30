package tv.state;

import tv.context.TVContext;

public interface State {
    void doAction();
    void pressPowerButton(TVContext context);
}
