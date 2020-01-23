import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.linkedin.com/')

WebUI.click(findTestObject('Linkedin/Page_LinkedIn Log In or Sign Up/LoginButton'))

WebUI.setText(findTestObject('Linkedin/Page_LinkedIn Login Sign in  LinkedIn/Username'), 'thota.chandu1@gmail.com')

WebUI.setEncryptedText(findTestObject('Linkedin/Page_LinkedIn Login Sign in  LinkedIn/Password'), 'nWHYVv4nsj2WiYo1tzj8JA==')

WebUI.click(findTestObject('Linkedin/Page_LinkedIn Login Sign in  LinkedIn/SigninButton'))

WebUI.click(findTestObject('Linkedin/Page_(11) LinkedIn/HomeButton'))

WebUI.setText(findTestObject('Linkedin/Page_(11) LinkedIn/SearchTextBox'), 'QA Engineer Hyderabad')

WebUI.sendKeys(findTestObject('Linkedin/Page_(11) LinkedIn/SearchTextBox'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Linkedin/Page_QA Engineer Hyderabad  Search  LinkedIn/ContentFeed'))

WebUI.click(findTestObject('Linkedin/Page_(11) QA Engineer Hyderabad  Search  LinkedIn/SortBy'))

not_run: WebUI.click(findTestObject('Linkedin/Page_(11) QA Engineer Hyderabad  Search  LinkedIn/LatestButton'))

