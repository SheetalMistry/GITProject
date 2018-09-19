import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQWeb_LeiSS_Test/connect')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_TxQ Demo'))

WebUI.delay(2)

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_Indexing (271)'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('TxQDemoTest/TxQDemo/select_--Please Select--Busine'), 'string:BAC', true)

WebUI.selectOptionByValue(findTestObject('TxQDemoTest/TxQDemo/subcategory'), 'string:BOA', true)

WebUI.setText(findTestObject('TxQDemoTest/TxQDemo/div_Post Code_1'), 'HR8 1AL')

WebUI.setText(findTestObject('TxQDemoTest/TxQDemo/div_Account No'), '10292827')

WebUI.setText(findTestObject('TxQDemoTest/TxQDemo/div_Sort Code'), '211238')

WebUI.setText(findTestObject('TxQDemoTest/TxQDemo/div_CIS No'), '1728372891')

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/Complete Button'))

WebUI.delay(3)

not_run: dd()

def dd() {
    not_run: Runtime runTime = Runtime.getRuntime()

    not_run: Process process = runTime.exec('C:\\Users\\RR279339\\Documents\\Projects\\print.exe')
}



