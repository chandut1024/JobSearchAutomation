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

WebUI.navigateToUrl('https://twitter.com/')

WebUI.click(findTestObject('Twitter/LoginButton'))

WebUI.setText(findTestObject('Twitter/Username'), 'thota.chandu1@gmail.com')

WebUI.click(findTestObject('Twitter/Password'))

WebUI.setEncryptedText(findTestObject('Twitter/Password'), 'nWHYVv4nsj2WiYo1tzj8JA==')

WebUI.click(findTestObject('Twitter/SigninButton'))

WebUI.setText(findTestObject('Twitter/SearchTextbox'), 'QA Engineer Hyderabad')

WebUI.sendKeys(findTestObject('Twitter/SearchTextbox'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Twitter/Latestfeed'))

WebUI.delay(120)

not_run: WebUI.click(findTestObject('Twitter/HomeButton'))

