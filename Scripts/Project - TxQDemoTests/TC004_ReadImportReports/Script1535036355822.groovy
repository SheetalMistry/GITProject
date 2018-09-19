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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import javax.swing.JFrame as JFrame
import javax.swing.JOptionPane as JOptionPane

WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQucWeb_LeiSS_Test/connect')

WebUI.waitForPageLoad(GlobalVariable.TimeOut_3)

WebUI.maximizeWindow()

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_TxQ Demo'))

WebUI.click(findTestObject('TxQDemoTest/readreports/Page_TxQ UC Web - Job Summary/a_Reports'))

WebUI.click(findTestObject('TxQDemoTest/readreports/Page_TxQ UC Web - Job Summary/a_User Reports'))

not_run: WebUI.delay(3)

WebUI.setText(findTestObject('TxQDemoTest/readreports/Page_TxQ UC Web - User Reports/input_form-control ng-pristine_from'), 
    '2018-07-05')

WebUI.setText(findTestObject('TxQDemoTest/readreports/Page_TxQ UC Web - User Reports/input_form-control ng-pristine_to'), 
    '2018-07-18')

WebUI.selectOptionByValue(findTestObject('TxQDemoTest/readreports/Page_TxQ UC Web - User Reports/select_--Please Select--'), 
    'ImportDetail', true)

WebUI.click(findTestObject('TxQDemoTest/readreports/Page_TxQ UC Web - User Reports/button_Generate Report'))

WebUI.delay(5)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//table/tbody' //'To locate table'
        ))

List<WebElement> rows_table = Table.findElements(By.tagName('tr' //'To locate rows of table it will Capture all the rows available in the table'
        ))

int rows_count = rows_table.size( //'To calculate no of rows In table'
    )

int row_count_display = rows_count - 1

JFrame frame = new JFrame()

frame.requestFocus()

//frame.setPreferredSize(500,500)
String url = JOptionPane.showMessageDialog(frame, ' The total number of records in the import report is ' + row_count_display)

JFrame frame1 = new JFrame( // Prompt user to enter a task name to search in report
)

frame1.requestFocus()

//frame.setPreferredSize(500,500)
String Task_Number = JOptionPane.showInputDialog(frame, ' Enter A task name to search ')

boolean TaskFound = false

//'Loop will execute for all the rows of the table'
Loop: for (int row = 0; row < rows_count; row++) {
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td' //'To locate columns(cells) of that specific row'
            ))

    int columns_count = Columns_row.size( //'To calculate no of columns(cells) In that specific row'
        )

    for (int column = 0; column < columns_count; column++ //'Loop will execute till the last cell of that specific row'
    ) {
        int column_display = column + 1

        String celltext = Columns_row.get(column).getText( //'It will retrieve text from each cell'
            )

        if (celltext == Task_Number) //'Checking if Cell text is matching with the expected value'
        {
            JFrame frame2 = new JFrame()

            frame2.requestFocus()

            TaskFound = true

            //frame.setPreferredSize(500,500)
            JOptionPane.showMessageDialog(frame2, (((Task_Number + ' Found At row ') + row) + ' And at Column ') + column_display)

            break
        }
    }
}

if (TaskFound == false) {
    JFrame frame3 = new JFrame()

    frame3.requestFocus()

    JOptionPane.showMessageDialog(frame3, Task_Number + ' not found')
}

