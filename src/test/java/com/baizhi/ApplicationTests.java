package com.baizhi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("liusaiyu");
        String [] str ={"aa","bb"};
        for (int i =0 ; i<str.length; i++){
            String s = str[i];
            System.out.println(s);
        }
    }

}
