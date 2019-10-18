package ceiling_fan_example.states;

import ceiling_fan_example.context.PullChain;

public class High implements IFanState
{
    @Override
    public void pull(PullChain wrapper)
    {
        wrapper.setState(new Off());
        System.out.println("Fan off");
    }
}
