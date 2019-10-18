package ceiling_fan_example;

import ceiling_fan_example.context.PullChain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver
{
    private static PullChain pullChain = new PullChain();

    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("Press Enter");
            getInput();
            pullChain.pull();
            System.out.println();
        }
    }

    public static String getInput()
    {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in));

        String input = null;
        try
        {
            input = in.readLine();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        return input;
    }
}
