Digital Password Lock 🔐
Project Overview

The Digital Password Lock is a Java-based security system that provides access only when the correct password is entered. The system allows a maximum of three password attempts and locks the system after three consecutive incorrect attempts.

Features
Password-based access control
Three-attempt security limit
Access granted for the correct password
Access denied for an incorrect password
Automatic system lock after three failed attempts
Java testbench for verification
Simulation output for different test cases
Technologies Used
Java
Object-Oriented Programming concepts
Console-based simulation
Password

The default password used in this project is:

1234

Working Principle
The user enters a password.
The entered password is compared with the stored password.
If the password is correct, access is granted.
If the password is incorrect, access is denied.
The user gets a maximum of three attempts.
After three incorrect attempts, the system becomes locked.
Project Structure
Digital-Password-Lock/
├── README.md
├── DigitalPasswordLock.java
├── DigitalPasswordLockTest.java
└── simulation-output.txt

How to Run
Compile the main program
javac DigitalPasswordLock.java

Run the program
java DigitalPasswordLock

Compile the testbench
javac DigitalPasswordLockTest.java

Run the testbench
java DigitalPasswordLockTest

Example
================================
     DIGITAL PASSWORD LOCK
================================
Enter Password: 1111
ACCESS DENIED
Attempts remaining: 2

Enter Password: 1234
ACCESS GRANTED
================================
Door Unlocked Successfully!

Test Cases
Test Case	Input	Expected Result
1	1234	ACCESS GRANTED
2	1111	ACCESS DENIED
3	5678	ACCESS DENIED
4	9999 on 3rd attempt	SYSTEM LOCKED
Applications
Door security systems
Digital lockers
Computer access control
Electronic security systems
Password-protected devices
Future Improvements
Add password change functionality
Add username authentication
Add graphical user interface
Store encrypted passwords
Add administrator reset functionality
Conclusion

The Digital Password Lock demonstrates a simple password-based access-control system using Java. It shows how password verification and limited login attempts can be implemented to improve security.

Author

Digital Password Lock Project

Developed using Java for educational purposes.
