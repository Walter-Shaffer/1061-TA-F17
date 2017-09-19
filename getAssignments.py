import time
import sys
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

username = sys.argv[1]
password = sys.argv[2]

browser = webdriver.Chrome()

def fillForm():
    loginInpt = browser.find_element_by_id("username")
    loginInpt.send_keys(username)
    passwordInpt = browser.find_element_by_id("password")
    passwordInpt.send_keys(password)
    submitBtn = browser.find_element_by_name("_eventId_proceed")
    submitBtn.click()

def login():
    browser.get("https://clemson.instructure.com/login/saml")
    fillForm()

def duoBullshit():
    browser.switch_to.frame(browser.find_element_by_id("duo_iframe"))
    pushBtn = browser.find_element_by_class_name("auth-button")
    pushBtn.click()

def getLabs():
    browser.get("https://clemson.instructure.com/courses/27667/assignments")
    labList = browser.find_elements_by_css_selector(".item-group-condensed:nth-of-type(1) .ig-title")
    print len(labList)
    latestLab = labList[len(labList) - 1]
    print latestLab.text



def run():
    login()
    time.sleep(2)
    duoBullshit()
    time.sleep(10)
    getLabs()

run()
