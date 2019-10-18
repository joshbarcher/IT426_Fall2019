package ceiling_fan_example.states;

import ceiling_fan_example.context.PullChain;

public class Off implements IFanState
{
    @Override
    public void pull(PullChain wrapper)
    {
        wrapper.setState(new Low());
        System.out.println("Low speed!");
    }
}
