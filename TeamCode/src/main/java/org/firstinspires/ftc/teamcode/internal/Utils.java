package org.firstinspires.ftc.teamcode.internal;

public class Utils
{

    public static void sleep(long millis)
    {
        try
        {
            Thread.sleep(millis);
        } catch (InterruptedException e)
        {
            return;
        }
    }
}
