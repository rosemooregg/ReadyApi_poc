import java.util.Random

// Function to generate random telephone number
def generateRandomPhoneNumber() {
    def phoneNumber = "555-${(1000..9999).collect{new Random().nextInt(10)}.join()}"
    return phoneNumber
}

// Function to generate a random credit card number (dummy data)
def generateRandomCreditCard() {
    def creditCardNumber = "4111-1111-1111-1111"
    def expirationDate = "12/25"  // Expiry date > 2025
    return [creditCardNumber, expirationDate]
}

// Function to generate a random driver's age
def generateRandomDriversAge() {
    def age = (11..15).collect{new Random().nextInt(5) + 11}.join()  // 11 to 15 years
    return age
}

// Function to generate a random insurance number
def generateRandomInsuranceNumber() {
    def insuranceNumber = (1000000000..9999999999).collect{new Random().nextInt(10)}.join()  // 10 digits
    return insuranceNumber
}

// Function to generate a birthday date > 21 years ago
def generateRandomBirthday() {
    def currentYear = Calendar.getInstance().get(Calendar.YEAR)
    def birthYear = currentYear - (21..40).collect{new Random().nextInt(20) + 21}.join()
    return "01/01/${birthYear}"
}

// Generate random values
def randomPhoneNumber = generateRandomPhoneNumber()
def [randomCreditCardNumber, randomExpirationDate] = generateRandomCreditCard()
def randomDriversAge = generateRandomDriversAge()
def randomInsuranceNumber = generateRandomInsuranceNumber()
def randomBirthday = generateRandomBirthday()

// Print the generated values
println("Generated Telephone Number: ${randomPhoneNumber}")
println("Generated Credit Card Number: ${randomCreditCardNumber}")
println("Generated Expiration Date: ${randomExpirationDate}")
println("Generated Driver's Age: ${randomDriversAge}")
println("Generated Insurance Number: ${randomInsuranceNumber}")
println("Generated Birthday: ${randomBirthday}")
