*** Settings ***
Library         SeleniumLibrary
Default Tags    Functional
Test Setup      Open Browser To Login Page
Test Teardown   Close Browser

*** Test Cases ***
TestCase 1 - ValidLoginTest
    Login Page Should Pass
    Input Username                kowciya97
    Input Password                C53LLE
    Sleep                         ${timer} 
    Submit Credentials   
    Sleep                         ${timer}  
    
TestCase 2 - Enter Invalid Username
    Input Username                kowciya
    Input Password                C53LLE
    Sleep                         ${timer} 
    Submit Credentials   
    Sleep                         ${timer}
    Login Page Should Fail
    
TestCase 3 - Enter Invalid Password
    Input Username                kowciya97
    Input Password                C53LLG
    Sleep                         ${timer} 
    Submit Credentials   
    Sleep                         ${timer}
    Login Page Should Fail
    
TestCase 4 - Enter Null Value In Username Text Field
    Input Password                C53LLE
    Sleep                         ${timer} 
    Submit Credentials   
    Sleep                         ${timer}
    Login Page Should Fail For Null Username
    
TestCase 5 - Enter Null Value In Password Text Field
    Input Username                kowciya97
    Sleep                         ${timer} 
    Submit Credentials   
    Sleep                         ${timer}
    Login Page Should Fail For Null Password
    
TestCase 6 - Sanity Test
    [Tags]                        Sanity
    Log To Console                This is the Test    



*** Variables ***
${LandingURL}                     https://adactinhotelapp.com/
${LoginURL}                       ${LandingURL}
${Browser}                        chrome
${timer}                          3
${LoginTitle}                     Adactin.com - Hotel Reservation System
${errorMessage_1}                 Invalid Login details or Your Password might have expired. 
${errorMessage_2}                 Enter Username
${errorMessage_3}                 Enter Password



*** Keywords ***
Open Browser To Login Page
    Open Browser                  ${LandingURL}    ${Browser}
    Maximize Browser Window
    Set Browser Implicit Wait     4

Login Page Should Pass
    Location Should Be            ${LandingURL}    
    Title Should Be               ${LoginTitle}  
     
Login Page Should Fail
    Element Should Contain        //b[contains(text(),'Invalid Login details or Your Password might have ')]    ${errorMessage_1} 
    
Login Page Should Fail For Null Username 
    Element Should Contain        //span[contains(text(),'Enter Username')]                                     ${errorMessage_2}
    
Login Page Should Fail For Null Password
    Element Should Contain        //span[contains(text(),'Enter Password')]                                     ${errorMessage_3}    
           

Input Username
    [Arguments]                   ${username}
    Input Text                    username         ${username}   
Input Password
    [Arguments]                   ${password}
    Input Text                    password         ${password}
Submit Credentials
    Click Button                  login 
    
    