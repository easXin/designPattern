package cn.bugstack.design.test;

import cn.bugstack.design.ICalculationArea;
import cn.bugstack.design.impl.CalculationAreaExt;
import org.junit.Test;


public class ApiTest {


    @Test
    public void test_CalculationAreaExt(){
        ICalculationArea area = new CalculationAreaExt();
        double circular = area.circular(10);
        System.out.println(circular);
    }

}
