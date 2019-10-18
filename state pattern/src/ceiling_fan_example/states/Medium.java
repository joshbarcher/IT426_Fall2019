package ceiling_fan_example.states;

import ceiling_fan_example.context.PullChain;

public class Medium implements IFanState
{
    @Override
    public void pull(PullChain wrapper)
    {
        wrapper.setState(new High());
        System.out.println("High speed");
    }
}
