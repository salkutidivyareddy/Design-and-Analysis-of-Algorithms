/*5. Case study : Bank Management System
SBI Bank had two branches Basar and Nizambad each with 5 customers, uniquely identified by
their Branch_name and Acct_No. Implement an application that prompts account holders to
enter user name(Branch_name) and password(Acct_No), on successful authorization they can
perform following transactions, after every exit( ) , the application should ask for
Exit_application(Yes/No), on Yes exit from application on No prompt for New user credentials.
Create a class Account with an instance variable balance (double). It should contain a
constructor that initializes the balance, ensure that the initial balance is
greater than 1000.0
Account details : Bank_Name, Branch_Name, Acct_Name, Acct_No, Acct_Bal,
Acct_Address.
Create four methods namely credit( ), debit( ), getBalance( ) and exit().
The credit( ) adds the amount (passed as parameter) to balance and does not return any
data. debit( ) withdraws money from an Account, getBalance displays the
amount, exit() exits from the individual Transaction.
Note :
Ensure that the debit amount does not exceed the Account’s balance, in that case the
balance should be left unchanged and the method should print an alert message as
“Debit amount exceeded account balance”.*/
