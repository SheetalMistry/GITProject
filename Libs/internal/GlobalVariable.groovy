package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object TimeOut_3
     
    /**
     * <p></p>
     */
    public static Object TimeOut_5
     
    /**
     * <p></p>
     */
    public static Object TimeOut_10
     
    /**
     * <p></p>
     */
    public static Object TimeOut_20
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['TimeOut_3' : 3, 'TimeOut_5' : 5, 'TimeOut_10' : 10, 'TimeOut_20' : 20])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        TimeOut_3 = selectedVariables['TimeOut_3']
        TimeOut_5 = selectedVariables['TimeOut_5']
        TimeOut_10 = selectedVariables['TimeOut_10']
        TimeOut_20 = selectedVariables['TimeOut_20']
        
    }
}
