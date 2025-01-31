package feature02;

public sealed abstract class Account 
		implements IAccount 
		permits SavingAccount, CurrentAccount {

}
