package camt.se234.lab10;

import camt.se234.lab10.service.GradeServiceImpl;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


@RunWith(JUnitParamsRunner.class)
public class GradeServiceImplTest {

    public Object paramsForTestGetGradeParams(){
        return new Object[][]{
                {100,"A"},
                {77,"B"}
        };
    }


   @Test
   @Parameters(method = "paramsForTestGetGradeParams")
   @TestCaseName("Tes getGrade Params [{index}] : input is {0}, expect \"{1}\"")
   public void testGetGradeparams(double score,String expectedGrade){
       GradeServiceImpl gradeService = new GradeServiceImpl();
       assertThat(gradeService.getGrade(score),is(expectedGrade));
   }
}
