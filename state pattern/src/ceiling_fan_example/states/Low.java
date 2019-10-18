package ceiling_fan_example.states;

import ceiling_fan_example.context.PullChain;

public class Low implements IFanState
{
    @Override
    public void pull(PullChain wrapper)
    {
        wrapper.setState(new Medium());
        System.out.println("Medium speed");
    }
}
