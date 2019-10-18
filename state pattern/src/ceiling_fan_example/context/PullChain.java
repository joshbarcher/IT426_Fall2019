package ceiling_fan_example.context;

import ceiling_fan_example.states.IFanState;
import ceiling_fan_example.states.Off;

//the context class
public class PullChain
{
    private IFanState currentState;

    public PullChain()
    {
        currentState = new Off();
    }

    public void setState(IFanState state)
    {
        currentState = state;
    }

    public void pull()
    {
        currentState.pull(this);
    }
}
