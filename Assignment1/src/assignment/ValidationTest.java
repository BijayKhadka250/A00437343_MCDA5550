package assignment;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationTest {

	public static boolean validationMethod(String input) {
		if (input == null || input.trim().isEmpty()) {
//			System.out.println("Empty value: Re-enter the value");
			SimpleLogger.logger.info("Empty value: Re-enter the value");
			return false;
		}
		String io = input.trim();
		Pattern special = Pattern.compile("[!@#$%*+<>?{}:;^]");
		Pattern digits = Pattern.compile("[0-9]");

		Matcher ms = special.matcher(io);
		Matcher md = digits.matcher(io);

		if (ms.find() || md.find()) {
//			System.out.println("Invalid data: Re-enter value:");
			SimpleLogger.logger.info("Invalid data: Re-enter value:");
			return false;
		} else {
//			System.out.println("valid data:");
			SimpleLogger.logger.info("valid data:");
		}
		return true;
	}

	public static boolean isEmpyAllField(String value) {
		if (value == null || value.trim().isEmpty()) {
//			System.out.println("You can't enter a empty value");
			SimpleLogger.logger.info("You can't enter a empty value");
			return false;
		}
		return true;
	}

	public static Long validationCerditCard(Scanner sc) {
		Long cardNumber = sc.nextLong();
		while (cardNumber == null) {
			SimpleLogger.logger.warning("You can't enter a empty value");
			cardNumber = sc.nextLong();
		}
		if (cardNumber != null)
			SimpleLogger.logger.info("Valid input");
		return cardNumber;

	}

	public static void expireDateValidation(Transaction trans) {
		String ExpireDate = TransactionMethods.scannerMethod().nextLine();
		String[] monthYear = ExpireDate.split("\\/");
		String month = monthYear[0];
		String year = monthYear[1];
		int yearNum = Integer.parseInt(year);
		int yearLastDigit = yearNum % 2000;
		int monthNum = Integer.parseInt(month);
		int monthCheck = monthNum % 10;
		if (monthCheck >= 1 && monthNum <= 12) {
			if (yearLastDigit >= 16 && yearLastDigit <= 31) {
				trans.setExpDate(ExpireDate);

			} else {
				SimpleLogger.logger.info("not valid year ");
				// not valid expireDate setting to default 01/2025
				trans.setExpDate("01/2025");
			}
		} else {
			trans.setExpDate("01/2025");
		}
	}

	// validation for Varchar..
	public static String validateVar(Scanner sc) {
		String finalName;
		do {
			while (!sc.hasNextLine()) {
//				System.out.println("Enter value not valid!!");
				SimpleLogger.logger.info("Enter value not valid!!");
			}
			finalName = sc.nextLine();
		} while (!ValidationTest.validationMethod(finalName));
//		System.out.println("Valid input: " + finalName);
		SimpleLogger.logger.info("Valid input: " + finalName);

		return finalName;
	}
}
