package org.example;

import org.junit.Assert;
import org.junit.Test;

public class TestDemo {
    @Test
    public void Test(){
        speak s = new speak();
        String ret = s.Say("chenghao");
        Assert.assertEquals("Hellochenghao",ret);
    }

}
