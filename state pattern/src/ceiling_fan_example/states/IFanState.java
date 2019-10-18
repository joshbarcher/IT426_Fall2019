package ceiling_fan_example.states;

import ceiling_fan_example.context.PullChain;

public interface IFanState
{
    public void pull(PullChain wrapper);
}
