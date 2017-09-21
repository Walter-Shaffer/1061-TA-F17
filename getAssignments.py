import time
import sys
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

username = sys.argv[1]
password = sys.argv[2]

class AssignmentDownloader():

    def __init__(self, username, password):
        self.browser = webdriver.Chrome()
        self.username = username
        self.password = password

    def fillForm(self):
        loginInpt = self.browser.find_element_by_id("username")
        loginInpt.send_keys(self.username)
        passwordInpt = self.browser.find_element_by_id("password")
        passwordInpt.send_keys(self.password)
        submitBtn = self.browser.find_element_by_name("_eventId_proceed")
        submitBtn.click()

    def duoBullshit(self):
        self.browser.switch_to.frame(self.browser.find_element_by_id("duo_iframe"))
        pushBtn = self.browser.find_element_by_class_name("auth-button")
        pushBtn.click()

    def getLabs(self):
        self.browser.get("https://clemson.instructure.com/courses/27667/assignments")
        time.sleep(2)
        labList = self.browser.find_elements_by_css_selector(".item-group-condensed:nth-of-type(1) .ig-title")
        print len(labList)
        latestLab = labList[len(labList) - 1]
        print latestLab.text
        latestLab.click()
        time.sleep(2)
        downloadBtn = self.browser.find_element_by_id("download_submission_button")
        downloadBtn.click()
        print "button clicked"
        time.sleep(20)

    def run(self):
        self.browser.maximize_window()
        self.browser.get("https://clemson.instructure.com/login/saml")
        self.fillForm()
        time.sleep(2)
        self.duoBullshit()
        time.sleep(10)
        self.getLabs()
        self.browser.close()

x = AssignmentDownloader(username, password)
x.run()
