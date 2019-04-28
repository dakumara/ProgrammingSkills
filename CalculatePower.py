#Auuthor : Dhanushka
#This program finds the value of the Number raised to the Power

def main():
    print("Finding power....")
    # Prompt user to enter the base value.
    baseValue = input("\nPlease insert base value integer.. : ")
    # Prompt user to enter the power value.
    powerValue = input("\nPlease insert power value integer.. : ")

    # Check inputs are numbers
    if(baseValue.isnumeric() and powerValue.isnumeric()):
        # Convert strings into integers
        baseValue = int(baseValue)
        powerValue = int(powerValue)

        # Define temporary variable power
        power = 1
        # Find the power value using for loop.
        for i in range(1, powerValue + 1):
            power = power * baseValue
        print("\nPower of the inserted number is : ",power)
    # If inputs are not numbers, prompt error message.
    else:
        print("Invalid input. Try again...!")

# Redirect to main method.
main()
