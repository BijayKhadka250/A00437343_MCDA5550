package assignment;

import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		
		char option;
		
		new SimpleLogger();
		
		try {
			do {
				
				SimpleLogger.logger.info("Transaction Types"+"\n"+"1. Select"+"\n"+"2. Insert"+"\n"+"3. Update"+"\n"+"4. Delete"+"\n"+"5. Exit");
				SimpleLogger.logger.info("Enter the Transaction type [1-5]:");
				int choice = TransactionMethods.scannerMethod().nextInt();
				SimpleLogger.logger.info(String.valueOf(choice));
				switch (choice) {
					case 1:
	//					System.out.println("Enter transaction Id: ");
						SimpleLogger.logger.info("You're going to select data:");
	
						SimpleLogger.logger.info("Enter transaction Id: ");
						int txnId = TransactionMethods.scannerMethod().nextInt();
	
						if (TransactionMethods.selectMethod(txnId)) {
							SimpleLogger.logger.info("success");
						} else {
	//						System.out.println("no such data found:");
							SimpleLogger.logger.info("no such data found:");
						}
						break;
	
					case 2:
						SimpleLogger.logger.info("Insert Transaction:");
	//					System.out.println("Enter Transaction ID: ");
						SimpleLogger.logger.info("Enter Transaction ID: ");
						int insertId = TransactionMethods.scannerMethod().nextInt();
						TransactionMethods.insertMethod(insertId);
						break;
						
					case 3:
						SimpleLogger.logger.info("update Transaction: ");
	//					System.out.println("Enter userID to update: ");
						SimpleLogger.logger.info("Enter userID to update: ");
						int updateId = TransactionMethods.scannerMethod().nextInt();
						TransactionMethods.updateMethod(updateId);
						break;
						
					case 4:
	//					System.out.println("delete Transaction: ");
						SimpleLogger.logger.info("delete Transaction: ");
						try {
							if (TransactionMethods.deleteMethod()) {
								SimpleLogger.logger.info("Transaction is Successfully deleted!");
							} else {
								SimpleLogger.logger.info("failed to delete");
	
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							SimpleLogger.logger.warning(e.toString());
						}
						break;
					
					case 5:
						SimpleLogger.logger.info("Exiting... ");
						System.exit(0);
						break;

					default:
	//					System.out.println("Enter the Transaction type: ");
						SimpleLogger.logger.info("Enter the valid Transaction type [1-5]: ");
	
						choice = TransactionMethods.scannerMethod().nextInt();
	
						break;
					}
					SimpleLogger.logger.info("Do you want to continue? (Y/N)");
					option = TransactionMethods.scannerMethod().next().charAt(0);
					SimpleLogger.logger.info(Character.toString(option));
				} while ((option == 'Y') || (option == 'y'));
			
			SimpleLogger.logger.info("Exiting from progarm... Thank You!!!");
			
			} catch (InputMismatchException imex) {
				SimpleLogger.logger.info(imex.getMessage());
			}
		}
}
