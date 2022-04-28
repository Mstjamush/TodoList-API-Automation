package stepdefs;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import config.ConfigProperties;
import cucumber.api.Result;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.runtime.ScenarioImpl;
import general.GeneralFunctions;
import org.apache.commons.lang3.reflect.FieldUtils;
import tests.RunCukesTest;
import utils.Reports;

import java.lang.reflect.Field;
import java.util.ArrayList;


public class Hooks extends RunCukesTest {
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String HTTP_METHOD_POST= "post";
    public static final String HTTP_METHOD_GET= "get";
    public static final int HTTP_RESPONSE_SUCCESS= 200;
    public static final int HTTP_INTERNAL_SERVER_ERROR = 500;
    public static String caseID;
    static ExtentTest logger;
    public static Integer beforeAddingStepsLength;
    public static Integer afterAddingStepsLength;
    public static Integer beforeAddingExpectedResultLength;
    public static Integer afterAddingExpectedResultLength;
    public static String RequestPayLoad;
    public static String endPoint;

    @Before
    public static void testStart(Scenario scenario) throws Throwable {
        beforeAddingStepsLength=automationSteps.size();
        beforeAddingExpectedResultLength=expectedResults.size();
        if(ConfigProperties.isReportingEnable.toLowerCase().equals("true")) {
            logger = Reports.getExtentReport().startTest(scenario.getName(), "");
            logger.setStartedTime(GeneralFunctions.getTime());
        }


        }

    @After
    public static void testEnd(Scenario scenario) throws Throwable
    {
        afterAddingStepsLength=automationSteps.size();
        afterAddingExpectedResultLength=expectedResults.size();
        if ( scenario.getStatus() == Result.Type.FAILED ) {
            setFailCount(getFailCount()+1);
            Field field = FieldUtils.getField(((ScenarioImpl) scenario).getClass(), "stepResults", true);
            field.setAccessible(true);
            ArrayList<Result> results = (ArrayList<Result>) field.get(scenario);
            if(ConfigProperties.isReportingEnable.toLowerCase().equals("true")) {
                for (Result result : results) {
                    if (result.getError() != null)
                        logger.log(LogStatus.FAIL, "Test Case Failed reason is: " + result.getError());
                }
            }
        }
        else if (scenario.getStatus() == Result.Type.SKIPPED ) {
            setSkippedCount(getSkippedCount()+1);
            if(ConfigProperties.isReportingEnable.toLowerCase().equals("true"))
            logger.log(LogStatus.SKIP, "Test Case Skipped is: ");

        }
        else {
            setPassCount(getPassCount()+1);
            if(ConfigProperties.isReportingEnable.toLowerCase().equals("true"))
            logger.log(LogStatus.PASS, scenario.getName() + " is Passed");
        }

        if(ConfigProperties.isReportingEnable.toLowerCase().equals("true"))
        Reports.getExtentReport().endTest(logger);

    }


}