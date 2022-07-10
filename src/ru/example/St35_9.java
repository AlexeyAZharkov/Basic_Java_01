package ru.example;

public class St35_9 {
    public static void main(String[] args) {
        // инициализация анализаторов для проверки в порядке данного набора анализаторов
        String[] spamKeywords = {"spam", "bad"};
        int commentMaxLength = 40;
        TextAnalyzer[] textAnalyzers1 = {
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength)
        };
        TextAnalyzer[] textAnalyzers2 = {
                new SpamAnalyzer(spamKeywords),
                new TooLongTextAnalyzer(commentMaxLength),
                new NegativeTextAnalyzer()
        };
        TextAnalyzer[] textAnalyzers3 = {
                new TooLongTextAnalyzer(commentMaxLength),
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer()
        };
        TextAnalyzer[] textAnalyzers4 = {
                new TooLongTextAnalyzer(commentMaxLength),
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(spamKeywords)
        };
        TextAnalyzer[] textAnalyzers5 = {
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(spamKeywords),
                new TooLongTextAnalyzer(commentMaxLength)
        };
        TextAnalyzer[] textAnalyzers6 = {
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength),
                new SpamAnalyzer(spamKeywords)
        };
        // тестовые комментарии
        String[] tests = new String[8];
        tests[0] = "This comment is so good.";                            // OK
        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
        tests[4] = "This comment is so bad....";                          // SPAM
        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
        TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3,
                textAnalyzers4, textAnalyzers5, textAnalyzers6};
        St35_9 testObject = new St35_9();
        int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
        for (String test : tests) {
            numberOfAnalyzer = 1;
            System.out.print("test #" + numberOfTest + ": ");
            System.out.println(test);
            for (TextAnalyzer[] analyzers : textAnalyzers) {
                System.out.print(numberOfAnalyzer + ": ");
                System.out.println(testObject.checkLabels(analyzers, test));
                numberOfAnalyzer++;
            }
            numberOfTest++;
        }


    }
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        return Label.OK;
    }

    static abstract class KeywordAnalyzer implements TextAnalyzer{

        public abstract String getKeywords();
        public abstract Label getLabel();
    }

    static class SpamAnalyzer extends KeywordAnalyzer {
        private String[] keywords;

        SpamAnalyzer(String[] arr){
            keywords = arr.clone();
        }

        public String getKeywords() {
            return null;
        }

        public Label getLabel() {
            return null;
        }

        @Override
        public Label processText(String text) {
            return null;
        }
    }

    static class NegativeTextAnalyzer extends KeywordAnalyzer {
        NegativeTextAnalyzer(){}

        public String getKeywords() {
            return null;
        }

        public Label getLabel() {
            return null;
        }

        @Override
        public Label processText(String text) {
            return null;
        }
    }

    static class TooLongTextAnalyzer implements TextAnalyzer {
        private int maxLength;
        TooLongTextAnalyzer(int howLong){
            maxLength = howLong;
        }

        @Override
        public Label processText(String text) {
            return null;
        }
    }

    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }

    interface TextAnalyzer {
        Label processText(String text);
    }

}
