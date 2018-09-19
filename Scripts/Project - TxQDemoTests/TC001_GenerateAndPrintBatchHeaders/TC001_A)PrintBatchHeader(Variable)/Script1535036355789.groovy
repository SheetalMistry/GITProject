import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream as webkitMediaStream
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
import org.openqa.selenium.WebDriver as WebDriver
import org.omg.CORBA.OBJECT_NOT_EXIST as OBJECT_NOT_EXIST
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import javax.swing.JFrame as JFrame
import javax.swing.JOptionPane as JOptionPane
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQucWeb_LeiSS_Test/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_TxQ Demo'))

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_File'))

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_Generate batch headers'))

WebUI.comment('Select a category')

WebUI.selectOptionByLabel(findTestObject('TxQDemoTest/TxQDemo/select_--Please Select--Busine'), categry, true)

WebUI.delay(1)

WebUI.comment('Select a sub category')

WebUI.selectOptionByLabel(findTestObject('TxQDemoTest/TxQDemo/select_--Please Select--Busine_1'), subcategory, true)

//WebUI.selectOptionByLabel(findTestObject('null'), subcategory, true)
WebUI.sendKeys(findTestObject('TxQDemoTest/TxQDemo/input_ng-untouched ng-valid ng_record'), record)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('TxQDemoTest/TxQDemo/input_ng-untouched ng-valid ng_rescan'), rescan)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('TxQDemoTest/TxQDemo/input_ng-untouched ng-valid ng_cheque'), cheque)

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/button_Generate'))

WebUI.delay(3)

WebUI.takeScreenshot()

not_run: dd()

def dd() {
    not_run: Runtime runTime = Runtime.getRuntime()

    not_run: Process process = runTime.exec('C:\\Users\\RR279339\\Documents\\Projects\\print.exe')
}

