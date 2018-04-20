package camt.se234.lab10;

import camt.se234.lab10.service.GradeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(JUnitParamsRunner.class)
public class GradeServiceImplTest {

    public Object paramsForTestGetGradeParams(){
        return new Object[][]{
                {100,"A"},
                {77,"B"}
        };
    }

    @Test
    @Parameters(method = "paramsForTestGetGreadeParams")
    public void testGetGradeparams(double score,String expectedGrade){
        GradeServiceImpl gradeService = new GradeServiceImpl();
        assertThat(gradeService.getGrade(score),is(expectedGrade));
    }

   @Test
   @Parameters(method = "paramsForTestGetGreadeParams")
   @TestCaseName("Tes getGrade Params [{index}] : input is {0}, expect \"{1}\"")
   public void testGetGradeparams(double score,String expectedGrade){
       GradeServiceImpl gradeService = new GradeServiceImpl();
       assertThat(gradeService.getGrade(score),is(expectedGrade));
   }
}
