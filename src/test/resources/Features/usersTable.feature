Feature: Test the Users tab functionality of Vishnu

Scenario: Administrator attempts to open Users Table
Given Project Table page is opened
When User clicks Users tab
Then Users Table page is opened
And "Users" label appears as a table name
And Table has columns in next order: "Name","Vendor","Email","Role","Status"