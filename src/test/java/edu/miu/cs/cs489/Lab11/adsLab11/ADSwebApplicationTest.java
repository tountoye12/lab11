package edu.miu.cs.cs489.Lab11.adsLab11;

import edu.miu.cs.cs489.Lab11.adsLab11.ArrayTest.ArrayFlattenerTest;
import edu.miu.cs.cs489.Lab11.adsLab11.ArrayTest.ArrayReversorTestCases;
import edu.miu.cs.cs489.Lab11.adsLab11.Patient.PatientControllerTest;
import edu.miu.cs.cs489.Lab11.adsLab11.Patient.PatientServiceTest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@SuiteClasses({ PatientControllerTest.class, PatientServiceTest.class })
//@RunWith(SpringRunner.class)
public class ADSwebApplicationTest {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void contextLoads() {
    }

}
