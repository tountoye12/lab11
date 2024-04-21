package edu.miu.cs.cs489.Lab11.adsLab11;

import edu.miu.cs.cs489.Lab11.adsLab11.ArrayTest.ArrayFlattenerTest;
import edu.miu.cs.cs489.Lab11.adsLab11.ArrayTest.ArrayReversorTestCases;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.boot.test.context.SpringBootTest;


@RunWith(Suite.class)
@SuiteClasses({ ArrayFlattenerTest.class, ArrayReversorTestCases.class })
public class ADScliApplicationTests {

}
