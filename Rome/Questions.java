package com.example.hoangnguyen.questionaires;

/*------------------------------------------------------------------------------------------------*/

public class Questions {

    public String mQuestions[] = {
            "How old is Rome?",
            "How old is Ryan?",
            "How old is Zac?",
            "How old is Tanja?",
            "How old is Rocky?"
    };

    private String mChoices [][] = {
            {"19", "20", "21", "22"},
            {"19", "20", "21", "22"},
            {"19", "20", "21", "22"},
            {"19", "20", "21", "22"},
            {"19", "20", "21", "22"}
    };

/*------------------------------------------------------------------------------------------------*/

    private String mCorrectAnswers [] = {
            "22","22","22","22","22"
    };

/*------------------------------------------------------------------------------------------------*/

    public String getQuestion (int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1 (int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2 (int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3 (int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4 (int a) {
        String choice = mChoices[a][3];
        return choice;
    }

/*------------------------------------------------------------------------------------------------*/

    public String getCorrectAnswer (int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    };

}
