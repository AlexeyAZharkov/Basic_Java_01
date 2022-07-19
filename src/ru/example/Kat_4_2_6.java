package ru.example;

public class Kat_4_2_6 {
    public static void main(String[] args) {

    }

    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
//        try {
//            return bankWorker.checkClientForCredit(bankClient);
//        } catch (BadCreditHistoryException e) {
//            System.out.println("Проблемы с банковской историей");
//        } catch (ProblemWithLawException e) {
//        }
        return false;
    }

    class BankClient {}

    interface BankWorker {
        boolean checkClientForCredit(BankClient bankClient);
    }

    class Bank implements BankWorker {

        public boolean checkClientForCredit(BankClient bankClient) {
            return true;
        }
    }

    class BadCreditHistoryException extends RuntimeException{
//        public BadCreditHistoryException(Stringmessage) {
//            super(message);
        }

    }


