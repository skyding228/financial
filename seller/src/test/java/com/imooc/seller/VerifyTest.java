package com.imooc.seller;

import com.imooc.seller.service.VerifyService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 对账测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VerifyTest {
    @Autowired
    private VerifyService verifyService;
    @Test
    public void makeVerificationTest(){
        Date day = new GregorianCalendar(2017,0,1).getTime();
        File file = verifyService.makeVerificationFile("111",day);
        System.out.println(file.getAbsolutePath());
    }
    @Test
    public void saveVerificationOrders(){
        Date day = new GregorianCalendar(2017,0,1).getTime();
        verifyService.saveChanOrders("111",day);
    }
}