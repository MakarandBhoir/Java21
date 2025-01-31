package feature02;

sealed public class SavingAccount 
	extends Account 
//	implements IAccount
	permits AnotherSavingAccount {

}


final class AnotherSavingAccount extends SavingAccount {

}