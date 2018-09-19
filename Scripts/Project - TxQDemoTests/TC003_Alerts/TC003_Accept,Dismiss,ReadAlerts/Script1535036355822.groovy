import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import javax.swing.JFrame as JFrame
import javax.swing.JOptionPane as JOptionPane
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

'Delete Active session'
WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQWeb_LeiSS_Test')

WebUI.closeBrowser()

WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQUCWeb_LeiSS_Test/connect')

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_TxQ Demo'))

WebUI.delay(1)

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Job Summary/a_Administration'))

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Job Summary/a_Unlock sessions'))

WebUI.check(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Unlock Sessions/input_ng-pristine ng-untouched'))

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Unlock Sessions/button_Unlock Selected Session'))

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Unlock Sessions/button_OK'))

WebUI.closeBrowser()

'script to Accept an Alert'
WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQWeb_LeiSS_Test')

WebUI.maximizeWindow()

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_TxQ Demo'))

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_Indexing (271)'))

WebUI.delay(3)

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_Task'))

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_Search for tasks Alts'))

WebUI.delay(4)

WebUI.acceptAlert()

WebUI.takeScreenshot()

JFrame frame = new JFrame()

frame.requestFocus()

JOptionPane.showMessageDialog(frame, 'Alert Accepted ')

WebUI.delay(2)

WebUI.closeBrowser()

'Delete Active session'
WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQWeb_LeiSS_Test')

WebUI.closeBrowser()

WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQUCWeb_LeiSS_Test/connect')

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_TxQ Demo'))

WebUI.delay(1)

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Job Summary/a_Administration'))

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Job Summary/a_Unlock sessions'))

WebUI.check(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Unlock Sessions/input_ng-pristine ng-untouched'))

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Unlock Sessions/button_Unlock Selected Session'))

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Unlock Sessions/button_OK'))

WebUI.closeBrowser()

'Script to Dismiss an Alert'
WebUI.delay(6)

WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQWeb_LeiSS_Test')

WebUI.maximizeWindow()

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_TxQ Demo'))

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_Indexing (271)'))

WebUI.delay(3)

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_Task'))

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_Search for tasks Alts'))

WebUI.delay(4)

WebUI.dismissAlert()

JFrame frame1 = new JFrame()

frame1.requestFocus()

JOptionPane.showMessageDialog(frame, 'Alert Dismissed ')

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.delay(6)

'Delete Active session'
WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQWeb_LeiSS_Test')

WebUI.closeBrowser()

WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQUCWeb_LeiSS_Test/connect')

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Connect/a_TxQ Demo'))

WebUI.delay(1)

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Job Summary/a_Administration'))

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Job Summary/a_Unlock sessions'))

WebUI.check(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Unlock Sessions/input_ng-pristine ng-untouched'))

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Unlock Sessions/button_Unlock Selected Session'))

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Unlock Sessions/button_OK'))

WebUI.closeBrowser()

'Script to capture an Alert message'
WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQWeb_LeiSS_Test')

WebUI.maximizeWindow()

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_TxQ Demo'))

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_Indexing (271)'))

WebUI.delay(3)

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_Task'))

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_Search for tasks Alts'))

WebUI.delay(4)

driver = DriverFactory.getWebDriver()

String AlertText = driver.switchTo().alert().getText()

//WebUI.verifyTextPresent(AlertText, false, FailureHandling.STOP_ON_FAILURE) 
println(AlertText)

JFrame frame2 = new JFrame()

frame2.requestFocus()

JOptionPane.showMessageDialog(frame, 'Alert message is ' + AlertText)

WebUI.verifyNotMatch(AlertText, 'Do you want to close task DEMO_2018071900030084 without save?', false)

WebUI.closeBrowser()

