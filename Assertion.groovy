// Get the URL from the project suite property
def url = testRunner.testCase.testSuite.project.getPropertyValue("URL")

// Make an HTTP GET request to the URL
def response = new groovyx.net.http.RESTClient(url).get()

// Extract the response code from the HTTP response
def responseCode = response.status

// Define the expected response codes
def expectedResponseCodes = [200, 404, 500]

// Perform assertions
if (expectedResponseCodes.contains(responseCode)) {
    log.info("Response code is valid: $responseCode")
    testRunner.testCase.setPropertyValue("ResponseCode", responseCode.toString())
} else {
    log.error("Response code is invalid: $responseCode")
    testRunner.testCase.setPropertyValue("ResponseCode", responseCode.toString())
}

// You can add more assertions here as needed
